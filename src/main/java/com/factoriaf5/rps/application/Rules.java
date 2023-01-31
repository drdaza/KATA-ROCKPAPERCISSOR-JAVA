package com.factoriaf5.rps.application;

import com.factoriaf5.rps.models.Player.Player;

public interface Rules {
    public Player checkWinner(Player FirstPlayer, Player SecondPlayer);
    public Player checkLoser(Player FirstPlayer, Player SecondPlayer);
}
