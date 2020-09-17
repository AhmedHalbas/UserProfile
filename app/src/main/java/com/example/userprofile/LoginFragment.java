package com.example.userprofile;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;


public class LoginFragment extends Fragment implements View.OnClickListener {

    private NavController navController;
    private Button loginBtn;
    private ImageView backBtn;
    private TextView forgotPasswordtv;

    public LoginFragment() {
        // Required empty public constructor
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        navController = Navigation.findNavController(view);
        loginBtn = view.findViewById(R.id.login_btn);
        backBtn = view.findViewById(R.id.back_btn);
        forgotPasswordtv = view.findViewById(R.id.forgot_password_tv);

        loginBtn.setOnClickListener(this);
        backBtn.setOnClickListener(this);
        forgotPasswordtv.setOnClickListener(this);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.login_btn:
                navController.navigate(R.id.action_loginFragment_to_profileFragment);
                break;

            case R.id.forgot_password_tv:
                navController.navigate(R.id.action_loginFragment_to_resetPasswordFragment);
                break;

            case R.id.back_btn:
                navController.navigate(R.id.action_loginFragment_to_mainFragment);
                break;

        }

    }
}
