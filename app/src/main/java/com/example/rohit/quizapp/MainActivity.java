package com.example.rohit.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int checkAnswerOne()
    {
        EditText editText = (EditText) findViewById( R.id.answer1 );


        if( editText.getText().toString().length() == 0 )
                return 0;

        if( Integer.valueOf( editText.getText().toString() )== 1947 )
            return 1;
        return 0;
    }

    int checkAnswerTwo()
    {
        CheckBox checkBox1 = (CheckBox) findViewById( R.id.answer21 );
        CheckBox checkBox2 = (CheckBox) findViewById( R.id.answer22 );
        CheckBox checkBox3 = (CheckBox) findViewById( R.id.answer23 );
        CheckBox checkBox4 = (CheckBox) findViewById( R.id.answer24 );

        if( checkBox3.isChecked() || checkBox4.isChecked() )
            return 0;

        if( checkBox2.isChecked() && checkBox1.isChecked() )
            return 1;
        return 0;
    }

    int checkAnswerThree()
    {
        RadioButton radioButton = ( RadioButton ) findViewById( R.id.answer31 );
        RadioButton radioButton2 = ( RadioButton ) findViewById( R.id.answer32 );

        if( radioButton.isChecked() )
            return 1;

        return 0;
    }

    int checkAnswerFour()
    {
        EditText editText = (EditText) findViewById( R.id.answer4 );

        String str = editText.getText().toString();

        if( (str.toLowerCase()).equals("tata") )
                return 1;

        return 0;
    }


    public void checkAnswer(View view)
    {
        int getCorrectAnswer = 0;

          getCorrectAnswer += checkAnswerOne();
          getCorrectAnswer += checkAnswerTwo();
          getCorrectAnswer += checkAnswerThree();
          getCorrectAnswer += checkAnswerFour();


        Toast.makeText( this,"You got "+getCorrectAnswer+" / 4 Correct",Toast.LENGTH_SHORT).show();
    }
}
