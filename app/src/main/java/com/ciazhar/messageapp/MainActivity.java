package com.ciazhar.messageapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //contoh implementasi intent antar activity
    public void showMessage(View view) {
        EditText inpPesan = (EditText) findViewById(R.id.inp_pesan);

        String pesan = inpPesan.getText().toString();

        Intent intent = new Intent(this, ShowMessage.class);
        intent.putExtra("main.pesan",pesan);//main.pesan itu nama keynya
        startActivity(intent);
    }

    //contoh implementasi implicit intent/antar aplikasi
    public void callPhone(View view) {
        EditText inputTelephon = (EditText) findViewById(R.id.inp_telp);

        String telp = inputTelephon.getText().toString();
        Uri uri = Uri.parse("tel:"+telp);

        Intent intent = new Intent(Intent.ACTION_DIAL,uri);
        startActivity(intent);
    }
}
