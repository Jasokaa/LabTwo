/**
 * Implementor interface: DrawingAPI
 * Defines the interface for drawing a rectangle.
 */
public interface DrawingAPI {
    /**
     * Draws a rectangle using the given coordinates.
     *
     * @param x1 The x-coordinate of the first point.
     * @param y1 The y-coordinate of the first point.
     * @param x2 The x-coordinate of the second point.
     * @param y2 The y-coordinate of the second point.
     */
    void drawRectangle(int x1, int y1, int x2, int y2);
}
