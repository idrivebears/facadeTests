package mx.iteso.facade.impl;

import mx.iteso.facade.TV;

public class SonyBravia implements TV {
    public String input = "";
    public void on() {
        System.out.println("Sony Bravia is ON");
    }

    public void off() {
        System.out.println("Sony Bravia is OFF");
    }

    public void toHDMI() {
        System.out.println("Changing Sony Bravia input to HDMI");
        input = "HDMI";
    }
}
