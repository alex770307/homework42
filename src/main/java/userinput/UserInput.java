package userinput;

import printer.ConsolePrinter;
import printer.FilePrinter;
import printer.Printer;

import java.util.Scanner;

public class UserInput {
    private final Scanner scanner;


    public UserInput(Scanner scanner) {
        this.scanner = scanner;

    }

    public int getOutputChoice() {

        System.out.print("Выберите, куда выводить результаты (1 - консоль, 2 - файл): ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        return choice;
    }

    public Printer getPrinter() {
        int choice = getOutputChoice();
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
        return printer;
    }
}
