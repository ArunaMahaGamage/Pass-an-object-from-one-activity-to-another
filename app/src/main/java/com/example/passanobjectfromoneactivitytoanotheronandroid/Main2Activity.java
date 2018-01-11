package com.example.passanobjectfromoneactivitytoanotheronandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Date;

public class Main2Activity extends AppCompatActivity {

    TextView tv_showdata;
    TextView tv_show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tv_showdata = (TextView) findViewById(R.id.tv_showdata);
        tv_show = (TextView) findViewById(R.id.tv_show);

        Intent i = getIntent();

        // Serializable
//        Date date = (Date) i.getSerializableExtra("sampleObject");

        BeanSerializable beanSerializable = (BeanSerializable) i.getSerializableExtra("sampleObject");

        // Parcelable
        Bean bean = (Bean) getIntent().getExtras().getParcelable("bean");

        tv_showdata.setText(beanSerializable.getName());

        tv_show.setText(bean.getName());
    }
}
