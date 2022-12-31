package day04_Variables;

public class Rectangle {
    public static void main(String[] args) {
        double lenght = 10.5;
        double width = 5.5;
        double area = lenght * width;
        double perimeter = (lenght + width) * 2;

        System.out.println("width = " + width);
        System.out.println("lenght = " + lenght);
        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);

    }
}
/*
Create a class named Rectangle, write a program that can calculate the area & perimeter of any given Rectangle
						length
						width

						area = length * width
						perimeter =  2 * (length + width)

 */