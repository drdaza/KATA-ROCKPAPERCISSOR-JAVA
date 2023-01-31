package com.factoriaf5.rps.application;

import java.util.ArrayList;

import com.factoriaf5.rps.models.Player.Player;


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

        Player winner = rules.checkWinner(Players.get(0), Players.get(1));
        if(winner != null){
        Player loser = rules.checkLoser(Players.get(0), Players.get(1));

        String result = String.format("the winner is: %s %s beats %s", winner.getNickName(), winner.getSelection().toString(),  loser.getSelection().toString());

        return result;
        }
        return "we have not a winner";
    }
}
