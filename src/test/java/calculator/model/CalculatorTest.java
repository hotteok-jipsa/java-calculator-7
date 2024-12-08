package calculator.model;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    void 구분자로_구분된_숫자들을_더한다() {
        Calculator calculator = new Calculator();
        assertThat(calculator.calculate(List.of(5, 45, 2)))
                .isEqualTo(52);
    }
}
