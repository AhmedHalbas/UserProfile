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


public class RegisterFragment extends Fragment implements View.OnClickListener {

    private NavController navController;
    private Button signupBtn;
    private ImageView backBtn;

    public RegisterFragment() {
        // Required empty public constructor
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        navController = Navigation.findNavController(view);
        signupBtn = view.findViewById(R.id.signup_btn);
        backBtn = view.findViewById(R.id.back_btn);

        signupBtn.setOnClickListener(this);
        backBtn.setOnClickListener(this);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_register, container, false);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.signup_btn:
                navController.navigate(R.id.action_registerFragment_to_profileFragment);
                break;


            case R.id.back_btn:
                navController.popBackStack();
                break;

        }

    }
}
