//add public class "Shape"
public class Shape {
    // an array is used to store the points that make up a shape
    Point[] points;

    // constructor for creating a shape from an array of points
    public Shape(Point[] points) {
        this.points = points;
    }

    // Method for calculating the perimeter of a figure
    public double perimeter() {
        double totalPerimeter = 0;
        for (int i = 0; i < points.length; i++) {
            // Go to the first point after the last
            Point current = points[i];
            Point next = points[(i + 1) % points.length];
            //The distance between the current and next points is added to the perimeter
            totalPerimeter += current.distanceTo(next);
        }
        return totalPerimeter;
    }

    // method for finding the longest side of a shape
    public double longestSide() {
        //the variable "maxSide" will be used to store the longest side at the moment
        double maxSide = 0;
        for (int i = 0; i < points.length; i++) {
            Point current = points[i];
            Point next = points[(i + 1) % points.length];
            double sideLength = current.distanceTo(next);
            if (sideLength > maxSide) {
                maxSide = sideLength;
            }
        }
        return maxSide;
    }

    // method for calculating the average length of the sides of a figure
    public double averageSide() {
        return perimeter() / points.length;
    }
}
