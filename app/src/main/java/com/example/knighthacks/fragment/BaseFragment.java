package com.example.knighthacks.fragment;

import androidx.fragment.app.Fragment;

import java.io.File;

public class BaseFragment extends Fragment {
    public File photoFile;
    public String photoFileName = "photo.jpg";
    public static final String TAG = "BaseFragment";
    public static final int CAPTURE_IMAGE_ACTIVITY_REQUEST_CODE = 42;
}