package com.example.userprofile.ui.authentication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.example.userprofile.R;


public class ChangePasswordFragment extends Fragment implements View.OnClickListener {

    private NavController navController;
    private Button changePasswordBtn;
    private ImageView backBtn;

    public ChangePasswordFragment() {
        // Required empty public constructor
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        navController = Navigation.findNavController(view);
        changePasswordBtn = view.findViewById(R.id.change_password_btn);
        backBtn = view.findViewById(R.id.back_btn);

        changePasswordBtn.setOnClickListener(this);
        backBtn.setOnClickListener(this);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_change_password, container, false);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.change_password_btn:
                navController.navigate(R.id.action_changePasswordFragment_to_profileFragment);
                break;


            case R.id.back_btn:
                navController.navigate(R.id.action_changePasswordFragment_to_verificationFragment);
                break;

        }

    }
}
