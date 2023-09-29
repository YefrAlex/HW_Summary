package JavaPro.lesson17_Lambda.task3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Функция, которая копирует объекты из одной колекции в другую

        List<Gepard> gepards = new ArrayList<>();
        gepards.add(new Gepard());
        gepards.add(new Gepard());
        gepards.add(new Gepard());

        List<Cow> cows = new ArrayList<>();
        cows.add(new Cow());
        cows.add(new Cow());
        cows.add(new Cow());

        List<Animal> animals = new ArrayList<>();

        AnimalUtils.copy(gepards,animals);
        AnimalUtils.copy(cows,animals);

        for (Animal animal : animals){
            animal.voice();
        }

    }
}
