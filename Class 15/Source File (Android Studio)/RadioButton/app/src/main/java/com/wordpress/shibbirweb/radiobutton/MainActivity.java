package com.wordpress.shibbirweb.radiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup rgGender;
    RadioButton rbGender;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rgGender = (RadioGroup)findViewById(R.id.rg_activity_main_gender_group);
        btnSubmit = (Button)findViewById(R.id.btn_activity_main_submit);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int id = rgGender.getCheckedRadioButtonId();
                rbGender = (RadioButton)findViewById(id);

                Toast.makeText(getApplicationContext(),""+rbGender.getText(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
