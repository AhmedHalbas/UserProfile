package com.example.userprofile.ui.profile.settings;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.userprofile.R;
import com.example.userprofile.util.MyDialogFragment;


public class EditFullNameFragment extends MyDialogFragment implements View.OnClickListener {

    private Button editFullNameBtn;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        editFullNameBtn = view.findViewById(R.id.edit_full_name_btn);

        editFullNameBtn.setOnClickListener(this);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_edit_full_name, container, false);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {

            case R.id.edit_full_name_btn:
                dismiss();
                break;
        }
    }
}


