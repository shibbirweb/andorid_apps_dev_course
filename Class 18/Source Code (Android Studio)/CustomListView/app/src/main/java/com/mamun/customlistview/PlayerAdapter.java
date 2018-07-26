package com.mamun.customlistview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class PlayerAdapter extends ArrayAdapter {

    List<ModelPlayer> userDataInfo = new ArrayList<ModelPlayer>();


    public PlayerAdapter(@NonNull Context context, List<ModelPlayer> userDataInfo) {
        super(context, R.layout.item, userDataInfo);
        this.userDataInfo = userDataInfo;

    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row = inflater.inflate(R.layout.item,parent,false);

        TextView tvName = row.findViewById(R.id.tv_item_name);
        ImageView imgProfile = row.findViewById(R.id.iv_item_profile_pic);
        TextView tvEmail = row.findViewById(R.id.tv_item_email);

        tvName.setText(userDataInfo.get(position).getmName());
        tvEmail.setText(userDataInfo.get(position).getmEmail());
        imgProfile.setImageResource(userDataInfo.get(position).getmImage());

        return row;
    }


}
