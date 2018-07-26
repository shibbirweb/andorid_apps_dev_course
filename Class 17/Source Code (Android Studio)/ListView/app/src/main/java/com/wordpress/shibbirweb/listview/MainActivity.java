package com.wordpress.shibbirweb.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView lvNameList;
    List<String> nameList = new ArrayList<>();
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvNameList = (ListView)findViewById(R.id.lv_activity_item);
        nameList.add("Rifat");
        nameList.add("Keka Ferdousi");
        nameList.add("Ferdous");
        nameList.add("Tarek");
        nameList.add("Tarek");
        nameList.add("Tarek");
        nameList.add("Tarek");
        nameList.add("Tarek");
        nameList.add("Tarek");
        nameList.add("Tarek");
        nameList.add("Tarek");
        nameList.add("Tarek");
        nameList.add("Tarek");
        nameList.add("Tarek");
        nameList.add("Tarek");
        nameList.add("Tarek");
        nameList.add("Tarek");
        nameList.add("Tarek");
        nameList.add("Tarek");
        nameList.add("Tarek");
        nameList.add("Tarek");
        nameList.add("Tarek");
        nameList.add("Tarek");
        nameList.add("Tarek");

        adapter = new CustomAdapter(getApplicationContext(), nameList);
        lvNameList.setAdapter(adapter);
    }
}
