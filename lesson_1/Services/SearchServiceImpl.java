package lesson_1.Services;

import lesson_1.Animals.AbstractAnimal;
import lesson_1.Exceptions.InvalidAnimalBirthDateException;
import lesson_1.Exceptions.InvalidAnimalException;
import lesson_1.Interfaces.SearchService;

public class SearchServiceImpl implements SearchService {

    public void checkLeapYearAnimal(AbstractAnimal animal) throws InvalidAnimalException, InvalidAnimalBirthDateException {
        SearchService.super.checkLeapYearAnimal(animal);
    }
}
