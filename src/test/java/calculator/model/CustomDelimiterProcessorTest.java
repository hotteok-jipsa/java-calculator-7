package calculator.model;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class CustomDelimiterProcessorTest {

    CustomDelimiterProcessor customDelimiterProcessor;

    @BeforeEach
    void init() {
        customDelimiterProcessor = new CustomDelimiterProcessor();
    }

    @ParameterizedTest
    @ValueSource(strings = {"//!\\n", "//%\\n"})
    void 커스텀_구분자를_지정한다면_참을_반환한다(String input) {
        assertThat(customDelimiterProcessor.specifyCustomDelimiter(input)).isTrue();
    }

    @ParameterizedTest
    @ValueSource(strings = {"//!!\\n", "5:2", "5:2,3"})
    void 커스텀_구분자를_지정하지_않는다면_거짓을_반환한다(String input) {
        assertThat(customDelimiterProcessor.specifyCustomDelimiter(input)).isFalse();
    }
}
