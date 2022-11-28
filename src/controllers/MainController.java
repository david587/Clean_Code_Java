/*
 * File: MainController.java
 * Created Date: 2022-11-28
 * Author: Baráth Dávid
 * Github: https://github.com/david587
 * Copyright (c) 2020-2022 Baráth Dávid
 * 
 * GNU GPL v2
 */

package controllers;

import models.FileHandler;
import views.MainWindow;

public class MainController {
    MainWindow mainWindow;
    public MainController() {
        this.mainWindow = new MainWindow();
        this.mainWindow.calcButton.addActionListener(e -> {
            this.parseSides();
        });
    }

    public double  parseSides(){
        double aSide = Double.parseDouble(this.mainWindow.asideField.getText());
        double bSide = Double.parseDouble(this.mainWindow.bsideField.getText());
        return onClickCalcButton(aSide,bSide);
    }

    public void setFieldsText(Double perimeter, Double area){
        this.mainWindow.perimeterField.setText(perimeter.toString());
        this.mainWindow.areaField.setText(area.toString());
    }

    public void setFileHandler(Double perimeter, Double area){
        String line = perimeter.toString() + ":" + area.toString();
        FileHandler handler = new FileHandler();
        handler.writeFile(line);
    }

    public double onClickCalcButton(double aSide, double bSide) {
        Double perimeter = CalcController.calcPerimeter(aSide, bSide);
        Double area = CalcController.calcArea(aSide, bSide);
        setFieldsText(perimeter,area);
        setFileHandler(perimeter,area);
        //TODO: adatbázisba írás
        return area;
    }

    
   
    
}

