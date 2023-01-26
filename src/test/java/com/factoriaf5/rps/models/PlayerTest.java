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
        playerOne.choose("Rock");
        assertTrue(playerOne.getSelection() instanceof Rock);
    }
    @Test
    public void Player_choose_Paper(){
        playerOne.choose("Paper");
        assertTrue(playerOne.getSelection() instanceof Paper);
    }
    @Test
    public void Player_choose_Scissors(){
        playerOne.choose("Scissors");
        assertTrue(playerOne.getSelection() instanceof Scissors);
    }
    @Test
    public void Player_choose_Lizzard(){
        playerOne.choose("Lizzard");
        assertTrue(playerOne.getSelection() instanceof Lizzard);
    }
    @Test
    public void Player_choose_Spock(){
        playerOne.choose("Spock");
        assertTrue(playerOne.getSelection() instanceof Spock);
    }
    @Test
    public void Player_choose_diferent_option(){
        playerOne.choose("pepe");
        assertEquals(null, playerOne.getSelection());
    }

}
