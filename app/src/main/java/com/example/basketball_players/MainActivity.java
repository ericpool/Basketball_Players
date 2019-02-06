package com.example.basketball_players;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,R.layout.listview_layout, Singleton.playerCodes);
        ListView lv = findViewById(R.id.listview);
        lv.setAdapter(arrayAdapter);
    }
    public void onClickAdd(View v){
        Intent intent = new Intent(this, addPlayersScreen.class);
        startActivity(intent);
    }

    @Override
    protected void onResume() {
        super.onResume();
    }
}
