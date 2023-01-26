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

    public Player checkWinner(Player FirstPlayer, Player SecondPlayer){
        if (FirstPlayer.getSelection() instanceof Rock && SecondPlayer.getSelection() instanceof Scissors)
        return FirstPlayer;
        if(FirstPlayer.getSelection() instanceof Rock && SecondPlayer.getSelection() instanceof Paper)
        return SecondPlayer;
        if(FirstPlayer.getSelection() instanceof Scissors && SecondPlayer.getSelection() instanceof Paper)
        return FirstPlayer;
        if (FirstPlayer.getSelection() instanceof Scissors && SecondPlayer.getSelection() instanceof Rock)
        return SecondPlayer;
        if(FirstPlayer.getSelection() instanceof Paper && SecondPlayer.getSelection() instanceof Rock)
        return FirstPlayer;
        if(FirstPlayer.getSelection() instanceof Paper && SecondPlayer.getSelection() instanceof Scissors)
        return SecondPlayer;
        return null;
    }
    public String initGame() {
        Player loser = new Player(null);
        Player winner = checkWinner(Players.get(0), Players.get(1));
        for (Player player : Players) {
            if(player.getNickName() != winner.getNickName()) loser = player;
        } 
        String result = String.format("the winner is: %s %s beats %s", winner.getNickName(),winner.getSelection(), loser.getSelection());

        return result;
    }
}
