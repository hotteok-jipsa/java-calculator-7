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

    public List<String> splitByDelimiters(String input) {
        String delimitersRegex = getDelimitersRegex();
        return List.of(input.split(delimitersRegex));
    }

    private String getDelimitersRegex() {
        StringBuilder sb = new StringBuilder();
        for (String delimiter : delimiters) {
            sb.append(delimiter).append("|");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}
