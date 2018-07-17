package com.wordpress.shibbirweb.layoutdesignwithcode;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class DetalisActivity extends AppCompatActivity {

    ImageButton callBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalis);

        callBtn = (ImageButton)findViewById(R.id.ib_activity_details_call);

        callBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:01400000000"));
                startActivity(intent);
            }
        });

    }
}
