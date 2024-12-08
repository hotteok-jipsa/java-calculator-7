package calculator.model;

import java.util.ArrayList;
import java.util.List;

public class Delimiters {

    private final List<String> delimiters = new ArrayList<>(List.of(":", ","));

    public Delimiters() {
    }

    public Delimiters(String customDelimiter) {
        delimiters.add(customDelimiter);
    }
}
