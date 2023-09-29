package JavaSummary.Tasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task {
    public static void main(String[] args) {
        Emploey emploey1 = new Emploey("Korovin", "Egor", 1567.8, 33);
        Emploey emploey2 = new Emploey("Dark", "Joanna", 1967.8, 31);
        Emploey emploey3 = new Emploey("Korban", "Dallas", 2167.8, 38);
        Emploey emploey4 = new Emploey("Bonapart", "Napoleon", 2067.8, 39);
        List<Emploey>list = new ArrayList<>();
        list.add(emploey1);
        list.add(emploey2);
        list.add(emploey3);
        list.add(emploey4);

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

    }
    public static double calcAVG (List<Integer> list){
        return list.stream().mapToDouble(x->(double)x ).average().orElse(-1);
    }
}
