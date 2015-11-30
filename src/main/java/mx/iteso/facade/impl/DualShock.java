package mx.iteso.facade.impl;

import mx.iteso.facade.GameController;

public class DualShock  implements GameController {
	public bool isTurnedOn = false;
    public void on() {
        System.out.println("DualShock wireless controller is ON");
        isTurnedOn = true;
    }

    public void off() {
        System.out.println("DualShock wireless controller is OFF");
        isTurnedOn = false;
    }
}
