package com.epicodus.alvinandthechipmunks;

import java.io.Serializable;
import java.util.ArrayList;

public class Band implements Serializable {

    private String mName;
    private ArrayList<Member> mMembers;
    private ArrayList<String> mAlbums;

    public Band(String name) {
        mName = name;
        mMembers = new ArrayList<Member>();
        mAlbums = new ArrayList<String>();
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public ArrayList<Member> getMembers() {
        return mMembers;
    }

    public void addMember(Member member) {
        mMembers.add(member);
    }

    public ArrayList<String> getAlbums() {
        return mAlbums;
    }

    public void addAlbum(String album) {
        mAlbums.add(album);
    }
}
