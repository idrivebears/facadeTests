package mx.iteso;

import mx.iteso.facade.SoundSystem;
import mx.iteso.facade.VideoGame;
import mx.iteso.facade.impl.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestComponents
{
    @Test
    public void testXbox()
    {
        XBOX box = new XBOX();
        
        box.on();
        assertEquals(box.isTurnedOn, true);

        box.off();
        assertEquals(box.isTurnedOn, false);
    }

    @Test
    public void testBose()
    {
        Bose bose = new Bose();
        
        bose.on();
        bose.toOpticalEntry();
        
        assertEquals(bose.isTurnedOn, true);
        assertEquals(bose.input, "Optical");
        
        bose.off();
        assertEquals(bose.isTurnedOn, false);
    }
    
    @Test
    public void testDualShock()
    {
        DualShock controller = new DualShock();

        controller.on();
        assertEquals(controller.isTurnedOn, true);
        
        controller.off();
        assertEquals(controller.isTurnedOn, false);
    }
    
    @Test
    public void testEcoLights()
    {
        EcoLights light = new EcoLights();
        
        light.on();
        assertEquals(light.isTurnedOn, true);
        
        light.off();
        assertEquals(light.isTurnedOn, false);
    }
    
    @Test
    public void testSonyBravia()
    {
        SonyBravia tv = new SonyBravia();
        
        tv.on();
        assertEquals(tv.isTurnedOn, true);
        
        tv.toHDMI();
        assertEquals(tv.input, "HDMI");
        
        tv.off();
        assertEquals(tv.isTurnedOn, false);
    }

    @Test
    public void testLinksys()
    {
        Linksys link = new Linksys();
        
        link.on();
        assertEquals(link.isTurnedOn, true);
        
        link.off();
        assertEquals(link.isTurnedOn, false);
        
        link.checkInternet();
        assertEquals(link.internetOK, true);
    }

    @Test
    public void testPS4()
    {
        PS4Game game = new PS4Game("Destiny");
        
        PS4 ps4 = new PS4();
        
        ps4.insertGame(game);
        ps4.on();
        assertEquals(ps4.isTurnedOn, true);
        
        game.play();
        game.setOnlineMode();
        assertEquals(game.getName(), "Destiny");
        assertEquals(ps4.currentGame, "Destiny");
        assertEquals(game.isPlaying, true);
        assertEquals(game.isOnline, true);
        
        
        ps4.off();
        assertEquals(ps4.isTurnedOn, false);
    }

}
