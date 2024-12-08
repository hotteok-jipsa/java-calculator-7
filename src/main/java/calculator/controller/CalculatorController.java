package calculator.controller;

import calculator.model.Calculator;
import calculator.model.CustomDelimiterProcessor;
import calculator.model.Delimiters;
import calculator.model.Tokens;
import calculator.view.InputView;
import calculator.view.OutputView;

public class CalculatorController {
    private final InputView inputView;
    private final OutputView outputView;
    private final CustomDelimiterProcessor customDelimiterProcessor;
    private final Calculator calculator;


    public CalculatorController(InputView inputView, OutputView outputView,
                                CustomDelimiterProcessor customDelimiterProcessor,
                                Calculator calculator) {
        this.inputView = inputView;
        this.outputView = outputView;
        this.customDelimiterProcessor = customDelimiterProcessor;
        this.calculator = calculator;
    }

    public void start() {
        Delimiters delimiters = new Delimiters();
        String formula = setCustomDelimiter(getInput(), delimiters);
        Tokens tokens = new Tokens(delimiters.splitByDelimiters(formula));
        int result = calculator.calculate(tokens.getTokens());
        printResult(result);
    }

    private String getInput() {
        inputView.printInputGuideMessage();
        return inputView.getInput();
    }

    private void printResult(int result) {
        outputView.printResultMessage(result);
    }

    private String setCustomDelimiter(String input, Delimiters delimiters) {
        if (!customDelimiterProcessor.specifyCustomDelimiter(input)) {
            return input;
        }
        String customDelimiter = customDelimiterProcessor.extractCustomDelimiter(input);
        delimiters.addCustomDelimiter(customDelimiter);
        return input.substring(5, input.length());
    }

}
