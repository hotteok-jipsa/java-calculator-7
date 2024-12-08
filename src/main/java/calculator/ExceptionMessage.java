package calculator;

public enum ExceptionMessage {
    CUSTOM_DELIMITER_NUMBER_EXCEPTION("커스텀 구분자는 숫자일 수 없습니다."),
    TOKEN_NOT_NUMBER_EXCEPTION("계산식에는 구분자 혹은 숫자 이외의 문자가 있을 수 없습니다.");


    private final String prefix = "[ERROR] ";
    public final String message;


    ExceptionMessage(String message) {
        this.message = prefix + message;
    }
}
