package com.latihanandroid.praktikum2mdd;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kasus1button);
    }

    public void tekan(View view) {
        Toast.makeText(this, "tombol ditekan", Toast.LENGTH_SHORT).show();
        setContentView(R.layout.kasus1editteksdancheckbox);
    }

    public void pesan(View view) {
        Toast.makeText(this, "pesanan di kirim!", Toast.LENGTH_SHORT).show();
    }
}
