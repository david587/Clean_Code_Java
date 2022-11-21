/*
 * File: CalcController.java
 * Created Date: 2020-09-15
 * Author: Nagy János
 * Github: https://github.com/andteki
 * Copyright (c) 2020-2022 Nagy János
 * 
 * GNU GPL v2
 */

package controllers;

// osztály létrehozása
public class CalcController {
    /* Bemenő paraméterek a oldal és b oldal */
    public static double calcPerimeter( double aSide, double bSide) {
        return aSide + bSide; //összeadjuk a és b oldalt
    } /* calcPerimeter vége */

    public static double calcArea(double aSide, double bSide) {
        return aSide * bSide; //összeszorozzuk a és b oldalt
    }/* calcArea vége */
}
