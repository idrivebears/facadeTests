package mx.iteso;

import mx.iteso.facade.*;
import mx.iteso.facade.impl.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class TestFacade 
{
    VideoGameFacade facadeTest;
    
    TV tv;
    GameConsole console;
    
    Router router;
    Lights lights;

    GameController controller;
    SoundSystem soundSystem;

    @Before
    public void test() 
    {
        tv = mock(TV.class);
        console = mock(GameConsole.class);

        router = mock(Router.class);
        lights = mock(Lights.class);
        
        controller = mock(GameController.class);
        soundSystem = mock(SoundSystem.class);
        facadeTest = new VideoGameFacade(tv, console, controller, soundSystem, router, lights);
    }

    @Test
    public void TestPlayOnlineGame()
    {
        facadeTest.playOnlineGame("Halo");
        
 

        verify(tv, times(1)).on();
        verify(tv, times(1)).toHDMI();

        verify(console, times(1)).on();
        
        verify(controller, times(1)).on();

        verify(console,times(1)).insertGame(any(VideoGame.class));
        
        verify(soundSystem, times(1)).on();
        verify(soundSystem, times(1)).toOpticalEntry();
        
        verify(router, times(1)).on();
        verify(router, times(1)).checkInternet();

        verify(lights, times(1)).off();
    }

    @Test
    public void TestStopPlayingGame()
    {
        facadeTest.stopPlayingGame();

        // Verify these are only called once as well

        verify(lights, times(1)).on();

        verify(tv, times(1)).off();

        verify(controller, times(1)).off();

        verify(console, times(1)).off();

        verify(soundSystem, times(1)).off();

        verify(router, times(1)).off();
    }
}
