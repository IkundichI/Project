package seconOOP;

public class Woman extends Human {

    public boolean isWashing;

    public Woman(String name, int age, boolean isWashing) {
        super(name, age);
        this.isWashing = isWashing;
    }

    public void whatAreYouDoing() {
        if (isWashing) {
            System.out.println("I'am washing");
        }
        else {
            System.out.println("I'am not washing");
        }
    }
}
