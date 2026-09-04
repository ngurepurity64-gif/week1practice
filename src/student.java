public class student{

    String name;
    int age;

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        student student = new student();

        student.name = "Ritah";
        student.age = 20;

        student.displayInfo();
    }
}

