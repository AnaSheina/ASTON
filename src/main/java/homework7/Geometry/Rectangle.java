package homework7.Geometry;

public class Rectangle implements Figure{
    private double sideOne;
    private double sideTwo;
    private String borderColor;
    private String fillColor;

    public Rectangle(double sideOne, double sideTwo, String borderColor, String fillColor){
        this.sideOne=sideOne;
        this.sideTwo=sideTwo;
        this.borderColor=borderColor;
        this.fillColor=fillColor;
    }
    public Rectangle(double sideOne, double sideTwo){
        this.sideOne=sideOne;
        this.sideTwo=sideTwo;
    }

    public void setBorderColor(String borderColor) {
        this.borderColor = borderColor;
    }

    public void setFillColor(String fillColor) {
        this.fillColor = fillColor;
    }
    public String getBorderColor(){
        return borderColor;
    }
    public String getFillColor(){
        return fillColor;
    }

    @Override
    public double perimeter() {
        return (sideOne+sideTwo)*2;
    }

    @Override
    public double square() {
        return sideOne*sideTwo;
    }

    public void printInfo() {
        System.out.printf("Периметр прямоуголника: %s\nПлощадь прямоуголника: %s\nЦвет границы прямоуголника: %s\nЦвет заливки прямоуголника: %s\n", perimeter(), square(), getBorderColor(), getFillColor());
    }
}
