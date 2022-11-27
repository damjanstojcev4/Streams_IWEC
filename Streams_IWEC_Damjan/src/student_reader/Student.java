package student_reader;

public class Student {
    private String name;
    private String lastName;
    private Integer points;

    public Student(String name, String lastName, Integer points) {
        this.name = name;
        this.lastName = lastName;
        this.points = points;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", points=" + points +
                '}';
    }
}
