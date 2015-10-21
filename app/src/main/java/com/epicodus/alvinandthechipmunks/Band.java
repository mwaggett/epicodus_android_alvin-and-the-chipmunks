package com.epicodus.alvinandthechipmunks;

import java.util.ArrayList;

public class Band {

    private String mName;
    private ArrayList<String> mMembers;
    private ArrayList<String> mAlbums;

    public Band(String name, ArrayList<String> members, ArrayList<String> albums) {
        mName = name;
        mMembers = members;
        mAlbums = albums;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public ArrayList<String> getMembers() {
        return mMembers;
    }

    public void setMembers(ArrayList<String> members) {
        mMembers = members;
    }

    public ArrayList<String> getAlbums() {
        return mAlbums;
    }

    public void setAlbums(ArrayList<String> albums) {
        mAlbums = albums;
    }
}
