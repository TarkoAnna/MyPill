package com.diplom.mypill.ui.registration;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.diplom.mypill.R;

public class RegistrationFragment extends Fragment {
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle savedInstanceState) {
        View view = layoutInflater.inflate(R.layout.fragment_registration, viewGroup, false);
        return view;
    }

    public static Fragment newFragment(){
        RegistrationFragment registrationFragment = new RegistrationFragment();
        return registrationFragment;
    }
}
