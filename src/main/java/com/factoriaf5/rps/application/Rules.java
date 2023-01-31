package com.factoriaf5.rps.application;

import com.factoriaf5.rps.models.Player;

public interface Rules {
    public Player checkWinner(Player FirstPlayer, Player SecondPlayer);
    
}
