import java.util.HashMap;
import java.util.Map;

public class map {

    public static void main(String[] args) {

        Map<Integer, String> students = new HashMap<>();

        students.put(1, "Ritah");
        students.put(2, "John");
        students.put(3, "Mary");

        System.out.println(students);
    }
}
