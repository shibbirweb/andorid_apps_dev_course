package com.mthilapromita.calculatorshibbirahmed;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnadd = (Button)findViewById(R.id.btnsum);
        Button btnsub = (Button)findViewById(R.id.btnsub);
        Button btnmult = (Button)findViewById(R.id.btnmulti);
        Button btndiv = (Button)findViewById(R.id.btndiv);

        final EditText etv = (EditText)findViewById(R.id.edit1);
        final EditText etv2 = (EditText)findViewById(R.id.edit2);
        final TextView result = (TextView)findViewById(R.id.result);

        //addition
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int x = new Integer(etv.getText().toString());
                int y = new Integer(etv2.getText().toString());

                int sum = x + y;
                result.setText("The result of "+x+" + "+y+" = "+sum);
            }
        });

        //subtraction
        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int x = new Integer(etv.getText().toString());
                int y = new Integer(etv2.getText().toString());

                int sub = x - y;
                result.setText("The resutl of "+x+" - "+y+" = "+sub);
            }
        });

        //multiplication
        btnmult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int x = new Integer(etv.getText().toString());
                int y = new Integer(etv2.getText().toString());

                int mult = x * y;
                result.setText("The result of "+x+" * "+y+" = "+mult);
            }
        });

        //division
        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double x = new Double(etv.getText().toString());
                double y = new Double(etv2.getText().toString());

                double div = x / y;
                result.setText("The result of "+x+" / "+y+" = "+div);
            }
        });
    }
}
