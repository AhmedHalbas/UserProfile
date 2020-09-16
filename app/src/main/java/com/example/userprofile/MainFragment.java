package com.example.userprofile;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class MainFragment extends Fragment implements View.OnClickListener {

    private NavController navController;
    private Button loginBtn,signupBtn;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        navController = Navigation.findNavController(view);
        loginBtn = view.findViewById(R.id.login_page_btn);
        signupBtn = view.findViewById(R.id.signup_page_btn);

        loginBtn.setOnClickListener(this);
        signupBtn.setOnClickListener(this);


    }

    public MainFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onClick(View view) {

            switch(view.getId())
            {
                case R.id.login_page_btn:
                    navController.navigate(R.id.action_mainFragment_to_loginFragment);
                    break;

                case R.id.signup_page_btn:
                    navController.navigate(R.id.action_mainFragment_to_registerFragment);
                    break;


            }

    }
}
