package main;

import calculator.MathCalculator;
import history.ExamplesHistory;
import parser.StringParser;
import printer.Printer;
import userinput.UserInput;
import java.util.Scanner;

/**
 * Главный класс приложения, который отвечает за запуск программы.
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        UserInput userInput = new UserInput(scanner);
        Printer printer = userInput.getPrinter();

        MathCalculator mathCalculator = new MathCalculator(printer);
        ExamplesHistory examplesHistory = new ExamplesHistory(printer);
        StringParser stringParser = new StringParser(mathCalculator, scanner, examplesHistory);

        stringParser.parse();
        scanner.close();
    }
}
