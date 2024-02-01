//add public class "MyApplication"
public class MyApplication {
    //create the "main" method. code execution begins with this method
    public static void main(String[] args) {
        // Create several points
        Point point1 = new Point(0, 0);
        Point point2 = new Point(1, 1);
        Point point3 = new Point(0, 1);
        Point point4 = new Point(1, 5);
        Point point5 = new Point(1, 5);

        // collecting points into an array
        Point[] points = { point1, point2, point3, point4, point5 };

        // creating a figure from dots
        Shape shape = new Shape(points);

        // displaying information about the figure
        System.out.println("Perimeter: " + shape.perimeter());
        System.out.println("Longest side: " + shape.longestSide());
        System.out.println("Average side: " + shape.averageSide());
    }
}

