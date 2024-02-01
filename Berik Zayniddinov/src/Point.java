// add public class "Point"
public class Point {
    // add variables to store point coordinates
    double x;
    double y;

    // create a constructor to create a new point with x and y coordinates
    public Point(double x, double y) {
        // use the "this" keyword to differentiate between instance variables "x" and "y"
        this.x = x;
        this.y = y;
    }

    // declare the "distanceTo" method to calculate the distance from one point to another
    public double distanceTo(Point other) {
        // This line returns the distance to another point
        return Math.sqrt(Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2));
    }

    // declare a method for representing a point as a string
    public String toString() {
        return "Point(" + x + ", " + y + ")";
    }
}
