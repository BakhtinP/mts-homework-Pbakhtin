import lesson_1.Animals.Cat;
import lesson_1.Animals.Dog;
import lesson_1.Exceptions.InvalidAnimalBirthDateException;
import lesson_1.Exceptions.InvalidAnimalException;
import lesson_1.Interfaces.SearchService;
import lesson_1.Services.SearchServiceImpl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

class SearchServiceImplTest {
    private final SearchService searchService = mock(SearchServiceImpl.class);


    private final Dog dogLeapYear = new Dog("Сиба", "Мико", 100.500, "Добрая", LocalDate.of(2020, 1, 13));
    private final Cat catNonLeapYear = new Cat("Рыжий", "Джин", 3.14, "Злой", LocalDate.of(2013, 3, 13));
    private final Cat cat_nullDate = new Cat("Рыжий", "Джин", 3.14, "Злой", null);


    @Test
    @DisplayName("Пробрасываем InvalidAnimalException")
    void checkInvalidAnimalException() throws InvalidAnimalException, InvalidAnimalBirthDateException {
        doThrow(InvalidAnimalException.class).when(searchService).checkLeapYearAnimal(null);
        assertThrows(InvalidAnimalException.class, () -> searchService.checkLeapYearAnimal(null));
    }

    @Test
    @DisplayName("Пробрасываем InvalidAnimalBirthDateException")
    void checkInvalidAnimalBirthDateException() throws InvalidAnimalException, InvalidAnimalBirthDateException {
        doThrow(InvalidAnimalBirthDateException.class).when(searchService).checkLeapYearAnimal(cat_nullDate);
        assertThrows(InvalidAnimalBirthDateException.class, () -> searchService.checkLeapYearAnimal(cat_nullDate));
    }

    @Test
    @DisplayName("Животное с високосным годом")
    void checkLeapAnimalLeapYear() throws InvalidAnimalException, InvalidAnimalBirthDateException {
        doNothing().when(searchService).checkLeapYearAnimal(dogLeapYear);
        searchService.checkLeapYearAnimal(dogLeapYear);
        verify(searchService, times(1)).checkLeapYearAnimal(dogLeapYear);
    }

    @Test
    @DisplayName("Животное с не високосным годом")
    void checkAnimalNotLeapYear() throws InvalidAnimalException, InvalidAnimalBirthDateException {
        doNothing().when(searchService).checkLeapYearAnimal(catNonLeapYear);
        searchService.checkLeapYearAnimal(catNonLeapYear);
        verify(searchService, times(1)).checkLeapYearAnimal(catNonLeapYear);
    }
}