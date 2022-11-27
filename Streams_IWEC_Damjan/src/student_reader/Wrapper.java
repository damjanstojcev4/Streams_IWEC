package student_reader;

public class Wrapper {
    public static Integer parseInt(String str) {
        Integer result = null;
        try {
            result = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            // do nothing, result remains null
        }
        return result;
    }
}
