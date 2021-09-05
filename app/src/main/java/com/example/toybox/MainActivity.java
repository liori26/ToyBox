package com.example.toybox;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

import static com.example.toybox.R.drawable.circle;
import static com.example.toybox.R.drawable.x;

public class MainActivity extends AppCompatActivity {
    int counter=0;

    int[] arr= new int[]{R.id.button1,R.id.button2,R.id.button3,R.id.button4,R.id.button5,
            R.id.button6,R.id.button7,R.id.button8,R.id.button9};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    Toast toast= new Toast(this);
    toast.setDuration(Toast.LENGTH_LONG);
    toast.setGravity(Gravity.TOP | Gravity.CENTER,0,0);

        LayoutInflater inflater = getLayoutInflater();
        ViewGroup rootlayout= (ViewGroup)findViewById(R.id.root);
        View appearance = inflater.inflate(R.layout.toast_layout,rootlayout);
        toast.setView(appearance);
    toast.show();

    }

    public void send(View view){

        Button btn = (Button)view ;

        if (counter%2==1){
            btn.setBackgroundResource(x);
        }
        else{
        btn.setBackgroundResource(circle);}
        view.setEnabled(false);

        counter++;}

public void restart(View view){
    Intent intent = getIntent(); finish(); startActivity(intent);
}


public void comp() {
    boolean turn = false;
    while (!turn) {

        final int rand = new Random().nextInt((8 - 0) + 1);


    }
    }
}