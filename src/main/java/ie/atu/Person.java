package ie.atu;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person()
    {
        this.firstName = "";
        this.lastName = "";
        this.age = 0;
    }

    public Person(String firstName, String lastName, int age)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
}
