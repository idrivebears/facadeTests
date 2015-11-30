package mx.iteso.facade;

import mx.iteso.facade.impl.*;

public class Driver {
    public static void main (String[] args){
        GameConsole ps4 = new PS4();
        GameConsole xbox = new XBOX();
        GameController dualShock = new DualShock();
        Lights lights = new EcoLights();
        Router linksys = new Linksys();
        SoundSystem bose = new Bose();
        TV tv = new SonyBravia();

        VideoGameFacade videoGameFacade = new VideoGameFacade(tv,ps4,dualShock,bose,linksys,lights);

        videoGameFacade.playOnlineGame("Fifa 16");

        videoGameFacade.stopPlayingGame();

        videoGameFacade = new VideoGameFacade(tv,xbox,dualShock,bose,linksys,lights);

        videoGameFacade.playOnlineGame("Halo 5");
    }
}
