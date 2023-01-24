package com.factoriaf5.rps.models;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PaperTest {
    @Test
    public void is_Paper() {
        Figure paper = new Paper();
        assertTrue(paper instanceof Paper);
    }
}
