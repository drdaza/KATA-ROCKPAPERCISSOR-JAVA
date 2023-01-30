package com.factoriaf5.rps.application;

import static org.junit.Assert.*;

import org.junit.Test;


import com.factoriaf5.rps.models.Player;


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

        game.getPlayer().get(0).choose("Rock");
        game.getPlayer().get(1).choose("Paper");

        Player winner = game.checkWinner(game.getPlayer().get(0),game.getPlayer().get(1));
        
        assertEquals("Player2", winner.getNickName());
        
    }
    @Test
    public void second_player2_choose_scissors_player1_choose_paper() {
        game.setPlayer(player1);
        game.setPlayer(player2);

        game.getPlayer().get(0).choose("Paper");
        game.getPlayer().get(1).choose("Scissors");

        Player winner = game.checkWinner(game.getPlayer().get(0),game.getPlayer().get(1));
        
        assertEquals("Player2", winner.getNickName());
        
    }
    @Test
    public void second_player2_choose_rock_player1_choose_scissors() {
        game.setPlayer(player1);
        game.setPlayer(player2);

        game.getPlayer().get(0).choose("Scissors");
        game.getPlayer().get(1).choose("Rock");

        Player winner = game.checkWinner(game.getPlayer().get(0),game.getPlayer().get(1));
        
        assertEquals("Player2", winner.getNickName());
        
    }
    @Test
    public void second_player2_choose_rock_player1_choose_paper() {
        game.setPlayer(player1);
        game.setPlayer(player2);

        game.getPlayer().get(0).choose("Paper");
        game.getPlayer().get(1).choose("Rock");

        Player winner = game.checkWinner(game.getPlayer().get(0),game.getPlayer().get(1));
        
        assertEquals("Player1", winner.getNickName());
        
    }
    @Test
    public void second_player2_choose_paper_player1_choose_scissors() {
        game.setPlayer(player1);
        game.setPlayer(player2);

        game.getPlayer().get(0).choose("Scissors");
        game.getPlayer().get(1).choose("Paper");

        Player winner = game.checkWinner(game.getPlayer().get(0),game.getPlayer().get(1));
        
        assertEquals("Player1", winner.getNickName());
        
    }
    @Test
    public void second_player2_choose_scissors_player1_choose_rock() {
        game.setPlayer(player1);
        game.setPlayer(player2);

        game.getPlayer().get(0).choose("Rock");
        game.getPlayer().get(1).choose("Scissors");

        Player winner = game.checkWinner(game.getPlayer().get(0),game.getPlayer().get(1));
        
        assertEquals("Player1", winner.getNickName());
       
    }

    @Test
    public void test_the_winner_is_player_1(){
        game.setPlayer(player1);
        game.setPlayer(player2);

        game.getPlayer().get(0).choose("Rock");
        game.getPlayer().get(1).choose("Scissors");

        assertEquals("the winner is: Player1 Rock beats Scissors", game.initGame());
    }
    @Test
    public void test_the_winner_is_player_2(){
        game.setPlayer(player1);
        game.setPlayer(player2);

        game.getPlayer().get(0).choose("Scissors");
        game.getPlayer().get(1).choose("Rock");

        assertEquals("the winner is: Player2 Rock beats Scissors", game.initGame());
    }
    @Test
    public void test_the_winner_is_player_1_lizzard(){
        game.setPlayer(player1);
        game.setPlayer(player2);

        game.getPlayer().get(0).choose("Scissors");
        game.getPlayer().get(1).choose("Lizzard");

        assertEquals("the winner is: Player1 Scissors beats Lizzard", game.initGame());
    }
    @Test
    public void test_the_winner_is_player_1_Spock(){
        game.setPlayer(player1);
        game.setPlayer(player2);

        game.getPlayer().get(0).choose("Spock");
        game.getPlayer().get(1).choose("Lizzard");

        assertEquals("the winner is: Player2 Lizzard beats Spock", game.initGame());
    }
}
