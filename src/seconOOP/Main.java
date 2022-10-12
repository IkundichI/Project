package seconOOP;

public class Main {
    // Object (Наследование)
    // Getter (Инкапсуляция)
    // toString
    // equal
    // Наследование в Java не множественное
    public static void main(String[] args) {
        Human human = new Human("Sergey", 20);
        Woman woman = new Woman("Vladimir", 35, true);
        human.sayHello();
        woman.sayHello();
        woman.whatAreYouDoing();
    }
}
