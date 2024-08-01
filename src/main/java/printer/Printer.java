package printer;

import history.Example;

import java.util.List;

public interface Printer {

    void print(double result);

    void print(List<Example> examples);

}
