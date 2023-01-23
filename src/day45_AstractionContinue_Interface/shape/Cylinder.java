package day45_AstractionContinue_Interface.shape;

public class Cylinder extends Shape implements Volume{
    public Cylinder() {
        super("Cylinder");
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public double perimeter() {
        return 0;
    }


    @Override
    public double volume() {
        return 0;
    }
}
