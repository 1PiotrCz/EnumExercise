package com.company;

public class Main {

    public static void main(String[] args) {

//        inicjalizacja pola
        EnumSex sex = EnumSex.MEN;

//       przykladowe wywolanie enuma:
        switch (sex) {
            case WOMEN:
                System.out.println("Kobieta");
            case MEN:
                System.out.println("Facet");

        }
    }

}
