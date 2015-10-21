package com.epicodus.alvinandthechipmunks;

import java.io.Serializable;

public class Member implements Serializable{

    private String mName;
    private int mImage;

    public Member(String name, int image) {
        mName = name;
        mImage = image;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public int getImage() {
        return mImage;
    }

    public void setImage(int image) {
        mImage = image;
    }
}
