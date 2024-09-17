package org.example;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class AnimalService {
    public static long calculateDaysTillBirhday(Animal animal) {
        LocalDate localDate = LocalDate.now();
        LocalDate birthDay = animal.birhday();
        int yearDelta = birthDay.getDayOfYear() >= localDate.getDayOfYear() ? 0 : 1;
        LocalDate nextBirthDay = LocalDate.of(localDate.getYear() + yearDelta, birthDay.getMonthValue(), birthDay.getDayOfMonth());
        return localDate.until(nextBirthDay, ChronoUnit.DAYS);
    }
}
