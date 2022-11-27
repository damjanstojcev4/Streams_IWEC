package student_reader;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        StudentReader reader = new StudentReader();
        Student[] students = reader.readStudents("student.csv");

        System.out.println(Arrays.toString(students));

    }
}
