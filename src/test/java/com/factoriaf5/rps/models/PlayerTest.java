package com.factoriaf5.rps.models;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PlayerTest {
    Player playerOne;

    public PlayerTest() {
        this.playerOne = new Player("Player1");
    }

    @Test
    public void Player_choose_Rock(){
        Figure rock = playerOne.choose("Rock");
        assertTrue(rock instanceof Rock);
    }
    @Test
    public void Player_choose_Paper(){
        Figure paper = playerOne.choose("Paper");
        assertTrue(paper instanceof Paper);
    }
    @Test
    public void Player_choose_Scissors(){
        Figure scissors = playerOne.choose("Scissors");
        assertTrue(scissors instanceof Scissors);
    }
    @Test
    public void Player_choose_diferent_option(){
        Figure rock = playerOne.choose("pepe");
        assertEquals(null, rock);
    }
}
