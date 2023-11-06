package Seminar_3;

import java.util.Set;
import java.util.TreeSet;

public class Lesson3Main {
    public static void main(String[] args) {
        // Comporator, Comparable
        // Iterator, Iterable


        String java = "Java";
        String kotlin = "Kotlin";
        int compare = java.compareTo(kotlin);
        
        System.out.println(compare);

        // Set<String> strings = new TreeSet<>();
        // strings.add("C++");
        // strings.add("C#");
        // strings.add("C");
        // strings.add("Java");
        // strings.add("Python");

        // System.out.println(strings);


        Set<Person> persons = new TreeSet<>();

        persons.add(new Person(26));
        persons.add(new Person(29));
        persons.add(new Person(60));
        persons.add(new Person(55));
        persons.add(new Person(100));
        System.out.println(persons);

        
    }

    static class Person implements Comparable<Person> {
        
        private int age;

        public Person(int age) {
            this.age = age;
        }

        public int getAge() {
            return age;
        }

        @Override
        public int compareTo(Person person) {
            if(age <person.getAge()) {
                return -1;
            } else if (age > person.getAge()) {
                return 1;
            } else {
                return 0;
            }
        }

        @Override 
        public String toString() {
            return "(" + age + ")";     
        }
    }
}
