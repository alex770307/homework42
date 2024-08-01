package history;

import java.time.LocalDateTime;

public interface History {

    void addCalculationToHistory(String example, double result, LocalDateTime creationsDate);
}
