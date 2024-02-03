package com.example.emilypanfilovgame;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private TextView tv1;
    private TextView tv2;
    private TextView tv3;
    private TextView tv4;
    private TextView tv5;
    private TextView tv6;
    private EditText et1;
    private EditText et2;
    private EditText et3;
    private ImageView iv1;
    private ImageView iv2;
    private ImageView iv3;
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    int num1,num2,num3,num4;
    String str_answer1,str_answer2,str_answer3;
    int int_answer1,int_answer2,int_answer3,int_sum1,int_sum2,int_sum3;
    Random rnd;
    String finish;
    int count;
    int score;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1=findViewById(R.id.tv1);
        tv2=findViewById(R.id.tv2);
        tv3=findViewById(R.id.tv3);
        tv4=findViewById(R.id.tv4);
        tv5=findViewById(R.id.tv5);
        tv6=findViewById(R.id.tv6);
        et1=(EditText)findViewById(R.id.et1);
        et2=(EditText)findViewById(R.id.et2);
        et3=(EditText)findViewById(R.id.et3);
        iv1=(ImageView) findViewById(R.id.iv1);
        iv2=(ImageView) findViewById(R.id.iv2);
        iv3=(ImageView) findViewById(R.id.iv3);
        btn1=(Button) findViewById(R.id.btn1);
        btn2=(Button) findViewById(R.id.btn2);
        btn3=(Button) findViewById(R.id.btn3);
        btn4=(Button) findViewById(R.id.btn4);
        btn1.setBackgroundColor(Color.rgb(30,210,230));
        btn2.setBackgroundColor(Color.rgb(30,210,230));
        btn3.setBackgroundColor(Color.rgb(30,210,230));
        btn4.setBackgroundColor(Color.rgb(220,80,250));
        iv1.setImageResource(R.drawable.question);
        iv2.setImageResource(R.drawable.question);
        iv3.setImageResource(R.drawable.question);
        count=0;

        rnd=new Random();
        num1=rnd.nextInt(90)+10;
        num2=rnd.nextInt(90)+10;
        tv1.setText(num1+"");
        tv2.setText(num2+"");

    }
    public void check1(View view) {
        str_answer1=et1.getText().toString();
        int_answer1=Integer.parseInt(str_answer1);
        if(int_answer1==num1+num2){
            iv1.setImageResource(R.drawable.v);
            count++;
        }
        else
            iv1.setImageResource(R.drawable.x);
        int_sum1=num1+num2;
        tv3.setText(int_sum1+"");
        num3=rnd.nextInt(90)+10;
        tv4.setText(num3+"");
    }



    public void check2(View view) {
        str_answer2=et2.getText().toString();
        int_answer2=Integer.parseInt(str_answer2);
        if(int_answer2==num3+int_sum1){
            iv2.setImageResource(R.drawable.v);
            count++;
        }
        else
            iv2.setImageResource(R.drawable.x);
        int_sum2=num3+int_sum1;
        tv5.setText(int_sum2+"");
        num4=rnd.nextInt(90)+10;
        tv6.setText(num4+"");

    }


    public void check3(View view) {
        str_answer3=et3.getText().toString();
        int_answer3=Integer.parseInt(str_answer3);
        if(int_answer3==num4+int_sum2){
            iv3.setImageResource(R.drawable.v);
            count++;
        }
        else
            iv3.setImageResource(R.drawable.x);
        int_sum3=num4+int_sum2;
        tv1.setText(int_sum3+"");
        score=(int) (((double)count/3)*100);
        finish=count+"/3"+","+score+"%";
        Toast.makeText(MainActivity.this, finish, Toast.LENGTH_LONG).show();

    }

    public void restart(View view) {
        num1=rnd.nextInt(90)+10;
        num2=rnd.nextInt(90)+10;
        tv1.setText(num1+"");
        tv2.setText(num2+"");
        tv3.setText("num");
        tv4.setText("num");
        tv5.setText("num");
        tv6.setText("num");
        iv1.setImageResource(R.drawable.question);
        iv2.setImageResource(R.drawable.question);
        iv3.setImageResource(R.drawable.question);
        et1.setText(null);
        et2.setText(null);
        et3.setText(null);
        count=0;

    }
}