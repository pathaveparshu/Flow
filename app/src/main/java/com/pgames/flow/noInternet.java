package com.pgames.flow;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.pgames.flow.network.CheckInternet;

public class noInternet extends Fragment {
CheckInternet checkInternet;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.fragment_no_internet, container, false);
//        new Thread(new Runnable(){
//            @Override
//            public void run() {
//                try {
//                    if (checkInternet.isOnline()) {
//                        Thread.currentThread().interrupt();
//                        MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container_main, new Login()).commit();
//                       // Thread.currentThread().interrupt();
//                    }
//                } catch (Exception e) {
////                    Thread.currentThread().interrupt();
//                    MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container_main, new noInternet()).commit();
////                  e.printStackTrace();
//                }
//
//            }
//        }).start();

        return view;
    }

}
