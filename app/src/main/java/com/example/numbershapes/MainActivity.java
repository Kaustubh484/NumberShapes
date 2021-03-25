package com.example.numbershapes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    class Number{
        double numbyuser;
        public boolean isTriangular(){
            int x=1;
            int triangularnumber=1;
            while(triangularnumber<numbyuser){
                x++;
                triangularnumber= x*(x+1)/2;
            }if (triangularnumber==numbyuser){
                return true;

            }else{
                return  false;
            }
        }
        public boolean isSquare(){
            double sqrtnumbyuser= Math.sqrt(numbyuser);
            if(sqrtnumbyuser==Math.floor(sqrtnumbyuser)){
                return  true;
            }else{
                return  false;
            }
        }
    }
    public void check(View view){
        Number num = new Number();
        EditText number= (EditText) findViewById(R.id.number);
        String numbergivenbyuser= number.getText().toString();
        if(number.getText().toString().isEmpty()){
            Toast.makeText(this,"Please enter a number",Toast.LENGTH_LONG).show();
        }else {
            num.numbyuser = Double.parseDouble(numbergivenbyuser);

            if (num.isTriangular() && num.isSquare()) {
                numbergivenbyuser += " is   a triangular number as well as a square number";

            } else if (num.isSquare()) {
                numbergivenbyuser += " is a square number";
            } else if (num.isTriangular()) {
                numbergivenbyuser += " is a triangular number";

            } else {
                numbergivenbyuser += "is not  a triangular number or a square number";
            }
            Toast.makeText(this, numbergivenbyuser, Toast.LENGTH_LONG).show();
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}