package com.example.cc10624diceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    private Button btnRoll, btnReset, btnClose;
    private Button btnTab1, btnTab2, btnTab3;
    private ImageView imgDice;
    int selectedDice = 1;
    int sides = 6;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnRoll = (Button) findViewById(R.id.btnRoll);
        btnClose = (Button) findViewById(R.id.btnClose);
        btnReset = (Button) findViewById(R.id.btnReset);
        imgDice = (ImageView) findViewById(R.id.imgDice);

        btnTab1 = (Button) findViewById(R.id.btnTab1);
        btnTab2 = (Button) findViewById(R.id.btnTab2);
        btnTab3 = (Button) findViewById(R.id.btnTab3);

        //for selecting dice
        btnTab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (selectedDice != 1) {
                    imgDice.setImageResource(R.drawable.cleverbaby);
                    selectedDice = 1;
                }
            }
        });

        btnTab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (selectedDice != 2) {
                    imgDice.setImageResource(R.drawable.cleverbaby);
                    selectedDice = 2;
                }
            }
        });

        btnTab3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (selectedDice != 3) {
                    imgDice.setImageResource(R.drawable.cleverbaby);
                    selectedDice = 3;
                }
            }
        });

        //for close
        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.exit(0);
            }
        });

        //for reset
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgDice.setImageResource(R.drawable.cleverbaby);
            }
        });

        //for rolling
        btnRoll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDice();
            }
        });

    }

    public void showDice() {
        Random rnd = new Random();
        switch (selectedDice) {
            case 1: sides = 6; break;
            case 2: sides = 10; break;
            case 3: sides = 12; break;
        }
        int rand = rnd.nextInt(sides) + 1;

        switch (selectedDice) {
            case 1: switch(rand) {
                case 1: imgDice.setImageResource(R.drawable.sixsided_one); break;
                case 2: imgDice.setImageResource(R.drawable.sixsided_two); break;
                case 3: imgDice.setImageResource(R.drawable.sixsided_three); break;
                case 4: imgDice.setImageResource(R.drawable.sixsided_four); break;
                case 5: imgDice.setImageResource(R.drawable.sixsided_five); break;
                case 6: imgDice.setImageResource(R.drawable.sixsided_six); break;
            }; break;

            case 2: switch(rand) {
                case 1: imgDice.setImageResource(R.drawable.eightsided_1); break;
                case 2: imgDice.setImageResource(R.drawable.eightsided_2); break;
                case 3: imgDice.setImageResource(R.drawable.eightsided_3); break;
                case 4: imgDice.setImageResource(R.drawable.eightsided_4); break;
                case 5: imgDice.setImageResource(R.drawable.eightsided_5); break;
                case 6: imgDice.setImageResource(R.drawable.eightsided_6); break;
                case 7: imgDice.setImageResource(R.drawable.eightsided_7); break;
                case 8: imgDice.setImageResource(R.drawable.eightsided_8); break;
                case 9: imgDice.setImageResource(R.drawable.eightsided_9); break;
                case 10: imgDice.setImageResource(R.drawable.eightsided_10); break;
            }; break;

            case 3: switch(rand) {
                case 1: imgDice.setImageResource(R.drawable.tensided_1); break;
                case 2: imgDice.setImageResource(R.drawable.tensided_2); break;
                case 3: imgDice.setImageResource(R.drawable.tensided_3); break;
                case 4: imgDice.setImageResource(R.drawable.tensided_4); break;
                case 5: imgDice.setImageResource(R.drawable.tensided_5); break;
                case 6: imgDice.setImageResource(R.drawable.tensided_6); break;
                case 7: imgDice.setImageResource(R.drawable.tensided_7); break;
                case 8: imgDice.setImageResource(R.drawable.tensided_8); break;
                case 9: imgDice.setImageResource(R.drawable.tensided_9); break;
                case 10: imgDice.setImageResource(R.drawable.tensided_10); break;
                case 11: imgDice.setImageResource(R.drawable.tensided_11); break;
                case 12: imgDice.setImageResource(R.drawable.tensided_12); break;
            }; break;
        }

    }
}