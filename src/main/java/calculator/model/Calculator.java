package calculator.model;

import java.util.List;

public class Calculator {
    public int calculate(List<Integer> values) {
        return values.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }
}
