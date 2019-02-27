package com.example.basketball_players;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;


public class CustomAdapter extends ArrayAdapter

{
    private Context context;

    private int textViewResourceID;
    private basketballPlayers[] basketballPlayersList;

    public CustomAdapter(@NonNull Context context, int textViewResourceID, basketballPlayers[] ar)

    {
        super(context, textViewResourceID, ar);
        this.basketballPlayersList = ar;
        this.context = context;
        this.textViewResourceID = textViewResourceID;

    }

    @Override
    public int getCount() {
        return super.getCount();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        View listItem = convertView;
        if(listItem == null)
        {
            listItem = LayoutInflater.from(this.context).inflate(this.textViewResourceID,parent,false);


        }

        TextView name = listItem.findViewById(R.id.name);
        TextView age = listItem.findViewById(R.id.age);
        TextView jersey = listItem.findViewById(R.id.jersey);
        TextView height = listItem.findViewById(R.id.height);

        basketballPlayers bp = this.basketballPlayersList[position];

        String heightTemp = bp.getHeight_ft()+"\'"+bp.getHeight_in()+"\""; //Android studio didn't want to me concat in the settext
        name.setText(bp.getName());
        age.setText(Integer.toString(bp.getAge()));
        jersey.setText(Integer.toString(bp.getJerseyNum()));
        height.setText(heightTemp);

        return listItem;
    }
}
