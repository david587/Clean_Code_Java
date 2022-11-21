/*
 * File: FileHandler.java
 * Created Date: 2020-09-15
 * Author: Nagy János
 * Github: https://github.com/andteki
 * Copyright (c) 2020-2022 Nagy János
 * 
 * GNU GPL v2
 */
package models;
//Az importáló sorok
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

// A FileHandler osztály létrehozása
public class FileHandler {
    String fileName;
    public FileHandler() {
        this.fileName = "adat.txt";
    }
    /* A fájlbaírás mellet szükség lesz egy
     * adatbázisba író osztályra is. 
     */
    /* Fájlbaírás */
    public void writeFile(String line) {
        // hiba próba:
        try {
            FileWriter f = new FileWriter(this.fileName, true);
            PrintWriter p = new PrintWriter(f);
            p.println(line);
            p.close();
        } catch (IOException e) {
            System.err.println("Hiba! A fájlbaírás sikertelen!");
        }
    }
}
