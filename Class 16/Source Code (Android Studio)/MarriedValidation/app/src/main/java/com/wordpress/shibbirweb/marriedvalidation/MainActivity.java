package com.wordpress.shibbirweb.marriedvalidation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText inputBtn;
    RadioButton rbMale, rbFemale;
    Button checkBtn;
    TextView showResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputBtn = (EditText)findViewById(R.id.et_activity_main_input_age);
        rbMale = (RadioButton)findViewById(R.id.rb_activity_main_male);
        rbFemale = (RadioButton)findViewById(R.id.rb_activity_main_female);
        checkBtn = (Button)findViewById(R.id.bt_activity_main_check_btn);
        showResult = (TextView)findViewById(R.id.tv_activity_main_show_result);

        checkBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!inputBtn.getText().toString().equals("")){
                    int age = Integer.parseInt(inputBtn.getText().toString());

                    if(rbMale.isChecked()){
                        if(age < 21){
                            showResult.setText("It is a ballo bibaho");
                        }else{
                            showResult.setText("Halal bibaho");
                        }
                    }else if (rbFemale.isChecked()){
                        if(age < 18){
                            showResult.setText("It is a ballo bibaho");
                        }else{
                            showResult.setText("Halal bibaho");
                        }
                    }else{
                        showToast("Select Gender");
                    }

                }else {
                    showToast("Input Age");
                }
            }
        });
    }

    public void showToast(String message){
        Toast.makeText(getApplicationContext(),message,Toast.LENGTH_SHORT).show();
    }
}
