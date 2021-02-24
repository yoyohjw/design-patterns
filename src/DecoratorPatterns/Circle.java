package DecoratorPatterns;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("i'm circle!");
    }
}
