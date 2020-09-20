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


public class EditEmailFragment extends MyDialogFragment implements View.OnClickListener {

    private Button editEmailBtn;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        editEmailBtn = view.findViewById(R.id.edit_email_btn);

        editEmailBtn.setOnClickListener(this);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_edit_email, container, false);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {

            case R.id.edit_email_btn:
                dismiss();
                break;
        }
    }
}


