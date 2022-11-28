/*
 * File: CalcController.java
 * Created Date: 2022-11-28
 * Author: Baráth Dávid
 * Github: https://github.com/david587
 * Copyright (c) 2020-2022 Baráth Dávid
 * 
 * GNU GPL v2
 */


package controllers;

public class CalcController {
    public static double calcPerimeter( double aSide, double bSide) {
        return aSide + bSide;
    }

    public static double calcArea(double aSide, double bSide) {
        return aSide * bSide; 
    }
}
