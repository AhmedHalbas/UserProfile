package com.example.userprofile.ui.profile.settings;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;

import com.example.userprofile.R;
import com.example.userprofile.util.MyDialogFragment;


public class RemoveAccountFragment extends MyDialogFragment implements View.OnClickListener {

    private Button removeAccountBtn;
    private NavController navController;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        navController = NavHostFragment.findNavController(this);
        removeAccountBtn = view.findViewById(R.id.remove_account_btn);

        removeAccountBtn.setOnClickListener(this);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_remove_account, container, false);
    }


    @Override
    public void onClick(View view) {

        switch (view.getId()) {

            case R.id.remove_account_btn:
                navController.navigate(R.id.action_profileFragment_to_loginFragment);
                break;
        }

    }
}


