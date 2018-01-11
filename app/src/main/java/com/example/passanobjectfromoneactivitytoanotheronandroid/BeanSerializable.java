package com.example.passanobjectfromoneactivitytoanotheronandroid;

import java.io.Serializable;

/**
 * Created by aruna on 1/11/18.
 */

public class BeanSerializable implements Serializable {

    String name;

    public BeanSerializable(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
