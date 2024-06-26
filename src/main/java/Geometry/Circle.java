package Geometry;

public class Circle implements Figure{
    private double r;
    private String borderColor;
    private String fillColor;

    public Circle(double r, String borderColor, String fillColor){
        this.r = r;
        this.borderColor=borderColor;
        this.fillColor=fillColor;
    }

    public Circle(double r){
        this.r = r;
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
        return 2*Math.PI*r;
    }

    @Override
    public double square() {
        return Math.PI*(Math.pow(r,2));
    }
    public void printInfo(){
        System.out.printf("Периметр круга: %s\nПлощадь круга: %s\nЦвет границы круга: %s\nЦвет заливки круга: %s\n",perimeter(),square(),getBorderColor(),getFillColor());
    }
}
