package pl.zzpj2020.solid.lsp.shape;

public class Rectangle implements Shape {
    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double calculateSurfaceArea() {
        return height * width;
    }

    public double calculateCircumference() {
        return height * 2 + width * 2;
    }
}
