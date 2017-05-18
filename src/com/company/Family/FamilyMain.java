package com.company.Family;

/**
 * Created by Piotr Czubkowski on 2017-05-18.
 * <p>
 * Stwórz typ wyliczeniowy  Rodzina . Dla których pierwsza wartość do waga a druga wartość to wzrost
 *   Mama    (67,149)
 *   Tata     (92,181),
 *   Brat     (72,151),
 *   Siostra  (24,43);
 * <p>
 * Do typu wyliczeniowego dodaj metody :
 *   Podaj masę
 *   Podaj wzrost
 *   Podaj BMI  [ BMI = masa ciała (kg) / wzrost (m)²  ]
 * <p>
 * Wyświetl na ekran BMI wszystkich członków rodziny
 */
public class FamilyMain {

    public static void main(String[] args) {
        for (Family f : Family.values()) {
            System.out.println(f + " ma BMI :" + f.getBMI());
        }
    }
}