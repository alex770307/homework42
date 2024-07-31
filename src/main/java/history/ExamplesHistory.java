package history;

import printer.Printer;

import java.util.ArrayList;
import java.util.List;

public class ExamplesHistory implements History {

    private final Printer printer;
    public List<String> history = new ArrayList<>();

    public ExamplesHistory(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void addCalculationToHistory(String calculation) {
        history.add(calculation);
        printer.print(history);
    }

    @Override
    public String toString() {
        return "ExamplesHistory{" +
                "printer=" + printer +
                ", history=" + history +
                '}';
    }
}
