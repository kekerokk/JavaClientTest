package com.kv.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.kv.myapplication1.databinding.ActivityMainBinding;

import java.io.IOException;
import java.net.Socket;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding __binding;
    private Object Socket;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*__binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(__binding.getRoot());*/

        __binding.button.setOnClickListener(view -> {
            try {
                Repos Connection = new Repos();
                Connection.sendMessage();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

    }
}