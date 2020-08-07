package com.example.rps;

import androidx.appcompat.app.AppCompatActivity;



import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;


public class Page2Activity extends AppCompatActivity {
    public static final String EXTRA_TEXT = "com.example.application.example.EXTRA_TEXT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);


        Button button = findViewById(R.id.buttonP2);
        //button buka class gameplay
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opengameplay();
            }
        });

    }

    public void opengameplay(){
        //variabel nama user
        EditText editText1 = findViewById(R.id.input);
        String text = editText1.getText().toString();

        //set intent dan di pass ke activity gameplay
        Intent intent = new Intent(this, gameplay.class);
        intent.putExtra(EXTRA_TEXT, text);
        startActivity(intent);
    }

}

