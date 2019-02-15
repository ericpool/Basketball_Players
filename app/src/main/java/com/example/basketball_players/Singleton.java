package com.example.basketball_players;

import java.util.ArrayList;

public class Singleton {

    public static basketballPlayers[] bpL = new basketballPlayers[1000];
    public static String[] playerCodes = new String[1000];
    public static int numberOfPlayers = 0;

    public static void addNewPlayer(basketballPlayers bp)
    {
        bpL[numberOfPlayers] = bp;
        playerCodes[numberOfPlayers] = bp.toString();
        numberOfPlayers++;
    }

}