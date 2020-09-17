package com.example.userprofile;

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

public class ResetPasswordFragment extends Fragment implements View.OnClickListener {

    private NavController navController;
    private Button resetPasswordBtn;
    private ImageView backBtn;

    public ResetPasswordFragment() {
        // Required empty public constructor
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        navController = Navigation.findNavController(view);
        resetPasswordBtn = view.findViewById(R.id.reset_password_btn);
        backBtn = view.findViewById(R.id.back_btn);

        resetPasswordBtn.setOnClickListener(this);
        backBtn.setOnClickListener(this);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_reset_password, container, false);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.reset_password_btn:
                navController.navigate(R.id.action_resetPasswordFragment_to_verificationFragment);
                break;


            case R.id.back_btn:
                navController.navigate(R.id.action_resetPasswordFragment_to_loginFragment);
                break;

        }

    }
}
