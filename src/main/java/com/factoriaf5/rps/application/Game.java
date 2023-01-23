package com.factoriaf5.rps.application;

import java.util.ArrayList;

public class Game {
    
    private ArrayList<Player> Players;

    public Game(){
        Players = new ArrayList<>(2);
    }

    public void setPlayer(Player player){
        Players.add(player);
    }
    public ArrayList<Player> getPlayer(){
        return Players;
    }
    
}
