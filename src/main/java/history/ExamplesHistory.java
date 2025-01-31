package history;

import printer.Printer;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Класс для хранения и ведения истории расчетов.
 * Реализует интерфейс History.
 * Добавляет расчет в историю и выводит ее с помощью принтера.
 */
public class ExamplesHistory implements History {

    private final Printer printer;
    private final List<Example> examples = new ArrayList<>();

    public ExamplesHistory(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void addCalculationToHistory(String example, double result, LocalDateTime creationsDate) {
        examples.add(new Example(example, result, creationsDate));
        printer.print(examples);
    }
}
