package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class SecondActivity extends AppCompatActivity {
    int number01=1;
    int number02=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        this.number01 = getIntent().getIntExtra("no1",0);
        this.number02 = getIntent().getIntExtra("no2",0);
    }

    public String plus(){
        int a = number01;
        int b = number02;
        return a+ " + "+ b+ " = "+ (a+b);
    }
    public String minus(){
        int a = number01;
        int b = number02;
        return a+ " - "+ b+ " = "+ (a-b);
    }
    public String multiply(){
        int a = number01;
        int b = number02;
        return a+ " * "+ b+ " = "+ (a*b);
    }
    public String divide(){
        int a = number01;
        int b = number02;
        return a+ " / "+ b+ " = "+ (a/b);
    }

    public void plus(View view) {
        
    }
}