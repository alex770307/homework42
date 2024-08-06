package calculator;

import operator.Operator;

/**
 * Интерфейс для калькулятора, который выполняет операции над двумя числами.
 */
public interface Calculator {

    double calculate(double first, double second, Operator operator);
}
