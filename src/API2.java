/**
 * Concrete Implementor: API2
 * Implements the DrawingAPI interface for drawing rectangles using API2.
 */
public class API2 implements DrawingAPI {
    @Override
    public void drawRectangle(int x1, int y1, int x2, int y2) {
        // Calculates width, height, and intersection point of diagonals, then draws the rectangle using API2
        int width = Math.abs(x2 - x1);
        int height = Math.abs(y2 - y1);
        int intersectionX = (x1 + x2) / 2;
        int intersectionY = (y1 + y2) / 2;
        System.out.println("Drawing rectangle using API2 with intersection point (" + intersectionX + "," + intersectionY + ") with width " + width + " and height " + height);
    }
}