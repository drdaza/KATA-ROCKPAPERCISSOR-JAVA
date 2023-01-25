package com.factoriaf5.rps.application;

import static org.junit.Assert.*;

import org.junit.Test;

import com.factoriaf5.rps.models.Figure;
import com.factoriaf5.rps.models.Paper;
import com.factoriaf5.rps.models.Player;
import com.factoriaf5.rps.models.Rock;
import com.factoriaf5.rps.models.Scissors;

public class GameTest {
    private Player player1;
    private Player player2;
    private Game game;

    public GameTest(){
        player1 = new Player("Player1");
        player2 = new Player("Player2");
        this.game = new Game();
    }
    
    @Test
    public void second_player2_choose_paper_player1_choose_rock() {
        game.setPlayer(player1);
        game.setPlayer(player2);

        Figure selectionPlayer1 = game.getPlayer().get(0).choose("Rock");
        Figure selectionPlayer2 = game.getPlayer().get(1).choose("Paper");

        Player winner = game.checkWinner(game.getPlayer().get(0),game.getPlayer().get(1));
        
        assertEquals("Player2", winner.getNickName());
        assertTrue(selectionPlayer2 instanceof Paper);
    }
    @Test
    public void second_player2_choose_scissors_player1_choose_paper() {
        game.setPlayer(player1);
        game.setPlayer(player2);

        Figure selectionPlayer1 = game.getPlayer().get(0).choose("Paper");
        Figure selectionPlayer2 = game.getPlayer().get(1).choose("Scissors");

        Player winner = game.checkWinner(game.getPlayer().get(0),game.getPlayer().get(1));
        
        assertEquals("Player2", winner.getNickName());
        assertTrue(selectionPlayer2 instanceof Scissors);
    }
    @Test
    public void second_player2_choose_rock_player1_choose_scissors() {
        game.setPlayer(player1);
        game.setPlayer(player2);

        Figure selectionPlayer1 = game.getPlayer().get(0).choose("Scissors");
        Figure selectionPlayer2 = game.getPlayer().get(1).choose("Rock");

        Player winner = game.checkWinner(game.getPlayer().get(0),game.getPlayer().get(1));
        
        assertEquals("Player2", winner.getNickName());
        assertTrue(selectionPlayer2 instanceof Rock);
    }
    @Test
    public void second_player2_choose_rock_player1_choose_paper() {
        game.setPlayer(player1);
        game.setPlayer(player2);

        Figure selectionPlayer1 = game.getPlayer().get(0).choose("Paper");
        Figure selectionPlayer2 = game.getPlayer().get(1).choose("Rock");

        Player winner = game.checkWinner(game.getPlayer().get(0),game.getPlayer().get(1));
        
        assertEquals("Player1", winner.getNickName());
        assertTrue(selectionPlayer1 instanceof Paper);
    }
    @Test
    public void second_player2_choose_paper_player1_choose_scissors() {
        game.setPlayer(player1);
        game.setPlayer(player2);

        Figure selectionPlayer1 = game.getPlayer().get(0).choose("Scissors");
        Figure selectionPlayer2 = game.getPlayer().get(1).choose("Paper");

        Player winner = game.checkWinner(game.getPlayer().get(0),game.getPlayer().get(1));
        
        assertEquals("Player1", winner.getNickName());
        assertTrue(selectionPlayer1 instanceof Scissors);
    }
    @Test
    public void second_player2_choose_scissors_player1_choose_rock() {
        game.setPlayer(player1);
        game.setPlayer(player2);

        Figure selectionPlayer1 = game.getPlayer().get(0).choose("Rock");
        Figure selectionPlayer2 = game.getPlayer().get(1).choose("Scissors");

        Player winner = game.checkWinner(game.getPlayer().get(0),game.getPlayer().get(1));
        
        assertEquals("Player1", winner.getNickName());
        assertTrue(selectionPlayer1 instanceof Rock);
    }
}
