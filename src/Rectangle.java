/**
 * Refined Abstraction: Rectangle
 * Represents a rectangle graphic object.
 */
public class Rectangle implements GraphicObject {
    private final DrawingAPI drawingAPI;
    private final int x1, y1, x2, y2;

    /**
     * Constructs a rectangle with the specified DrawingAPI and coordinates.
     *
     * @param drawingAPI The DrawingAPI implementation to use.
     * @param x1         The x-coordinate of the first point.
     * @param y1         The y-coordinate of the first point.
     * @param x2         The x-coordinate of the second point.
     * @param y2         The y-coordinate of the second point.
     */
    public Rectangle(DrawingAPI drawingAPI, int x1, int y1, int x2, int y2) {
        this.drawingAPI = drawingAPI;
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    @Override
    public void draw() {
        // Draws the rectangle using the specified DrawingAPI
        drawingAPI.drawRectangle(x1, y1, x2, y2);
    }
}