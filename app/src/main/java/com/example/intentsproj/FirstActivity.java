package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
    }

    public void moveToSecondActivity(View v){
        Context context = getApplicationContext();
        CharSequence message = "Proceeding...";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, message, duration);
        toast.setGravity(Gravity.TOP|Gravity.LEFT,0,0);
        toast.show();

        EditText number01 = (EditText) findViewById(r.id.editTextNumberDecimal);
        EditText number02 = (EditText) findViewById(r.id.editTextNumberDecimal2);


        Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
        intent.putExtra("no1", (Parcelable) number01);
        intent.putExtra("no2", (Parcelable) number02);

        startActivity(intent);
    }

}