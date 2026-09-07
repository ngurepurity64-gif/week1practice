public class Student {

    String name;
    int age;

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Student student = new Student();

        student.name = "Ritah";
        student.age = 20;

        student.displayInfo();
    }
}

