package calculator.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
    private static final String INPUT_GUIDE_MESSAGE = "덧셈할 문자를 입력해 주세요.";

    public void printInputGuideMessage() {
        System.out.println(INPUT_GUIDE_MESSAGE);
    }

    public String getInput() {
        return Console.readLine();
    }
}
