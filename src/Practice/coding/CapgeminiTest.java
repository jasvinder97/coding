package Practice.coding;

import java.util.List;
import java.util.Optional;

public class CapgeminiTest {

    public static void main(String[] args) {
        Student jasvinder = new Student();
        Student aman = new Student("Aman", 1);
        Student nullStudent = null;
        Optional<Student> optionalJasviunderr = Optional.ofNullable(jasvinder);
        Optional<Student> optionalNull = Optional.ofNullable(nullStudent);
        Optional<Student> optionalAman = Optional.ofNullable(aman);
        List<Optional<Student>> list = List.of(optionalAman, optionalJasviunderr, optionalNull);
        list.forEach(student -> {
            if (student.isPresent()) {
                System.out.println(student.get());
            } else {
                System.out.println("Practice.coding.Student is null");
            }
        });
    }
}


class Student {
    private Integer rollNumber;
    private String name;

    public Student() {

    }

    public Student(String name, Integer rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    @Override
    public String toString() {
        return "Practice.coding.Student{" +
                "rollNumber=" + rollNumber +
                ", name='" + name + '\'' +
                '}';
    }

    public Integer getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(Integer rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
