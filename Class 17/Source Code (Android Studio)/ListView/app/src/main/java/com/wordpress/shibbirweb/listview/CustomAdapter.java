package com.wordpress.shibbirweb.listview;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapter extends ArrayAdapter {

    List<String> userDataInfo = new ArrayList<String>();


    public CustomAdapter(@NonNull Context context, List<String> userDataInfo) {
        super(context, R.layout.item, userDataInfo);
        this.userDataInfo = userDataInfo;

    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row = inflater.inflate(R.layout.item,parent,false);

        TextView tvName = row.findViewById(R.id.tv_item_name);

        tvName.setText(userDataInfo.get(position)+"");

        return row;
    }


}
