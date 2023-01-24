package com.factoriaf5.rps.application;

import java.util.ArrayList;

import com.factoriaf5.rps.models.Paper;
import com.factoriaf5.rps.models.Player;
import com.factoriaf5.rps.models.Rock;
import com.factoriaf5.rps.models.Scissors;

public class Game {
    
    private ArrayList<Player> Players;

    public Game(){
        Players = new ArrayList<>();
    }

    public void setPlayer(Player player){
        Players.add(player);
    }
    public ArrayList<Player> getPlayer(){
        return Players;
    }

    public Player checkWinner(Player FirstPlayer, Player SecondPLayer){
        if (FirstPlayer.getSelection() instanceof Rock && SecondPLayer.getSelection() instanceof Scissors)
        return FirstPlayer;
        if(FirstPlayer.getSelection() instanceof Rock && SecondPLayer.getSelection() instanceof Paper)
        return SecondPLayer;
        if(FirstPlayer.getSelection() instanceof Scissors && SecondPLayer.getSelection() instanceof Paper)
        return FirstPlayer;
        return null;
    }
}
