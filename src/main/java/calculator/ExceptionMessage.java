package calculator;

public enum ExceptionMessage {
    CUSTOM_DELIMITER_NUMBER_EXCEPTION("커스텀 구분자는 숫자일 수 없습니다.");


    private final String prefix = "[ERROR] ";
    public final String message;


    ExceptionMessage(String message) {
        this.message = prefix + message;
    }
}
