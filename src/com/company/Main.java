package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


//        --------------------------------------EnumSex--------------------------------------------
////        inicjalizacja pola
//        EnumSex sex = EnumSex.MEN;
//
////       przykladowe wywolanie enuma:
//        switch (sex) {
//            case WOMEN:
//                System.out.println("Kobieta");
//            case MEN:
//                System.out.println("Facet");

//                }
//        --------------------------------------- Days -------------------------------------------

//        Days enumDay = Days.valueOf("SOBOTA");
//        Days today = Days.SOBOTA;
//        System.out.println("Jest dziś wykład? " + today.isLecture());
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Wpisz dzień tygodnia, aby dowiedziec sie wiecej");
//        System.out.println("Dzień ");
//        String day = scanner.nextLine().toUpperCase();
//
//        Days enumDay = Days.valueOf(day);
//        System.out.println("Numer dnia tygodnia: " + (enumDay.getNumberOfDay()));
//        System.out.println("Mamy wyklad?" + (enumDay.isLecture() ? "tak" : "nie"));
//        System.out.println("Jest wtedy weekend? " + (enumDay.isWeekend() ? "tak" : "nie"));

//        --------------------------------- Gitara ------------------------------------------------

        Scanner scannerGuitar = new Scanner(System.in);

        System.out.println("Podaj typ gitary");
        System.out.println("Dostępne typy gitar to:  KLASYCZNA, AKUSTYCZNA, ELEKTRYCZNO_AKUSTYCZNA, ELEKTRYCZNA, BASOWA");
        String guitar = scannerGuitar.nextLine().toUpperCase();

        TypeOfGuitar type = TypeOfGuitar.valueOf(guitar);

        System.out.println("Jest elektryczna? " + type.isElectricOrNo());
        System.out.println("ilosc strun: " + type.getIlstun());
        System.out.println("kolor: " + type.getColour());
    }

}
