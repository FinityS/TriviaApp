package com.finitydevelopment.triviaapp;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private static final int NUMBER_OF_QUESTIONS = 6;

    private TextView questionTextView;
    private Button trueButton;
    private Button falseButton;

    private Button submitButton;

    private RadioGroup radioGroup;
    private RadioButton radioOne;
    private RadioButton radioTwo;
    private RadioButton radioThree;
    private RadioButton radioFour;

   // private QuestionAnswer[] triviaArray = new QuestionAnswer[NUMBER_OF_QUESTIONS];

    private int currentQuestion = 0;
    private int totalCorrect = 0;

    //triviaArray[0] = new QuestionAnswer(R.strin)


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Fisher–Yates shuffle array function

        //Let's do this baby

        int x =0;

    }

    private void shuffleArray(QuestionAnswer[] array)
    {
        int index;
        QuestionAnswer temp;
        Random random = new Random();
        for (int i = array.length - 1; i > 0; i--)
        {
            index = random.nextInt(i + 1);
            temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
    }
}
