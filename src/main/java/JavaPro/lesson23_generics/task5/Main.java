package JavaPro.lesson23_generics.task5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Cars> commonParking = new ArrayList<>();

        List<Cars> hondaGarage = new ArrayList<>();
        hondaGarage.add(new Honda());
        hondaGarage.add(new Honda());
        hondaGarage.add(new Honda());

        List<Cars> audiGarage = new ArrayList<>();
        audiGarage.add(new Audi());
        audiGarage.add(new Audi());
        audiGarage.add(new Audi());

        VehicleUtils.move(hondaGarage,commonParking);
        VehicleUtils.move(audiGarage,commonParking);

        System.out.println(commonParking);

        List<Opel> opelGarage = new ArrayList<>();
        opelGarage.add(new Opel());
        opelGarage.add(new Opel());
        opelGarage.add(new Opel());

        VehicleUtils.move(opelGarage,commonParking);
    }
}
