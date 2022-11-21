/*
 * File: MainController.java
 * Created Date: 2020-09-15
 * Author: Nagy János
 * Github: https://github.com/andteki
 * Copyright (c) 2020-2022 Nagy János
 * 
 * GNU GPL v2
 */
package controllers;

import models.FileHandler;
import views.MainWindow;

public class MainController {
    MainWindow mainWindow;
    public MainController() {
        //itt kezdődik a konstruktor
        this.mainWindow = new MainWindow();
        this.mainWindow.calcButton.addActionListener(e -> {
            this.onClickCalcButton();
        });
    }// a konstruktor vége
    public void onClickCalcButton() {
        double a = Double.parseDouble(this.mainWindow.asideField.getText());
        double b = Double.parseDouble(this.mainWindow.bsideField.getText());
        Double p = CalcController.calcPerimeter(a, b);
        Double ar = CalcController.calcArea(a, b);
        this.mainWindow.perimeterField.setText(p.toString());
        this.mainWindow.areaField.setText(ar.toString());
        String line = p.toString() + ":" + ar.toString();
        FileHandler h = new FileHandler();
        h.writeFile(line);
        //TODO: adatbázisba írás
    }
    
}

