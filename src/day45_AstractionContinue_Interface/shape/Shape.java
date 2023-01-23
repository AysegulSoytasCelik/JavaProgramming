package day45_AstractionContinue_Interface.shape;

public abstract class Shape implements Volume{

   private final String name;

    public Shape(String name) {this.name = name; }

    public String getName() {return name;}

    public  abstract double area();

    public abstract double perimeter();

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' ;
    }
}
