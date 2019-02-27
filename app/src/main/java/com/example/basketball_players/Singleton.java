package com.example.basketball_players;

import android.support.annotation.NonNull;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Singleton {

    public static basketballPlayers[] bpL = new basketballPlayers[1000];
    public static String[] playerCodes = new String[1000];
    public static int numberOfPlayers = 0;

    private static FirebaseDatabase myDb = FirebaseDatabase.getInstance();
    public static DatabaseReference myRef = myDb.getReference("basketballPlayers");


    public static void listenForDataBaseChanges()
    {
        ValueEventListener bpListener = new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                System.out.println("**Changes were made to the Database!**");
                for(DataSnapshot ds: dataSnapshot.getChildren())
                {
                    basketballPlayers bp = ds.getValue(basketballPlayers.class);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                System.out.println("loadPost:OnCancelled " + databaseError.toException());
            }
        };
        Singleton.myRef.addValueEventListener(bpListener);
    }

    public static void addNewPlayer(basketballPlayers bp)
    {
        bpL[numberOfPlayers] = bp;
        playerCodes[numberOfPlayers] = bp.toString();
        numberOfPlayers++;
        Singleton.writeBpTooFirebase(bp);
    }
    public static void writeBpTooFirebase(basketballPlayers bp)
    {
        Singleton.myRef.push().setValue(bp);
    }

}