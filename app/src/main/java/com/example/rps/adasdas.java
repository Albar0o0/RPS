package com.example.rps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.Queue;

public class adasdas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adasdas);
    }
    Queue <String> f;
    protected void onCreate(Bundle savedInstanceState, Queue<String> q){
        f = q;
        onCreate(savedInstanceState);
    }
}
