package com.factoriaf5.rps.models;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ScissorsTest {
    @Test
    public void is_Scissors(){
        Figure scissors = new Scissors();
        assertTrue(scissors instanceof Scissors);
    }
}
