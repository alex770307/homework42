package parser;

import calculator.Calculator;
import history.History;
import operator.Operator;
import java.time.LocalDateTime;
import java.util.Scanner;

/**
 * Класс для парсинга строковых математических выражений.
 * Реализует интерфейс Parser.
 * <p>
 * Запускает процесс парсинга строковых выражений.
 * Ожидает ввода математического выражения, выполняет его расчет
 * и сохраняет результат в истории. Работает в цикле до тех пор,
 * пока не будет введена команда "выход".
 */
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
            try {
                String[] operands = stringToCalculate.split(" ");

                if (operands.length != 3) {
                    System.out.println("Ошибка: Введите в формате 'число оператор число'");
                    continue;
                }
                String firstOperand = operands[0]; //первое число
                String secondOperand = operands[2]; //второе число
                String operatorString = operands[1]; //знак

                Operator operator = Operator.findByString(operatorString);
                double first = Double.parseDouble(firstOperand);
                double second = Double.parseDouble(secondOperand);

                double result = calculator.calculate(first, second, operator);

                history.addCalculationToHistory(stringToCalculate, result, localDateTime);

            }catch (NumberFormatException e){
                System.out.println("Ошибка: Необходимо ввести корректные числа.");
            }catch (Exception e){
                System.out.println("Ошибка: " + e.getMessage());
            }


        }
    }
}