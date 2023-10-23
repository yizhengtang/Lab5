package ie.atu;

public class Main {
    public static void main(String[] args)
    {
        Person student1 = new Person("Yi Zheng", "Tang", 20);

        Person student2 = new Person();
        student1.getUserInput();
        student2.getUserInput();

        student1.displayInfo();
        student2.displayInfo();
    }
}