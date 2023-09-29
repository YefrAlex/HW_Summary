package JavaPro.lesson23_generics.task5;

import java.util.List;

public class VehicleUtils {
    public static void move(List<? extends Cars> from, List<? super Cars> to){
        to.addAll(from);
    }
}
