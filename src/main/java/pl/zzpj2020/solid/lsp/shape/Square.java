package pl.zzpj2020.solid.lsp.shape;

public class Square implements Shape {

    private double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double calculateSurfaceArea() {
        return sideLength * sideLength;
    }

    @Override
    public double calculateCircumference() {
        return sideLength * 4;
    }

}
