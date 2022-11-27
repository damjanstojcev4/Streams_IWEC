package student_reader;

public class ArrayManager {
    public Student[] addStudent(Student[] arr, Student el) {
        Student[] tempArray = new Student[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            tempArray[i] = arr[i];
        }
        tempArray[tempArray.length - 1] = el;
        return tempArray;
    }
}
