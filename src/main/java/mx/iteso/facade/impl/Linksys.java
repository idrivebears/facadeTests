package mx.iteso.facade.impl;

import mx.iteso.facade.Router;

public class Linksys  implements Router {
    public boolean isTurnedOn = false;
    public boolean internetOK = false;
    public void on() {
        System.out.println("Linksys router is ON");
        isTurnedOn = true;
    }

    public void off() {
        System.out.println("Linksys router is OFF");
        isTurnedOn = false;
    }

    public void checkInternet() {
        System.out.println("Checking internet connection");
        System.out.println("Internet connection is OK");
        internetOK = true;
    }
}
