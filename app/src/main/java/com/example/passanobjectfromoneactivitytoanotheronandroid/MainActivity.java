package com.example.passanobjectfromoneactivitytoanotheronandroid;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void passDateObject(View view) {

        Date date = new Date();
        Bean bean = new Bean("Aruna");
        BeanSerializable beanSerializable = new BeanSerializable("Gamage");

        Intent i = new Intent(this, Main2Activity.class);

        // Serializable
        i.putExtra("sampleObject", beanSerializable);

        // Parcelable
        i.putExtra("bean", (Parcelable) bean);
        startActivity(i);

        // In Serializable implements Serializable interface to bean

        // In Parcelable implements Parcelable interface to Bean
    }
}
