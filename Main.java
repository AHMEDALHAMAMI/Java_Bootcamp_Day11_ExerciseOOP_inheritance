
public class Main {
    public static void main(String[] args) {


        Shape shape = new Shape("Blue", true);
        shape.setColor("red");
        shape.setFilled(true);
        System.out.println(shape.getColor());
        System.out.println(shape.isFilled());
        System.out.println(shape.toString());

        Circle circle = new Circle(4.5, "White", true);
        System.out.println(circle.getArea());
        circle.setRadius(7);
        System.out.println(circle.getPerimeter());
        System.out.println(circle.getRadius());
        System.out.println(circle.toString());

        Rectangle rectangle = new Rectangle(8.5, 4.2);
        System.out.println(rectangle.getArea());
        rectangle.setWidth(33);
        rectangle.setLength(44);
        System.out.println(rectangle.getPerimeter());
        System.out.println(rectangle.toString());

        Square square = new Square(4, "Purple", true);
        square.setLength(66);
        System.out.println(square.getSide());
        System.out.println(square.getWidth());
        square.setSide(55);
        System.out.println(square.toString());


    }
}
