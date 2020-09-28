package controller;

import model.ParkeerBoete;
import model.SnelheidsBoete;
import model.VerkeersBoete;

/**
 * Author: Mark Amerkamp (markamerkamp@gmail.com)
 * Veel plezier ermee!
 */
public class VerkeersBoeteLauncher {

    public static void main(String[] args) {

        ParkeerBoete parkeerBoete = new ParkeerBoete("Mark", "GX-700-V", 1);

        System.out.println(parkeerBoete);

        SnelheidsBoete snelheidsBoete = new SnelheidsBoete("Elzelyne", "GX-700-V",
                140, 120);

        System.out.println(snelheidsBoete);

        VerkeersBoete boete = new VerkeersBoete("Mark", "GX800V");

        System.out.println(boete);




    }
}
