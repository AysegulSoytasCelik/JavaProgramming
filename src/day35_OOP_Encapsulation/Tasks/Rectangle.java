package day35_OOP_Encapsulation.Tasks;

public class Rectangle {

    private double width;
    private double length;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width<=0){
            System.out.println("invalid perimeter");
            return;
        }
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length<=0){
            System.out.println("invalid perimeter");
            return;
        }
        this.length = length;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double calcArea(){
        return width*length;
    }

    public double calcPerimeter(){
        return 2*(width+length);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", calcArea()" + calcArea() +
                ", calcPerimeter()" + calcPerimeter() +
                '}';
    }

    public static void main(String[] args) {
       Rectangle rectangle = new Rectangle(12.5,23.6);

        System.out.println("rectangle.calcArea() = " + rectangle.calcArea());
        System.out.println("rectangle.calcPerimeter() = " + rectangle.calcPerimeter());


    }


}



/*
2. Rectangle Task:
		2.1 Create a class named Rectangle:
				Private variables:
					width, length

				Encapsulate all the fields
						Conditions:
							width of the rectangle should not be negative
							length of the rectangle should not be negative

				Add a constructor that allows user to set all the fields when the object is created.
						(If the arguments not valid it should not be set to the instances)

				Methods:
					calcArea(): returns the area of rectangle
					calcPerimeter(): returns the perimeter of rectangle
					toString(): can display the width, length, area, and perimeter of rectangle
					when object is passed in print statement
 */