package com.example.dicerolling;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroup;
    RadioButton radioButton4;
    RadioButton radioButton6;
    RadioButton radioButton8;
    RadioButton radioButton10;
    RadioButton radioButton12;
    RadioButton radioButton20;
    Button button1,button2;
    TextView textView;
    int maxValue;
    int randomValue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup=findViewById(R.id.radioGroup);
        radioButton4=findViewById(R.id.side4);
        radioButton6=findViewById(R.id.side6);
        radioButton8=findViewById(R.id.side8);
        radioButton10=findViewById(R.id.side10);
        radioButton12=findViewById(R.id.side12);
        radioButton20=findViewById(R.id.side20);

        button1=findViewById(R.id.button1);
        button2=findViewById(R.id.button2);
        textView=findViewById(R.id.textView1);

        int selectedId=radioGroup.getCheckedRadioButtonId();

        if(selectedId==R.id.side4){
            maxValue=4;
        }else if(selectedId==R.id.side6){
            maxValue=6;
        }
        else if(selectedId==R.id.side8){
            maxValue=8;
        }
        else if(selectedId==R.id.side10){
            maxValue=10;
        }
        else if(selectedId==R.id.side12){
            maxValue=12;
        }
        else if(selectedId==R.id.side20){
            maxValue=20;
        }

        button1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("DefaultLocale")
            @Override
            public void onClick(View v) {
                int selectedId=radioGroup.getCheckedRadioButtonId();

                if(selectedId==R.id.side4){
                    maxValue=4;
                }else if(selectedId==R.id.side6){
                    maxValue=6;
                }
                else if(selectedId==R.id.side8){
                    maxValue=8;
                }
                else if(selectedId==R.id.side10){
                    maxValue=10;
                }
                else if(selectedId==R.id.side12){
                    maxValue=12;
                }
                else if(selectedId==R.id.side20){
                    maxValue=20;
                }
                randomValue=(int)(Math.random()*maxValue)+1;
                textView.setText(String.format("%d", randomValue));
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId=radioGroup.getCheckedRadioButtonId();

                if(selectedId==R.id.side4){
                    maxValue=4;
                }else if(selectedId==R.id.side6){
                    maxValue=6;
                }
                else if(selectedId==R.id.side8){
                    maxValue=8;
                }
                else if(selectedId==R.id.side10){
                    maxValue=10;
                }
                else if(selectedId==R.id.side12){
                    maxValue=12;
                }
                else if(selectedId==R.id.side20){
                    maxValue=20;
                }
                randomValue=(int)(Math.random()*maxValue)+1;
                textView.setText(""+randomValue);
            }
        });


    }
}