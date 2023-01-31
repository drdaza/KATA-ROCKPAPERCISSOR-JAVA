package com.factoriaf5.rps.application;

import com.factoriaf5.rps.models.Paper;
import com.factoriaf5.rps.models.Player;
import com.factoriaf5.rps.models.Rock;
import com.factoriaf5.rps.models.Scissors;

public class NormalRules implements Rules {
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
}
