package Seminar_2;

public abstract class Animal implements HasName {
    
    public final String name;
    // какая-то базовая общая для всех животных часть

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String name() {
        return getName();
    }

    public abstract void voice();
    // абстрактный метод, реализация которого в данный момент неизвестна
}

