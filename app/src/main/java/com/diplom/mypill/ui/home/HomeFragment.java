package com.diplom.mypill.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.diplom.mypill.R;
import com.diplom.mypill.databinding.FragmentHomeBinding;
import com.diplom.mypill.ui.registration.RegistrationFragment;

public class HomeFragment extends Fragment implements View.OnClickListener{
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle savedInstanceState){
        View view = layoutInflater.inflate(R.layout.fragment_home,viewGroup,false);
        return view;
    }

    @Override
    public void onClick(View view){
        switch (view.getId()){
            case R.id.button_registration:
                Fragment fragment = RegistrationFragment1.newFragment();
                getFragmentManager().beginTransaction().add(R.id.nav_registration, fragment).commit();
        }
    }

    public static class RegistrationFragment1 extends Fragment {
        public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle savedInstanceState) {
            View view = layoutInflater.inflate(R.layout.fragment_registration, viewGroup, false);
            return view;
        }

        public static Fragment newFragment(){
            RegistrationFragment1 registrationFragment = new RegistrationFragment1();
            return registrationFragment;
        }
    }
}