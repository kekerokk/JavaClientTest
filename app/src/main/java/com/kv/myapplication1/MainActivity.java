package com.kv.myapplication1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.kv.myapplication1.databinding.ActivityMainBinding;

import java.io.IOException;
import java.net.Socket;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding __binding;
    private Object Socket;
    private StateAdapter adapter;
    private List<State> data;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recycler = findViewById(R.id.recycler);
        recycler.setHasFixedSize(true);
        recycler.setLayoutManager(new LinearLayoutManager(this));
        adapter = new StateAdapter(this,data);
        recycler.setAdapter(adapter);
        adapter.notifyItemInserted(this.data.size()-1);

    }

    public void add(View view)
    {
        EditText edit = this.findViewById(R.id.editText);
        this.data.add(new State(edit.getText().toString()));
        edit.setText("");
        adapter.notifyItemInserted(this.data.size()-1);
    }
}