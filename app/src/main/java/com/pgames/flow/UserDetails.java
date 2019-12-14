package com.pgames.flow;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.pgames.flow.ui.register.RegisterDetails;

public class UserDetails extends AppCompatActivity {

    public static FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_details);

        fragmentManager = getSupportFragmentManager();

        fragmentTransaction = fragmentManager.beginTransaction();

        if (findViewById(R.id.fragment_container_userdetails) != null) {
            if (savedInstanceState != null) {
                return;
            }
            RegisterDetails registerDetails = new RegisterDetails();


            fragmentTransaction.add(R.id.fragment_container_userdetails, registerDetails).commit();


        }

        }

    }

