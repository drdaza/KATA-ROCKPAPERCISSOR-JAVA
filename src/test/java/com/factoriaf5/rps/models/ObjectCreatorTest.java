package com.factoriaf5.rps.models;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.factoriaf5.rps.models.Player.ObjectCreator;

public class ObjectCreatorTest {
    @Test
    public void testCreate() {
        ObjectCreator object = new ObjectCreator();

        Figure selection =object.create("Rock");
        assertTrue(selection instanceof Rock);
    }
}
