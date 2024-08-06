package printer;

import history.Example;
import java.util.List;

/**
 * Интерфейс для вывода информации о расчетах.
 * Определяет методы для печати результатов и истории расчетов.
 */
public interface Printer {

    void print(double result);

    void print(List<Example> examples);

}
