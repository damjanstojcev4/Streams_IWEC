package student_reader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class StudentReader {
    public Student[] readStudents(String fileName) {
        Student[] result = new Student[0];

        try (BufferedReader in = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = in.readLine()) != null) {
                String[] tokens = line.split(",");
                Student student = new Student(tokens[0].trim(), tokens[1].trim(), Wrapper.parseInt(tokens[2].trim()));
                ArrayManager am = new ArrayManager();
                result = am.addStudent(result, student);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
