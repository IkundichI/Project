package seconOOP;

public class Human {
    public String name;
    public int age;

    public Human(String name, int age) {
        if (age > 120 || age < 0) {
            System.out.println("Error");
            System.exit(0);
        }
        this.name = name;
        this.age = age;

    }

    public void sayHello() {
        System.out.println("Hi, my name is " + name);
    }
}