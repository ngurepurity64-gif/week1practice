import java.util.HashMap;

public class Map {

    public static void main(String[] args) {

        java.util.Map<Integer, String> students = new HashMap<>();

        students.put(1, "Ritah");
        students.put(2, "John");
        students.put(3, "Mary");

        System.out.println(students);
    }
}
