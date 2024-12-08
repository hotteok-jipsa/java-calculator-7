package calculator.model;

public class CustomDelimiterProcessor {

    public boolean specifyCustomDelimiter(String input) {
        if (input.length() < 5) {
            return false;
        }
        String specifyString = input.substring(0, 5);
        return specifyString.startsWith("//") && specifyString.endsWith("\\n");
    }

    public String extractCustomDelimiter(String input) {
        String customDelimiterForm = input.substring(0, 5);
        String customDelimiter = String.valueOf(customDelimiterForm.charAt(2));
        return customDelimiter;
    }
}