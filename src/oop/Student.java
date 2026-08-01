package oop;

public class Student {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Ajith";
        student.age = 24;

        System.out.println(student);
    }
}
