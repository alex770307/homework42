package operator;

/**
 * Перечисление, представляющее математические операторы.
 * Поддерживает операции умножения, деления, сложения и вычитания.
 * Находит оператор по строке.
 */
public enum Operator {

    MULTIPLY("*"),

    DIVIDE("/"),

    SUM("+"),

    SUBTRACTION("-");

    private String value;

    Operator(String value) {
        this.value = value;
    }

    public static Operator findByString(String string) {
        for (Operator operator : Operator.values()) {
            if (operator.value.equals(string)) {
                return operator;
            }
        }
        throw new RuntimeException("Вы ввели неверный знак");
    }
}