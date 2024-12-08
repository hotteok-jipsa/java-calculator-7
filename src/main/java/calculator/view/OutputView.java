package calculator.view;

public class OutputView {

    private static final String RESULT_MESSAGE_PREFIX = "결과 : ";

    public void printResultMessage(int result) {
        System.out.println(RESULT_MESSAGE_PREFIX + result);
    }
}
