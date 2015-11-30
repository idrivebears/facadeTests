package mx.iteso.facade.impl;

import mx.iteso.facade.GameConsole;
import mx.iteso.facade.VideoGame;

public class XBOX implements GameConsole {
	
    public boolean isTurnedOn;
    public String currentGame = "";

    public void on() {
        System.out.println("XBOX One is ON");
        isTurnedOn = true;
    }

    public void off() {
        System.out.println("XBOX One is OFF");
        isTurnedOn = false;
    }

    public void insertGame(VideoGame videoGame) {
        System.out.println(videoGame.getName() + " has been inserted into XBOX One");
        currentGame = videoGame;
    }
}
