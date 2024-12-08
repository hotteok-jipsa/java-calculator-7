package calculator.model;

import static calculator.ExceptionMessage.TOKEN_NOT_NUMBER_EXCEPTION;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Tokens {

    List<Integer> tokens = new ArrayList<>();

    public Tokens(List<String> tokens) {
        validateTokens(tokens);
        this.tokens = getNumberTokens(tokens);
    }

    public List<Integer> getTokens() {
        return Collections.unmodifiableList(tokens);
    }

    private void validateTokens(List<String> tokens) {
        for (String token : tokens) {
            if (!token.matches("^[0-9]*$")) {
                throw new IllegalArgumentException(TOKEN_NOT_NUMBER_EXCEPTION.message);
            }
        }
    }

    private List<Integer> getNumberTokens(List<String> tokens) {
        return tokens.stream()
                .filter(token -> !token.isBlank())
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }

}
