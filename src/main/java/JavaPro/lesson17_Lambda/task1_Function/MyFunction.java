package JavaPro.lesson17_Lambda.task1_Function;

import java.util.function.Function;

public class MyFunction implements Function <Double, Long> {
    @Override
    public Long apply(Double valueToRound) {
        return Math.round(valueToRound);
    }
}
