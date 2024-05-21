package com.labwork7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * PlayspaceLoader class
 */
public class PlayspaceLoader {
    /**
     * Load playspace from file
     * @param filePath Path to the file
     * @return Playspace object
     * @throws IOException If an I/O error occurs
     */
    public Playspace loadFromFile(String filePath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        int length = 0;
        int width = 0;

        while ((line = reader.readLine()) != null) {
            String[] parts = line.split("=");
            if (parts[0].trim().equalsIgnoreCase("length")) {
                length = Integer.parseInt(parts[1].trim());
            } else if (parts[0].trim().equalsIgnoreCase("width")) {
                width = Integer.parseInt(parts[1].trim());
            }
        }

        reader.close();

        Playspace playspace = new Playspace.Builder()
                .setLength(length)
                .setWidth(width)
                .build();

        return playspace;
    }
}
