package Seminar_1;

public class Student extends Person {
    
    public Student(String name, int age) {
        super(name, age);
        
    }

    public Student() {
        // студента с именем по умолчанием "Student" и возраст 18.
        this("Student", 18);
    }

    @Override
    public void setAge(int age) {
        // 18 < age <= 25
        if(18 < age && age <=25) {
            super.setAge(age);
        } else {
            throw new IllegalArgumentException("Неправильный возраст для студента");
        }
    }
}
