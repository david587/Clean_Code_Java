/*
 * File: FileHandler.java
 * Created Date: 2022-11-28
 * Author: Baráth Dávid
 * Github: https://github.com/david587
 * Copyright (c) 2020-2022 Baráth Dávid
 *  
 * GNU GPL v2
 */

package models;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class FileHandler {
    String fileName;

    public void setFileHandlerName() {
        this.fileName = "adat.txt";
    }
    
    public void writeFile(String line) {
        try {
            FileWriter filewriter = new FileWriter(this.fileName, true);
            PrintWriter printwriter = new PrintWriter(filewriter);
            printwriter.println(line);
            printwriter.close();
        } catch (IOException e) {
            System.err.println("Hiba! A fájlbaírás sikertelen!");
        }
    }
}
