package calculator.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
    private static final String inputGuideMessage = "덧셈할 문자를 입력해 주세요.";

    public void printInputGuideMessage() {
        System.out.println(inputGuideMessage);
    }

    public String getInput() {
        return Console.readLine();
    }
}
