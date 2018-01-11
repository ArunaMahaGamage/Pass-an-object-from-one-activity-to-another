package com.example.passanobjectfromoneactivitytoanotheronandroid;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by aruna on 1/11/18.
 */

public class Bean implements Parcelable{
    private String name;

    public Bean(String name) {
        this.name = name;
    }

    protected Bean(Parcel in) {
        name = in.readString();
    }

    public static final Creator<Bean> CREATOR = new Creator<Bean>() {
        @Override
        public Bean createFromParcel(Parcel in) {
            return new Bean(in);
        }

        @Override
        public Bean[] newArray(int size) {
            return new Bean[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {

        parcel.writeString(name);

    }
}
