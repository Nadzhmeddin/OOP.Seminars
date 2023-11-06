package Seminar_4;

import java.util.ArrayList;
import java.util.List;

public class Storage<T extends Number> { // Явно ограничили именно числовые значения. 
    
    // Класс, который хранит набор чисел, какого-то конкретного типа: либо все Double, либо все Integer.
    // Класс должен иметь два метода: добавить новое число и посчитать сумму чисел. 


    private List<T> numbers;
    

    public Storage() {
        numbers = new ArrayList<>();
    }
    
    public void add(T x) {
        numbers.add(x);
    }

    public int sum() {
        int sum = 0;
        for(T number: numbers) {
            sum += number.intValue();
        }
        return sum;
    }

    
}
