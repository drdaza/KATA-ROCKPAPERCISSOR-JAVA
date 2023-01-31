package com.factoriaf5.rps.models.Player;

import com.factoriaf5.rps.Factories.InterfaceFactory;
import com.factoriaf5.rps.Factories.LizzardFactory;
import com.factoriaf5.rps.Factories.PaperFactory;
import com.factoriaf5.rps.Factories.RockFactory;
import com.factoriaf5.rps.Factories.ScissorsFactory;
import com.factoriaf5.rps.Factories.SpockFactory;
import com.factoriaf5.rps.models.Figure;

public class ObjectCreator {
    private InterfaceFactory factory;

    public Figure create(String selection){
        if (selection == "Rock"){
            factory = new RockFactory();
            return factory.createFigure();
        }
        if (selection == "Paper"){
            factory = new PaperFactory();
            return factory.createFigure();
        }
        if (selection == "Scissors"){
            factory = new ScissorsFactory();
            return factory.createFigure();
        }
        if (selection == "Spock"){
            factory = new SpockFactory();
            return factory.createFigure();
        }
        if (selection == "Lizzard"){
            factory = new LizzardFactory();
            return factory.createFigure();
        }
        return null;
    }
}
