package calculator.model;

import static calculator.ExceptionMessage.TOKEN_NOT_NUMBER_EXCEPTION;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

import java.util.List;
import org.junit.jupiter.api.Test;

public class TokensTest {

    @Test
    void 구분된_문자들이_숫자가_아니라면_예외를_발생시킨다() {
        assertThatThrownBy(() -> new Tokens(List.of("5", "2", "45", "A")))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(TOKEN_NOT_NUMBER_EXCEPTION.message);
    }

    @Test
    void 구분된_문자들을_숫자로_변환한다() {
        Tokens tokens = new Tokens(List.of("5", "2", "45", ""));
        assertThat(tokens.getTokens()).containsOnly(5, 2, 45);
    }
}
