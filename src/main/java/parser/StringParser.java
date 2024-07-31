package parser;

import calculator.Calculator;
import history.ExamplesHistory;
import history.History;
import operator.Operator;

import java.time.LocalDateTime;
import java.util.Scanner;

public class StringParser implements Parser {

    private final Calculator calculator;
    private final Scanner scanner;
    private final History history;

    public StringParser(Calculator calculator, Scanner scanner, History history) {
        this.calculator = calculator;
        this.scanner = scanner;
        this.history = history;
    }

    public void parse() {
        while (true) {
            System.out.print("Введите выражение (или 'exit' для выхода): ");
            String stringToCalculate = scanner.nextLine();
            LocalDateTime localDateTime = LocalDateTime.now();
            if ("exit".equalsIgnoreCase(stringToCalculate)) {
                break;
            }
            String[] operands = stringToCalculate.split(" ");

            String firstOperand = operands[0]; //первое число
            String secondOperand = operands[2]; //второе число
            String operatorString = operands[1]; //знак

            Operator operator = Operator.findByString(operatorString);
            double first = Double.parseDouble(firstOperand);
            double second = Double.parseDouble(secondOperand);

            double result = calculator.calculate(first, second, operator);

            history.addCalculationToHistory(stringToCalculate + " = "
                    + result +" Время создания: "+ localDateTime);

        }
    }
}