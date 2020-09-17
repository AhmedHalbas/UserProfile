package com.example.userprofile;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentTransaction;

import com.asksira.bsimagepicker.BSImagePicker;
import com.asksira.bsimagepicker.Utils;
import com.bumptech.glide.Glide;


public class EditPictureFragment extends MyDialogFragment implements BSImagePicker.OnSingleImageSelectedListener,
        BSImagePicker.ImageLoaderDelegate,
        BSImagePicker.OnSelectImageCancelledListener {


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        BSImagePicker singleSelectionPicker = new BSImagePicker.Builder("com.example.userprofile")

                .setSpanCount(3)
                .hideCameraTile()
                .hideGalleryTile()
                .setGridSpacing(Utils.dp2px(7))
                .build();

        FragmentTransaction fragmentTransaction = getChildFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.image_picker_fragment, singleSelectionPicker);
        fragmentTransaction.commit();


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_edit_picture, container, false);
    }


    @Override
    public void loadImage(Uri imageUri, ImageView ivImage) {

        Glide.with(this).load(imageUri).into(ivImage);


    }


    @Override
    public void onCancelled(boolean isMultiSelecting, String tag) {

    }

    @Override
    public void onSingleImageSelected(Uri uri, String tag) {
        dismiss();

    }
}


