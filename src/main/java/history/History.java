package history;

import java.time.LocalDateTime;


/**
 * Интерфейс для ведения истории расчетов.
 * Предоставляет метод для добавления новых расчетов в историю.
 */
public interface History {

    void addCalculationToHistory(String example, double result, LocalDateTime creationsDate);
}
