package com.factoriaf5.rps.application;

import java.util.ArrayList;


import com.factoriaf5.rps.models.Player;


public class Game {
    
    private ArrayList<Player> Players;
    private Rules rules;

    public Game(){
        Players = new ArrayList<>();
        rules = new NormalRules();
    }

    public void setPlayer(Player player){
        Players.add(player);
    }
    public ArrayList<Player> getPlayer(){
        return Players;
    }

    public String initGame() {

        Player winenr = rules.checkWinner(Players.get(0), Players.get(1));
        String result = String.format("the winner is: %s", winenr.getNickName());

        return result;
    }
}
