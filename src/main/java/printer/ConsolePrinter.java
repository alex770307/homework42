package printer;

import history.Example;
import java.util.List;

/**
 * Класс для вывода информации о расчетах в консоль.
 * Реализует интерфейс Printer.
 */
public class ConsolePrinter implements Printer {

    public void print(double result) {
        System.out.printf("Ваш результат равен: %.2f%n", result);
    }

    @Override
    public void print(List<Example> list) {
        System.out.println("История примеров:");
        list.forEach(System.out::println);
    }
}