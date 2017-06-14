package com.example.android.tourguide;

/**
 * Created by billwen on 2017/6/11.
 */

public class Site {
    private String mName;
    private String mDescription;
    private String mAddress;
    private int mImageResource;
    private String mTelephoneNumber;
    private String mOpeningTime;

    public Site(String name, String address, int imageResource, String description) {
        mName = name;
        mAddress = address;
        mImageResource = imageResource;
        mDescription = description;
    }

    public Site(String name, String description, String address, String telephoneNumber, String openingTime) {
        mName = name;
        mDescription = description;
        mAddress = address;
        mTelephoneNumber = telephoneNumber;
        mOpeningTime = openingTime;
    }

    public String getName() {
        return mName;
    }

    public String getAddress() {
        return mAddress;
    }

    public int getImageResource() {
        return mImageResource;
    }

    public String getDescription() {
        return mDescription;
    }

    public String getTelephoneNumber() {
        return mTelephoneNumber;
    }

    public String getOpeningTime() {
        return mOpeningTime;
    }

}
