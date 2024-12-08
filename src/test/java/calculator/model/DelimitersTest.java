package calculator.model;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class DelimitersTest {

    @Test
    void 계산식을_구분자를_기준으로_구분한다() {
        Delimiters delimiters = new Delimiters("#");
        assertThat(delimiters.splitByDelimiters("5,3:2#5,,##"))
                .containsOnly("5", "3", "2", "5");
    }
}
