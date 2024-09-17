package org.example;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Animal human = new Animal(LocalDate.of(1984,10,10), "Bob");

        System.out.println(AnimalService.calculateDaysTillBirhday(human));
    }
}