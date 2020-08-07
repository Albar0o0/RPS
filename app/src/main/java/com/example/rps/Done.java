package com.example.rps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.LinkedList;
import java.util.Queue;

public class Done extends AppCompatActivity {
    private static final String TAG = "gameplay";
    String username;
    public static final String EXTRA_TEXT = "com.example.application.example.EXTRA_TEXT";
    Button button_home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_done);
        Intent intent = getIntent();
        String text = intent.getStringExtra(Page2Activity.EXTRA_TEXT);

        //set text ke display class gameplay2
        Queue<String> q = new LinkedList<>();
        intent.putExtra(EXTRA_TEXT, username);
        q.add(text);
        username = q.poll();
        TextView nama = findViewById(R.id.name);
        nama.setText(username);

        Button button = findViewById(R.id.Home);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity();
            }
        });

     }
    public void openMainActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
