package com.example.basketball_players;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class addPlayersScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_players_screen);

    }
    public void onClickAddNew(View v){
        EditText nameET = findViewById(R.id.nameET);
        EditText jerseyET = findViewById(R.id.jerseyET);
        EditText ageET = findViewById(R.id.ageET);
        EditText height_ftET = findViewById(R.id.height_ftET);
        EditText height_inET = findViewById(R.id.height_inET);

        basketballPlayers bp = new basketballPlayers(nameET.getText().toString(),Integer.parseInt(jerseyET.getText().toString()),Integer.parseInt(ageET.getText().toString()),Integer.parseInt(height_ftET.getText().toString()),Integer.parseInt(height_inET.getText().toString()));
        Singleton.addNewPlayer(bp.getAll());
        this.finish();
    }
}
