package firstOOP;

public class Person {
    public String firstName;
    public String secondName;
    public static int age;

    public void sayWhoAreYou() {
        System.out.println("Меня зовут " + firstName + " " + secondName);
    }

    public void sayYourAge() {
        System.out.println("Мне " + age + " лет");
    }

}
