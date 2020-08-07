package com.example.rps;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    Animation a,textanim,buttonanim;
    ImageView image;
    TextView textView;
    Button button_next1;


    @SuppressLint("CutPasteId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        a = AnimationUtils.loadAnimation(this, R.anim.splash_animation);
        textanim = AnimationUtils.loadAnimation(this,R.anim.text_animation);
        buttonanim = AnimationUtils.loadAnimation(this,R.anim.button_animation);


        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPage2Activity();
            }
        });

        image = findViewById(R.id.imageView);
        textView = findViewById(R.id.name);
        button_next1 = findViewById(R.id.button);

        //set var punya animasi
        image.setAnimation(a);
        textView.setAnimation(textanim);
        button_next1.setAnimation(buttonanim);




    }
    public void openPage2Activity(){
        Intent intent = new Intent(this, Page2Activity.class);
        startActivity(intent);
    }

}
