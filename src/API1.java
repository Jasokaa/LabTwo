/**
 * Concrete Implementor: API1
 * Implements the DrawingAPI interface for drawing rectangles using API1.
 */
public class API1 implements DrawingAPI {
    @Override
    public void drawRectangle(int x1, int y1, int x2, int y2) {
        // Draws the rectangle using API1 with all four coordinates
        System.out.println("Drawing rectangle using API1 with coordinates (" + x1 + "," + y1 + "), (" + x2 + "," + y1 + "), (" + x2 + "," + y2 + "), (" + x1 + "," + y2 + ")");
    }
}
