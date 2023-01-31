package com.factoriaf5.rps.application;

import com.factoriaf5.rps.models.Lizzard;
import com.factoriaf5.rps.models.Paper;
import com.factoriaf5.rps.models.Player;
import com.factoriaf5.rps.models.Rock;
import com.factoriaf5.rps.models.Scissors;
import com.factoriaf5.rps.models.Spock;

public class SheldonRules implements Rules{

    @Override
    public Player checkWinner(Player FirstPlayer, Player SecondPlayer) {
        if (FirstPlayer.getSelection() instanceof Rock && SecondPlayer.getSelection() instanceof Scissors)
        return FirstPlayer;
        if(FirstPlayer.getSelection() instanceof Rock && SecondPlayer.getSelection() instanceof Paper)
        return SecondPlayer;
        if (FirstPlayer.getSelection() instanceof Rock && SecondPlayer.getSelection() instanceof Lizzard)
        return FirstPlayer;
        if(FirstPlayer.getSelection() instanceof Rock && SecondPlayer.getSelection() instanceof Spock)
        return SecondPlayer;

        if(FirstPlayer.getSelection() instanceof Scissors && SecondPlayer.getSelection() instanceof Paper)
        return FirstPlayer;
        if (FirstPlayer.getSelection() instanceof Scissors && SecondPlayer.getSelection() instanceof Rock)
        return SecondPlayer;
        if(FirstPlayer.getSelection() instanceof Scissors && SecondPlayer.getSelection() instanceof Lizzard)
        return FirstPlayer;
        if(FirstPlayer.getSelection() instanceof Scissors && SecondPlayer.getSelection() instanceof Spock)
        return SecondPlayer;

        if(FirstPlayer.getSelection() instanceof Paper && SecondPlayer.getSelection() instanceof Rock)
        return FirstPlayer;
        if(FirstPlayer.getSelection() instanceof Paper && SecondPlayer.getSelection() instanceof Scissors)
        return SecondPlayer;
        if(FirstPlayer.getSelection() instanceof Paper && SecondPlayer.getSelection() instanceof Spock)
        return FirstPlayer;
        if(FirstPlayer.getSelection() instanceof Paper && SecondPlayer.getSelection() instanceof Lizzard)
        return SecondPlayer;

        if(FirstPlayer.getSelection() instanceof Spock && SecondPlayer.getSelection() instanceof Rock)
        return FirstPlayer;
        if(FirstPlayer.getSelection() instanceof Spock && SecondPlayer.getSelection() instanceof Lizzard)
        return SecondPlayer;
        if(FirstPlayer.getSelection() instanceof Spock && SecondPlayer.getSelection() instanceof Scissors)
        return FirstPlayer;
        if(FirstPlayer.getSelection() instanceof Spock && SecondPlayer.getSelection() instanceof Paper)
        return SecondPlayer;

        if(FirstPlayer.getSelection() instanceof Lizzard && SecondPlayer.getSelection() instanceof Spock)
        return FirstPlayer;
        if(FirstPlayer.getSelection() instanceof Lizzard && SecondPlayer.getSelection() instanceof Scissors)
        return SecondPlayer;
        if(FirstPlayer.getSelection() instanceof Lizzard && SecondPlayer.getSelection() instanceof Paper)
        return FirstPlayer;
        if(FirstPlayer.getSelection() instanceof Lizzard && SecondPlayer.getSelection() instanceof Rock)
        return SecondPlayer;
        return null;
    }
    
}
