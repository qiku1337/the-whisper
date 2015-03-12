/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ultimate;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.ultimate.app.WhisperApp;

/**
 * Game main runner.
 * @author raven
 */
public class TheWhisper {
    static private final String Title = "The Whisper";
    static private final int Width = 800;
    static private final int Height = 600;
    
    /**
     * Program entry point.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        config.title = Title;
        config.width = Width;
        config.height = Height;
        config.resizable = false;
        
        new LwjglApplication(new WhisperApp(), config);
    }
}
