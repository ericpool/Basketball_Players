package com.example.basketball_players;

import java.util.ArrayList;

public class Singleton {

    public static ArrayList<String> playerCodes = new ArrayList<>();
    public static int numberOfPlayers = 0;

    public static void addNewPlayer(String s)
    {
        playerCodes.add(s);
        numberOfPlayers++;
    }

}