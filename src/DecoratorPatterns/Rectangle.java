package DecoratorPatterns;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("i'm rectangle");
    }
}
