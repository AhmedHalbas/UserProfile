package com.example.userprofile.ui.authentication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.example.userprofile.R;

public class VerificationFragment extends Fragment implements View.OnClickListener {

    private NavController navController;
    private Button verificationBtn;
    private TextView resendCode, changeEmail;


    public VerificationFragment() {
        // Required empty public constructor
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        navController = Navigation.findNavController(view);
        verificationBtn = view.findViewById(R.id.verification_btn);
        changeEmail = view.findViewById(R.id.change_email_tv);


        verificationBtn.setOnClickListener(this);
        changeEmail.setOnClickListener(this);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_verification, container, false);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.verification_btn:
                navController.navigate(R.id.action_verificationFragment_to_changePasswordFragment);
                break;

            case R.id.change_email_tv:
                navController.popBackStack();
                break;


        }

    }
}
