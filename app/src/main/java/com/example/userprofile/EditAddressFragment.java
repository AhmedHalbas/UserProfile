package com.example.userprofile;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;


public class EditAddressFragment extends MyDialogFragment implements View.OnClickListener {

    private Button editAddressBtn;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        editAddressBtn = view.findViewById(R.id.edit_address_btn);

        editAddressBtn.setOnClickListener(this);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_edit_address, container, false);
    }


    @Override
    public void onClick(View view) {

        switch (view.getId()) {

            case R.id.edit_address_btn:
                dismiss();
                break;
        }
    }
}


