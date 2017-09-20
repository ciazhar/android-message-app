package com.ciazhar.messageapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ShowMessage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_message);

        TextView showPesan = (TextView) findViewById(R.id.show_pesan);
        Intent intent = getIntent();
        String pesan = intent.getStringExtra("main.pesan");//ambil value pake key nya
        showPesan.setText(pesan);
    }

}
