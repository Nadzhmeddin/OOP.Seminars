package Seminar_1;

public class Person {
    
    // Модификаторы доступа: 
    // private - доступ только внутри класса.
    // protected - доступен только внутри пакета(папки файлов) + наследники. 
    // default - доступен внутри пакета(папки файлов).
    // public - доступен всем и отовсюду.


    private String name;
    private int age;

    public Person() {
        this("unnamed", 18);
        // this.name = "unnamed";
        // this.age = 1;
    }

    Person(String name, int age) {
        this.name = name;
        setAge(age);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if(age > 0) {
            this.age = age;
        }
        else {
            throw new IllegalArgumentException("Возраст должен быть больше нуля");
        }
    }

    public int getAge() {
        return age;
    }
    

}
