package userinput;

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
}
