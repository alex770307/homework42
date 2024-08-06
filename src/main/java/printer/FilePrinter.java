package printer;

import history.Example;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 * Класс для вывода информации о расчетах в файл.
 * Реализует интерфейс Printer.
 */
public class FilePrinter implements Printer {
    private final String filename;

    public FilePrinter(String filename) {
        this.filename = filename;
    }

    @Override
    public void print(double result) {
    }

    @Override
    public void print(List<Example> list) {
        try (FileWriter fileWriter = new FileWriter(filename,true);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);) {

            for (Example example : list) {
                bufferedWriter.write(example + "\n");
            }
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }
}