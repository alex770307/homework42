package printer;

import java.util.List;

public class ConsolePrinter implements Printer {

    public void print(double result) {
        System.out.printf("Ваш результат равен: %.2f%n", result);
    }

    @Override
    public void print(List<String> list) {
        System.out.println("История примеров:");
        list.forEach(System.out::println);
    }
}