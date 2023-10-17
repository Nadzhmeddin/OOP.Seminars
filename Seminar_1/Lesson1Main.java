package Seminar_1;


public class Lesson1Main {

    public static void main(String[] args) {
        //1. Инкапсуляция.

        Person person = new Person("Igor", 50);
        
        String personName = person.getName();
        System.out.println(personName);

        //2. Наследование.

        // Person defaultPerson = new Person();
        // System.out.println(defaultPerson.getName());
        // System.out.println(defaultPerson.getAge());

        Student defaultStudent = new Student();
        System.out.println(defaultStudent.getName());
        System.out.println(defaultStudent.getAge());
    }
}