package DecoratorPatterns;

public class DecoratorPatternDemo {


    public static void main(String[] args) {
        Shape circle = new Circle();
        ShapeDecorator shapeDecorator = new RedShapeDecorator(circle);
        shapeDecorator.draw();

        Shape rectangle = new Rectangle();
        ShapeDecorator shapeDecorator1 = new RedShapeDecorator(rectangle);
        shapeDecorator1.draw();
    }

}
