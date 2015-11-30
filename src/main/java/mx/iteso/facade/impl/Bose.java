package mx.iteso.facade.impl;

import mx.iteso.facade.SoundSystem;

public class Bose implements SoundSystem {
    public boolean isTurnedOn;
    public String input = ""

    public void on() {
        System.out.println("Bose Surround System is turning ON");
        System.out.println("Bose Surround System is ON");
        isTurnedOn = true;

    }

    public void off() {
        System.out.println("Bose Surround System is turning OFF");
        System.out.println("Bose Surround System is OFF");
        isTurnedOn = false;

    }

    public void toOpticalEntry() {
        System.out.println("Changing Bose input to Optical");
        input = "Optical";
    }
}
