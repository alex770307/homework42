package userinput;

import printer.ConsolePrinter;
import printer.FilePrinter;
import printer.Printer;
import java.util.Scanner;

/**
 *  Класс для обработки пользовательского ввода.
 *  Предоставляет методы для выбора способа вывода результатов.
 */
public class UserInput {
    private final Scanner scanner;

    public UserInput(Scanner scanner) {
        this.scanner = scanner;
    }

    public String getOutputChoice() {
        System.out.print("Выберите, куда выводить результаты (1 - консоль, 2 - файл): ");

        return scanner.nextLine();
    }

    public Printer getPrinter() {

        String choice = getOutputChoice();
        Printer printer;
        if (choice.equals("1")) {
            printer = new ConsolePrinter();
        } else if (choice.equals("2")) {
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
