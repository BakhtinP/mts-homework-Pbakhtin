package lesson_1.Interfaces;

import lesson_1.Animals.AbstractAnimal;
import lesson_1.Exceptions.InvalidAnimalBirthDateException;
import lesson_1.Exceptions.InvalidAnimalException;

import java.time.LocalDate;

public interface SearchService {

     default void checkLeapYearAnimal(AbstractAnimal animal) throws InvalidAnimalException, InvalidAnimalBirthDateException {
        if (animal == null) {
            throw new InvalidAnimalException("На вход пришёл некорректный объект " + LocalDate.now());
        }

        LocalDate birthDate = animal.getBirthDate();
        if (birthDate == null) {
            /*
             * “у животного ТИП_ЖИВОТНОГО не указана дата его рождения”
             * Здесь не понял что имеется в виду под ТИП_ЖИВОТНОГО, поэтому вывл и имя класса и имя животного
             */
            throw new InvalidAnimalBirthDateException("У животного " + animal.getClass().getSimpleName() + " " + animal.getName() + " не указана его дата рождения");
        }

        if (birthDate.isLeapYear()) {
            System.out.println(animal.getName() + " был рожден в високосный год ");
        } else {
            System.out.println(animal.getName() + " не был рожден в високосный год ");
        }
    }
}
