package ClassBox_01;

public class Box {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        setLength(length);
        setWidth(width);
        setHeight(height);
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    private void setLength(double length) {
        if (isPositiveNumber(length)){
            this.length = length;
        }
    }

    private void setWidth(double width) {

        if (isPositiveNumber(width)){
            this.width = width;
        }
    }

    private void setHeight(double height) {
        if (isPositiveNumber(height)){
            this.height = height;
        }
    }

    private boolean isPositiveNumber(double number){
        if (number <= 0){
            throw new IllegalArgumentException("Width cannot be zero or negative.");
        }
        return true;
    }

    public double calculateSurfaceArea(){
        return 2 * length * width + 2 * length * height + 2 * width * height;
    }

    public double calculateLateralSurfaceArea(){
        return 2 * length * height + 2 * width * height;
    }

    public double calculateVolume(){
        return length * width * height;
    }
}
