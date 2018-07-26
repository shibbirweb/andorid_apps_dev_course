package com.mamun.customlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    ListView lvPlayerList;

    PlayerAdapter adapter;

    List<ModelPlayer> modelPlayersList = new ArrayList<ModelPlayer>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvPlayerList = (ListView)findViewById(R.id.lv_activity_main_playerlist);

        modelPlayersList.add(new ModelPlayer(R.drawable.tamim_iqbal, "Tamim Iqbal", "tamim@gmail.com"));
        modelPlayersList.add(new ModelPlayer(R.drawable.sabbir_rahman, "Sabbir Rahman", "sabbir@gmail.com"));
        modelPlayersList.add(new ModelPlayer(R.drawable.sakib_al_hasan, "Sakib Al Hasan", "sakib@gmail.com"));
        modelPlayersList.add(new ModelPlayer(R.drawable.mashrafe_mortaza, "Mashrafe Mortaza", "mashrafe@gmail.com"));



        adapter = new PlayerAdapter(getApplicationContext(), modelPlayersList);

        lvPlayerList.setAdapter(adapter);



    }
}
