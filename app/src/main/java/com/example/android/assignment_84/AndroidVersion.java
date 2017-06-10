package com.example.android.assignment_84;

/**
 * Created by CHANDAN on 6/10/2017.
 */

public class AndroidVersion {

    //Declaring the data variables
    private String mAndroidName;
    private String mAndroidVersion;
    private int mImageResourceId;

    /**
     * Constructor to initialize data and images
     * @param androidName
     * @param androidVersion
     * @param imageResourceId
     */
    public AndroidVersion(String androidName, String androidVersion, int imageResourceId){
        mAndroidName = androidName;
        mAndroidVersion = androidVersion;
        mImageResourceId = imageResourceId;
    }
 //getter methods to retrieve the values
    public String getmAndroidName() {
        return mAndroidName;
    }

    public String getmAndroidVersion() {
        return mAndroidVersion;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }
}
