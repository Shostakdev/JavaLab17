package com.labwork7;

import java.io.IOException;

/**
 * Main class to test the PlayspaceLoader class
 */
public class Main {
    /**
     * Main method
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        PlayspaceLoader loader = new PlayspaceLoader();
        try {
            Playspace playspace = loader.loadFromFile("playspace_config.txt");
            System.out.println(playspace);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}