package com.wordpress.shibbirweb.currencyconverterclass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText input;
    RadioGroup radioGroup;
    RadioButton rbUsdToBdt, rbBdtToUsd;
    Button btnConvert;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input = (EditText)findViewById(R.id.et_activity_main_input);
        radioGroup = (RadioGroup)findViewById(R.id.rg_activity_main_currency_group);
        rbUsdToBdt = (RadioButton)findViewById(R.id.rb_activity_main_usd_to_bdt);
        rbBdtToUsd = (RadioButton)findViewById(R.id.rb_activity_main_bdt_to_usd);
        btnConvert = (Button)findViewById(R.id.bt_activity_main_convert);
        tvResult = (TextView)findViewById(R.id.tv_activity_main_show_result);


        btnConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!input.getText().toString().equals("")){

                    //Double value = new Double(input.getText().toString());
                    double value = Double.parseDouble(input.getText().toString());

                    if(rbUsdToBdt.isChecked()){
                        value = Convert.usdToBdt(value);
                    }else if (rbBdtToUsd.isChecked()){
                        value = Convert.bdtToUsd(value);
                    }else{
                        Toast.makeText(getApplicationContext(),"Select option",Toast.LENGTH_SHORT).show();
                    }
                    //tvResult.setText(new Double(value).toString());
                    tvResult.setText(value+"");
                }else{
                    Toast.makeText(getApplicationContext(),"input value", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}

class Convert{
    public static double usdToBdt(double usdToBdt){
        double result;
        return result = (usdToBdt*80);
    }

    public static double bdtToUsd(double bdtToUsd){
        double result;
        return result = (bdtToUsd/80);
    }
}
