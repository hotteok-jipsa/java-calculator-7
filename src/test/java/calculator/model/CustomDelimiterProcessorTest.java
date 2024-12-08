package calculator.model;

import static calculator.ExceptionMessage.CUSTOM_DELIMITER_NUMBER_EXCEPTION;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
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

    @Test
    void 커스텀_구분자를_추출한다() {
        assertThat(customDelimiterProcessor.extractCustomDelimiter("//@\\n5:2")).isEqualTo("@");
        assertThat(customDelimiterProcessor.extractCustomDelimiter("//%\\n")).isEqualTo("%");
    }

    @Test
    void 추출한_커스텀_구분자가_숫자라면_예외를_발생시킨다() {
        assertThatThrownBy(() -> customDelimiterProcessor.extractCustomDelimiter("//2\n5:2"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(CUSTOM_DELIMITER_NUMBER_EXCEPTION.message);
    }
}
