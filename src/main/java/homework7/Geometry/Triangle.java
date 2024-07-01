package homework7.Geometry;

public class Triangle implements Figure {
    private double sideOne;
    private double sideTwo;
    private double sideThree;
    private String borderColor;
    private String fillColor;

    public Triangle(double sideOne, double sideTwo, double sideThree, String borderColor, String fillColor) {
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.sideThree = sideThree;
        this.borderColor = borderColor;
        this.fillColor = fillColor;
    }

    public Triangle(double sideOne, double sideTwo, double sideThree) {
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.sideThree = sideThree;
    }

    public void setBorderColor(String borderColor) {
        this.borderColor = borderColor;
    }

    public void setFillColor(String fillColor) {
        this.fillColor = fillColor;
    }

    public String getBorderColor() {
        return borderColor;
    }

    public String getFillColor() {
        return fillColor;
    }

    @Override
    public double perimeter() {
        return sideOne + sideTwo + sideThree;
    }

    @Override
    public double square() {
        double midP = perimeter() / 2;
        return Math.sqrt(midP * (midP - sideOne) * (midP - sideTwo) * (midP - sideThree));
    }

    public void printInfo() {
        System.out.printf("Периметр треугольника: %s\nПлощадь треугольника: %s\nЦвет границы треугольника: %s\nЦвет заливки треугольника: %s\n", perimeter(), square(), getBorderColor(), getFillColor());
    }

}
