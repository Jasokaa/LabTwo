/**
 * Client code
 * Demonstrates the use of different DrawingAPI implementations to draw rectangles.
 */
public class Main {
    public static void main(String[] args) {
        DrawingAPI api1 = new API1();
        DrawingAPI api2 = new API2();
        // Create and draw a rectangle using API1
        GraphicObject rectangle1 = new Rectangle(api1, 1, 2, 5, 8); // Opposite coordinates of the rectangle
        rectangle1.draw();
        // Create and draw a rectangle using API2
        GraphicObject rectangle2 = new Rectangle(api2, 1, 2, 5, 8); // Opposite coordinates of the rectangle
        rectangle2.draw();
    }
}
