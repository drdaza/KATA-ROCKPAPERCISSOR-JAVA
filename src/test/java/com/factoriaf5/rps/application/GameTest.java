package com.factoriaf5.rps.application;

import static org.junit.Assert.*;

import org.junit.Test;


import com.factoriaf5.rps.models.Player.Player;

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

        player1.choose("Rock");
        player2.choose("Paper");

    
        
        assertEquals("the winner is: Player2 Paper beats Rock", game.initGame());

    }
    @Test
    public void second_player2_choose_scissors_player1_choose_paper() {
        game.setPlayer(player1);
        game.setPlayer(player2);

        player1.choose("Paper");
        player2.choose("Scissors");
        
        assertEquals("the winner is: Player2 Scissors beats Paper", game.initGame());
    }
    
    @Test
    public void second_player2_choose_rock_player1_choose_scissors() {
        game.setPlayer(player1);
        game.setPlayer(player2);

        player1.choose("Scissors");
        player2.choose("Rock");
        
        assertEquals("the winner is: Player2 Rock beats Scissors", game.initGame());
    }
    
    @Test
    public void second_player2_choose_rock_player1_choose_paper() {
        game.setPlayer(player1);
        game.setPlayer(player2);

        player1.choose("Paper");
        player2.choose("Rock");
        
        assertEquals("the winner is: Player1 Paper beats Rock", game.initGame());
    }
    
    @Test
    public void second_player2_choose_paper_player1_choose_scissors() {
        game.setPlayer(player1);
        game.setPlayer(player2);

        player1.choose("Scissors");
        player2.choose("Paper");
        
        assertEquals("the winner is: Player1 Scissors beats Paper", game.initGame());
    }
    
    @Test
    public void second_player2_choose_scissors_player1_choose_rock() {
        game.setPlayer(player1);
        game.setPlayer(player2);

        player1.choose("Rock");
        player2.choose("Scissors");
        
        assertEquals("the winner is: Player1 Rock beats Scissors", game.initGame());
    }
    @Test
    public void test_not_have_a_winner(){
        game.setPlayer(player1);
        game.setPlayer(player2);

        player1.choose("Rock");
        player2.choose("Rock");
        
        assertEquals("we have not a winner", game.initGame());
    }
    
}
