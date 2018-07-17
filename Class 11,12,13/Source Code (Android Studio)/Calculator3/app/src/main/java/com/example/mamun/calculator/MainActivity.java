package com.example.mamun.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public EditText Screen;
    public float numberbefore;
    public float numberafter;
    public String operation;
    public ButtonClickListener Btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Screen = (EditText) findViewById(R.id.screen);
        Screen.setEnabled(false);
        Btn = new ButtonClickListener();
        int idslist[] = {R.id.btn0, R.id.btn1, R.id.btn2,
        R.id.btn3, R.id.btn4, R.id.btn5, R.id.btn6, R.id.btn7,
        R.id.btn8, R.id.btn9, R.id.add, R.id.sub, R.id.mul,
        R.id.div, R.id.dot, R.id.show, R.id.clear};

        for(int id: idslist){
            View v = findViewById(id);
            v.setOnClickListener(Btn);
        }
    }
    public void math (String string){
        numberbefore = Float.parseFloat(Screen.getText().toString());
        operation = string;
        Screen.setText("0");
    }
    public void keyboard (String string){
        String current = Screen.getText().toString();
        if(current.equals("0"))
            current = " ";
            current += string;
            Screen.setText(current);
    }
    public void Result(){
        numberafter = Float.parseFloat
                (Screen.getText().toString());
        float res = 0;
        if (operation.equals("+"))
        {
            res = numberbefore + numberafter;
        }
        if (operation.equals("-"))
        {
            res = numberbefore - numberafter;
        }
        if (operation.equals("*"))
        {
            res = numberbefore * numberafter;
        }
        if (operation.equals("/"))
        {
            res = numberbefore / numberafter;
        }
        Screen.setText(String.valueOf(res));
    }
    public class ButtonClickListener implements View.OnClickListener{
        public void onClick(View v){
            switch (v.getId()){
                case R.id.clear:
                    Screen.setText("0");
                    operation = "";
                    break;
                case R.id.add:
                    math("+");
                    break;
                case R.id.sub:
                    math("-");
                    break;
                case R.id.mul:
                    math("*");
                    break;
                case R.id.div:
                    math("/");
                    break;
                case R.id.show:
                    Result();
                    break;
                 default:
                     String number = ((Button)v).getText().toString();
                     keyboard(number);
                     break;
            }
        }
    }
}
