package com.example.rps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.Switch;
import android.widget.TextView;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;


public class gameplay extends AppCompatActivity {

    public static final String EXTRA_TEXT = "com.example.application.example.EXTRA_TEXT";
    TextView textView4;
    static TextView winners;
    TextView nama;
    TextView userresult;
    TextView enemyresult;
    TextView userresult2;
    TextView enemyresult2;

    static String firstenemy, username;

    Random rand;
    private static final String TAG = "gameplay";




    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gameplay);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Queue<String> q = new LinkedList<>();



        //ambil intent dari page 2
        Intent intent = getIntent();
        String text = intent.getStringExtra(Page2Activity.EXTRA_TEXT);

        //set text ke display class gameplay

        q.add("Jackson");
        q.add(text);

        firstenemy = q.poll();
        username = q.poll();
        nama = findViewById(R.id.name);
        nama.setText(username);
        textView4 = findViewById(R.id.textView4);
        textView4.setText(firstenemy);
        winners = findViewById(R.id.winners);

        userresult = findViewById(R.id.userresult);
        enemyresult = findViewById(R.id.enemyresult);
        userresult.setText(username);
        enemyresult.setText(firstenemy);
        userresult2 = findViewById(R.id.userresult2);
        enemyresult2 = findViewById(R.id.enemyresult2);



        rand = new Random();
    }

    public void rpsButton(View view) {
        int userSelection = Integer.parseInt(view.getTag().toString());
        Log.i(TAG, "rpsButton: " + userSelection);
        matchGame(userSelection);
    }
    public void matchGame(int userSelection){



        int low = 1 ;
        int high = 3;
        int enemySelection = rand.nextInt(high) + low;




        Intent intent = new Intent(this, gameplay2.class);
        intent.putExtra(EXTRA_TEXT, username);


        if ((userSelection - enemySelection)% 3==1 || userSelection ==1 && enemySelection ==3){
            winners.setText(R.string.userWon);
            startActivity(intent);

        }else if (userSelection == enemySelection) {
        winners.setText(R.string.Drawgame);
        }else{
            winners.setText(R.string.userLose);

        }




        switch (userSelection) {
                case 1:
                    userresult2.setText(R.string.rock);
                    break;
                case 2:
                    userresult2.setText(R.string.paper);
                    break;
                case 3:
                    userresult2.setText(R.string.scissors);
            }

            switch (enemySelection) {
                case 1:
                    enemyresult2.setText(R.string.rock);
                    break;
                case 2:
                    enemyresult2.setText(R.string.paper);
                    break;
                case 3:
                    enemyresult2.setText(R.string.scissors);
            }

}

}


