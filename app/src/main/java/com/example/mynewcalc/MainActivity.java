package com.example.mynewcalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class MainActivity extends AppCompatActivity {
    String s = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Remove status bar from this activity
        //getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
    }


    /*

     */
    public void onClick(View v) {
        TextView tv = findViewById(R.id.calcScreen);
        // don't have the exact website; because I'm on my home computer and my wifi gets turned off for google
        int buttonPressed = v.getId();
        final int ONE = 2131230819;
        final int TWO = 2131230820;
        final int THREE = 2131230821;
        final int FOUR = 2131230822;
        final int FIVE = 2131230823;
        final int SIX = 2131230824;
        final int SEVEN = 2131230825;
        final int EIGHT = 2131230826;
        final int NINE = 2131230827;
        final int ZERO = 2131230818;
        final int CLEAR = 2131230828;
        final int DIVIDE = 2131230830;
        final int MULTIPLY = 2131230833;
        final int MINUS = 2131230832;
        final int PLUS = 2131230835;
        final int EQUALS = 2131230831;
        final int DECIMAL = 2131230829;


        if (buttonPressed == ONE) {
            s += "1";
        } else if (buttonPressed == TWO) {
            s += "2";
        } else if (buttonPressed == THREE) {
            s += "3";
        } else if (buttonPressed == FOUR) {
            s += "4";
        } else if (buttonPressed == FIVE) {
            s += "5";
        } else if (buttonPressed == SIX) {
            s += "6";
        } else if (buttonPressed == SEVEN) {
            s += "7";
        } else if (buttonPressed == EIGHT) {
            s += "8";
        } else if (buttonPressed == NINE) {
            s += "9";
        } else if (buttonPressed == ZERO) {
            s += "0";
        } else if (buttonPressed == CLEAR) {
            s = "";
        } else if (buttonPressed == DIVIDE) {
            s += " / ";
        } else if (buttonPressed == MULTIPLY) {
            s += " * ";
        } else if (buttonPressed == MINUS) {
            s += " - ";
        } else if (buttonPressed == PLUS) {
            s += " + ";
        } else if (buttonPressed == DECIMAL) {
            s += ".";
        }
        tv.setText(s);
        if (buttonPressed == EQUALS) {
            // just texted till I got it, not from website, I don't know why I do stuff
            // like that to myself
            tv.setText("");
            solve(s);
            s = "";
        }
    }

    public void solve(String string) {
        TextView tv = findViewById(R.id.calcScreen);
        String nums = string;

        try{
        String[] numList = nums.split(" ");
        String num = numList[0];
        String numDos = numList[2];
        String symbol = numList[1];
        double numOne = Double.parseDouble(num);
        double numTwo = Double.parseDouble(numDos);
            if (symbol.equals("+")) {
                double d = numOne + numTwo;
                //https://www.baeldung.com/java-round-decimal-number
                DecimalFormat df = new DecimalFormat("###.#####");
                String tvAdd = "" + df.format(d);
                tv.setText(tvAdd);
            } else if (symbol.equals("*")) {
                double d = numOne * numTwo;
                DecimalFormat df = new DecimalFormat("###.#####");
                String tvAdd = "" + df.format(d);
                tv.setText(tvAdd);
            } else if (symbol.equals("/")) {
                double d = numOne / numTwo;
                DecimalFormat df = new DecimalFormat("###.#####");
                String tvAdd = "" + df.format(d);
                tv.setText(tvAdd);
            } else if (symbol.equals("-")) {
                double d = numOne - numTwo;
                DecimalFormat df = new DecimalFormat("###.#####");
                String tvAdd = "" + df.format(d);
                tv.setText(tvAdd);
            }
        } catch(Exception e){
//
            tv.setText("ERROR");
        }
//
//            if (symbol.equals("+")) {
//                double d = numOne + numTwo;
//                String tvAdd = "" + d;
//                tv.setText(tvAdd);
//            } else if (symbol.equals("*")) {
//                double d = numOne * numTwo;
//                String tvAdd = "" + d;
//                tv.setText(tvAdd);
//            } else if (symbol.equals("/")) {
//                double d = numOne / numTwo;
//                String tvAdd = "" + d;
//                tv.setText(tvAdd);
//            } else if (symbol.equals("-")) {
//                double d = numOne - numTwo;
//                String tvAdd = "" + d;
//                tv.setText(tvAdd);
//            }
        }
    }

//        }

