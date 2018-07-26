package com.mamun.customlistview;

public class ModelPlayer {
    int mImage;
    String mName, mEmail;


    public ModelPlayer() {
    }

    public ModelPlayer(int mImage, String mName, String mEmail) {
        this.mImage = mImage;
        this.mName = mName;
        this.mEmail = mEmail;
    }

    public int getmImage() {
        return mImage;
    }

    public void setmImage(int mImage) {
        this.mImage = mImage;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmEmail() {
        return mEmail;
    }

    public void setmEmail(String mEmail) {
        this.mEmail = mEmail;
    }




}
