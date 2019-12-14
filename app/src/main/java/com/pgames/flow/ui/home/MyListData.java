package com.pgames.flow.ui.home;

import java.io.Serializable;

public class MyListData implements Serializable {

    private String name,
    phone,
    profileStatus;

   // private int imgId;



    public MyListData(String name, String phone, String profileStatus) {
        this.name = name;
        this.phone = phone;
        this.profileStatus = profileStatus;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }


    public String getProfileStatus() {
        return profileStatus;
    }

    public void setProfileStatus(String profileStatus) {
        this.profileStatus = profileStatus;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

//    public int getImgId() {
//        return imgId;
//    }
//
//    public void setImgId(int imgId) {
//        this.imgId = imgId;
//    }
}
