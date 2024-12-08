package calculator.model;

import static calculator.ExceptionMessage.TOKEN_NOT_NUMBER_EXCEPTION;

import java.util.ArrayList;
import java.util.List;

public class Tokens {

    List<Integer> tokens = new ArrayList<>();

    public Tokens(List<String> tokens) {
        validateTokens(tokens);
    }

    private void validateTokens(List<String> tokens) {
        for (String token : tokens) {
            if (!token.matches("^[0-9]*$")) {
                throw new IllegalArgumentException(TOKEN_NOT_NUMBER_EXCEPTION.message);
            }
        }
    }

}
