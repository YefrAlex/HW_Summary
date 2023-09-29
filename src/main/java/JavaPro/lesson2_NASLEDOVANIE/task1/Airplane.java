package JavaPro.lesson2_NASLEDOVANIE.task1;

public class Airplane implements Flayable{
    @Override
    public void fly() {
        System.out.println("самолет летит");
    }

    @Override
    public void landing() {
        System.out.println("самолет приземлился");
    }
}
