public class Rectangle {
    private int x;
    private int y;
    private int width;
    private int height;

    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
        x = 0;
        y = 0;
    }

    public Rectangle() {
        x = 0;
        y = 0;
        width = 0;
        height = 0;
    }

    public double calculateArea(int width, int height) {
        double area = width * height;
        return area;

    }

    public double calculatePerimeter() {
        double perimeter = (2 * width) + (2 * height);
        return perimeter;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

}
