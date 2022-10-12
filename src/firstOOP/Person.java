package firstOOP;

public class Person {
    public String firstName;
    public String secondName;
    public static int age;

    public void sayWhoAreYou() {
        System.out.println("My name is " + firstName + " " + secondName);
    }

    public void sayYourAge() {
        System.out.println("I'am " + age + " year old");
    }

}
