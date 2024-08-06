package history;

import java.time.LocalDateTime;
import java.util.Objects;

/**
 *  Класс, представляющий пример с результатом и датой создания.
 *  Содержит информацию о математическом примере, его результате и дате создания.
 */
public class Example {
    private String example;
    private double result;
    private LocalDateTime creationsDate;

    public Example(String example, double result, LocalDateTime creationsDate) {
        this.example = example;
        this.result = result;
        this.creationsDate = creationsDate;
    }

    @Override
    public String toString() {
        return " example= " + example
                + " result= " + String.format("%.2f", result)
                + " creationsDate= " + creationsDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Example example1 = (Example) o;
        return Double.compare(result, example1.result) == 0
                && Objects.equals(example, example1.example)
                && Objects.equals(creationsDate, example1.creationsDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(example, result, creationsDate);
    }

    public String getExample() {
        return example;
    }

    public void setExample(String example) {
        this.example = example;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public LocalDateTime getCreationsDate() {
        return creationsDate;
    }

    public void setCreationsDate(LocalDateTime creationsDate) {
        this.creationsDate = creationsDate;
    }
}
