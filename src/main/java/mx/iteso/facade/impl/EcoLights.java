package mx.iteso.facade.impl;

import mx.iteso.facade.Lights;

public class EcoLights  implements Lights {
    public boolean isTurnedOn = false;
    public void on() {
        System.out.println("EcoLights are ON");
        isTurnedOn = true;
    }

    public void off() {
        System.out.println("EcoLights are OFF");
        isTurnedOn = false;
    }
}
