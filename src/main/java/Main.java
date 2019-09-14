import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Shape[] arr = new Shape[3];
        Rectangle rectangle = new Rectangle(3,3);
        Circle circle = new Circle(5);
        Square square = new Square(10);

        arr[0] = circle;
        arr[1] = rectangle;
        arr[2] = square;

        for (Shape shape : arr) {
            System.out.println(shape.getArea());
        }

        Arrays.sort(arr);


        for (Shape shape : arr) {
            System.out.println(shape.getArea());
        }

    }
}
