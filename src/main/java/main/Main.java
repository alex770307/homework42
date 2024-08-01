package main;

import calculator.MathCalculator;
import history.ExamplesHistory;
import parser.StringParser;
import printer.ConsolePrinter;
import printer.FilePrinter;
import printer.Printer;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Выберите, куда выводить результаты (1 - консоль, 2 - файл): ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        Printer printer;
        if (choice == 1) {
            printer = new ConsolePrinter();
        } else if (choice == 2) {
            System.out.print("Введите имя файла для вывода: ");
            String filename = scanner.nextLine();
            printer = new FilePrinter(filename);
        } else {
            System.out.println("Неверный выбор, использование консоли по умолчанию.");
            printer = new ConsolePrinter();
        }

        MathCalculator mathCalculator = new MathCalculator(printer);
        ExamplesHistory examplesHistory = new ExamplesHistory(printer);
        StringParser stringParser = new StringParser(mathCalculator, scanner, examplesHistory);

        stringParser.parse();
        scanner.close();
    }
}