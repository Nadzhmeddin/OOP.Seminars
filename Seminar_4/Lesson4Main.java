package Seminar_4;

import java.util.ArrayList;
import java.util.List;

public class Lesson4Main {
    public static void main(String[] args) {
        // Generic Обобщения
        // Какие буквы использовать в обобщениях: чаще всего T и E
        // T - type
        // E - element
        // S - super
        // X - exeption

        
        // List<String> strings = new ArrayList<>();
        // strings.add("2");
        // String g = strings.get(0);

        // List list2 = new ArrayList<>();
        // list2.get(0);
        
        Storage<Integer> storage = new Storage<>();
        System.out.println(storage.sum());

        storage.add(2);
        storage.add(5);
        storage.add(5);
        System.out.println(storage.sum());

        List<Account> accounts = new ArrayList<>();
    }

    private static <T extends Account> void  foo(List<T> accounts) {
        T t = accounts.get(0);
    }
}
