package com.example.bulbul.cgpacalculator;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    private Button cseFirstSemster,cseSecondSemester,cseThirdSemester,cseFourthSemester,cseFifthSemester,cseSixSemester,cseSevensemester,cseEightSemester;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cseFirstSemster = (Button) findViewById(R.id.cseFirst);
        cseSecondSemester=(Button) findViewById(R.id.cseSecond);
        cseThirdSemester=(Button) findViewById(R.id.cseThird);
        cseFourthSemester= (Button) findViewById(R.id.cseFourth);
        cseFifthSemester= (Button) findViewById(R.id.cseFifth);
        cseSixSemester= (Button) findViewById(R.id.cseSix);
        cseSevensemester= (Button) findViewById(R.id.cseSeven);
        cseEightSemester= (Button) findViewById(R.id.cseEight);



        cseFirstSemster.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cseFirst = new Intent(MainActivity.this,FirstSemester.class);
                startActivity(cseFirst);
            }
        });

        cseSecondSemester.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cseSecond = new Intent(MainActivity.this,SecondSemester.class);
                startActivity(cseSecond);
            }
        });

        cseThirdSemester.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cseThird = new Intent(MainActivity.this,ThirdSemester.class);
                startActivity(cseThird);
            }
        });

        cseFourthSemester.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cseFourth = new Intent(MainActivity.this,FourthSemester.class);
                startActivity(cseFourth);
            }
        });

        cseFifthSemester.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cseFifth = new Intent(MainActivity.this,FifthSemester.class);
                startActivity(cseFifth);
            }
        });

        cseSixSemester.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cseSix = new Intent(MainActivity.this,SixSemester.class);
                startActivity(cseSix);
            }
        });

        cseSevensemester.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cseSeven= new Intent(MainActivity.this,SevenSemester.class);
                startActivity(cseSeven);
            }
        });

        cseEightSemester.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cseEight= new Intent(MainActivity.this,EightSemester.class);
                startActivity(cseEight);
            }
        });



    }

}
