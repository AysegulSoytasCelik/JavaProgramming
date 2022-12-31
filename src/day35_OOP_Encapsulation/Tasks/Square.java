package day35_OOP_Encapsulation.Tasks;

public class Square {

    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side<=0){
            System.out.println("side should not be negative");
            return;
        }
        this.side = side;
    }

    public Square(double side) {
        this.side = side;
    }
    //Methods:
    //calcArea(): returns the area of square

    public double calcArea() {
        return side * side;
    }
    //calcPerimeter(): returns the perimeter of square
     public double calcPerimeter(){
        return side*4;
     }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                "area=" + calcArea() +
                "perimeter=" + calcPerimeter() +
                '}';
    }

    public static void main(String[] args) {
        Square square=new Square(12.5);

        System.out.println("square.calcPerimeter() = " + square.calcPerimeter());
        System.out.println("square.calcArea() = " + square.calcArea());

        double area = square.calcArea();
        System.out.println(area);

    }

    //toString(): can display the side, area, perimeter of square when object is passed in print statement




    //1. Square Task:
    //		1.1 Create a class named Square:
    //				Private variables:
    //					side

    //				Encapsulate all the fields
    //
    //					Condition:
    //						side of the square should not be negative


    //
    //				Add a constructor that allows user to set all the fields when the object is created.
    //								(If the arguments not valid it should not be set to the instances)
    //
    //				Methods:
    //					calcArea(): returns the area of square
    //					calcPerimeter(): returns the perimeter of square
    //					toString(): can display the side, area, perimeter of square when object is passed in print statement
}
