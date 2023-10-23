package Seminar_2;

public class AnimalsMain {
    public static void main(String[] args) {
        Cat cat = new Cat("Cat");
        Dog dog = new Dog("Dog");

        Animal[] animals = {cat, dog};
        for (Animal animal : animals) {
            animal.voice();
        }
        printNameToConsole(cat);
        printNameToConsole(dog);
        Person person = new Person("Igor");
        printNameToConsole(person);
    }

    static void printNameToConsole(HasName name) {
        System.out.println(name.name());
    }
}
