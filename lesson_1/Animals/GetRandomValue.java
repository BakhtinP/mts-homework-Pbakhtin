package lesson_1.Animals;

public class GetRandomValue {
    private static final String[] names = {"Пушок", "Снежок", "Шарик", "Барсик", "Тузик", "Мишка", "Зайка", "Рыбка", "Мышка", "Пирожок", "Жучка"};
    private static final String[] breeds = {"Рыжий", "Метис", "Сибирский", "Большой", "Серый", "Черый", "Карликовый", "Борзая", "Мини", "Русская", "Рыба"};
    private static final String[] characters = {"Добрый", "Агрессивный", "Послушный", "Игривый", "Инфантильный", "Глупый", "Преданный", "Быстрый", "Дрессированный","Злой", "Есть"};

    public static String getName(int i) {
        return names[i];
    }

    public static String getBreed(int i) {
        return breeds[i];
    }

    public static String getCharacter(int i) {
        return characters[i];
    }

}
