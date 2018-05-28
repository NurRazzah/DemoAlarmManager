package com.example.a16022738.demoalarmmanager;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class AlarmReceiverActivity extends AppCompatActivity {

    TextView tvAlarm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm_receiver);

        tvAlarm = (TextView) this.findViewById(R.id.TextView);


    }
}
