package com.pgames.flow;

import androidx.fragment.app.Fragment;

public class CustomFragmentEvent {
    Fragment fragment;
    int id;

    public CustomFragmentEvent(){
        //CustomeFragment is EventBus class
        //Changes make sense
        //My Name Parshuram
        //Hey Bro
    }
    public CustomFragmentEvent(Fragment fragment, int id) {
        this.fragment = fragment;
        this.id = id;
    }

    public CustomFragmentEvent(Fragment fragment) {
        this.fragment = fragment;
    }

    public Fragment getFragment() {
        return fragment;
    }

    public void setFragment(Fragment fragment) {
        this.fragment = fragment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
