package calculator;

import calculator.controller.CalculatorController;
import calculator.model.Calculator;
import calculator.model.CustomDelimiterProcessor;
import calculator.view.InputView;
import calculator.view.OutputView;

public class CalculatorApplication {
    public static void run() {
        InputView inputView = new InputView();
        OutputView outputView = new OutputView();
        CustomDelimiterProcessor customDelimiterProcessor = new CustomDelimiterProcessor();
        Calculator calculator = new Calculator();

        new CalculatorController(inputView, outputView, customDelimiterProcessor, calculator).start();
    }
}
