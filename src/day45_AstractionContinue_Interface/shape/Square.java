package day45_AstractionContinue_Interface.shape;

public class Square extends Shape implements Volume{

    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side<=0){
            throw new RuntimeException("invalid side: "+side);
        }
        this.side = side;
    }


    @Override
    public double area() {
        return side*side;
    }

    @Override
    public double perimeter() {
        return 4*side;
    }

    @Override
    public String toString() {
        return "Square{" +
                super.toString()+
                "side=" + side +
                '}';
    }

    public Square(double side) {
        super("Square");
        setSide(side);
    }

    @Override
    public double volume() {
        return 0;
    }
}
