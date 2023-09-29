package JavaPro.lesson17_Lambda.task3;

import java.util.ArrayList;
import java.util.List;

public class Main1 {
    public static void main(String[] args) {
        List<Gepard> gepards=new ArrayList<>();
        gepards.add(new Gepard());
        gepards.add(new Gepard());
        gepards.add(new Gepard());

        List<Cow> cows=new ArrayList<>();
        cows.add(new Cow());
        cows.add(new Cow());
        cows.add(new Cow());

        List<Animal> animals=new ArrayList<>();

        Utils utils=(x, y) -> y.addAll(x);

        utils.copy(cows, animals);
        utils.copy(gepards, animals);

        for (Animal animal : animals) {
            animal.voice();
        }
    }
}
