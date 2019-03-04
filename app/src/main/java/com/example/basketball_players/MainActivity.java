package com.example.basketball_players;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.firebase.FirebaseApp;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
{

    private ListView lv;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FirebaseApp.initializeApp(MainActivity.this);

        for(int i = 0; i < Singleton.bpL.length; i++)
        {
            Singleton.bpL[i] = new basketballPlayers("Fname",0,0,0,0);
        }
        Singleton.aa = new CustomAdapter(MainActivity.this, R.layout.listview_row, Singleton.bpL);
        //Get from FireBase
        this.lv = findViewById(R.id.listview);
        this.lv.setAdapter(Singleton.aa);

        Singleton.aa.notifyDataSetChanged();
        Singleton.listenForDataBaseChanges();

    }
    public void onClickAdd(View v)
    {
        Intent intent = new Intent(this, addPlayersScreen.class);
        startActivity(intent);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Singleton.aa.notifyDataSetChanged();
    }
}
