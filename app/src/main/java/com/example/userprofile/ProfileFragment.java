package com.example.userprofile;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;


public class ProfileFragment extends Fragment implements View.OnClickListener {

    private NavController navController;
    private ImageView logOutBtn;
    private TextView editFullName, editEmail, editGender, editAddress, editPassword, removeAccount;
    private ImageView editPicture;

    public ProfileFragment() {
        // Required empty public constructor
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        navController = Navigation.findNavController(view);
        logOutBtn = view.findViewById(R.id.logout_iv);
        editFullName = view.findViewById(R.id.edit_full_name_tv);
        editEmail = view.findViewById(R.id.edit_email_tv);
        editGender = view.findViewById(R.id.edit_gender_tv);
        editAddress = view.findViewById(R.id.edit_location_tv);
        editPassword = view.findViewById(R.id.change_password_profile_btn);
        removeAccount = view.findViewById(R.id.remove_account_btn);
        editPicture = view.findViewById(R.id.change_picture_iv);


        logOutBtn.setOnClickListener(this);
        editFullName.setOnClickListener(this);
        editEmail.setOnClickListener(this);
        editGender.setOnClickListener(this);
        editAddress.setOnClickListener(this);
        editPassword.setOnClickListener(this);
        removeAccount.setOnClickListener(this);
        editPicture.setOnClickListener(this);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile, container, false);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.logout_iv:
                navController.navigate(R.id.action_profileFragment_to_loginFragment);

                break;

            case R.id.edit_full_name_tv:

                EditFullNameFragment editFullNameFragment = new EditFullNameFragment();
                editFullNameFragment.show(getChildFragmentManager(), "EditFullNameFragment");

                break;

            case R.id.edit_email_tv:

                EditEmailFragment editEmailFragment = new EditEmailFragment();
                editEmailFragment.show(getChildFragmentManager(), "EditEmailFragment");

                break;

            case R.id.edit_gender_tv:

                EditGenderFragment editGenderFragment = new EditGenderFragment();
                editGenderFragment.show(getChildFragmentManager(), "EditGenderFragment");

                break;

            case R.id.edit_location_tv:

                EditAddressFragment editAddressFragment = new EditAddressFragment();
                editAddressFragment.show(getChildFragmentManager(), "EditAddressFragment");

                break;

            case R.id.change_password_profile_btn:

                EditPasswordFragment editPasswordFragment = new EditPasswordFragment();
                editPasswordFragment.show(getChildFragmentManager(), "EditPasswordFragment");

                break;


            case R.id.remove_account_btn:

                RemoveAccountFragment removeAccountFragment = new RemoveAccountFragment();
                removeAccountFragment.show(getChildFragmentManager(), "RemoveAccountFragment");

                break;

            case R.id.change_picture_iv:

                EditPictureFragment editPictureFragment = new EditPictureFragment();
                editPictureFragment.show(getChildFragmentManager(), "EditPictureFragment");

                break;


        }
    }
}
