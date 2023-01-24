package com.factoriaf5.rps.models;

import static org.junit.Assert.*;

import org.junit.Test;

public class RockTest {
    
    @Test
    public void is_Rock() {
        Figure rocky = new Rock();
        assertTrue(rocky instanceof Rock);
    }
}
