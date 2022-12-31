package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListPractice {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            list.set(i,  list.get(i)*2);  //set method==> xxx.set(index number, new element to replace it)
            // index sayisi yerine i, yeni elemet yerine baska bir method( get() )
        }
        System.out.println("list = " + list);
        System.out.println("------------------------------------------------------------------");

        ArrayList<String> employees = new ArrayList<>();
        employees.add("Aysegul");
        employees.add("Zehra");
        employees.add("Yusuf");
        employees.add("Betul");
        employees.add("Celik");
        employees.add("Nur");
        employees.add("Emine");

        System.out.println(employees); // [Aysegul, Zehra, Yusuf, Betul, Celik, Nur, Emine]

        employees.remove(4);  //4.indextekini cikar
        System.out.println(employees); // [Aysegul, Zehra, Yusuf, Betul, Nur, Emine]

        employees.remove(4);
        System.out.println(employees); // [Aysegul, Zehra, Yusuf, Betul, Emine]

        employees.remove(0);
        System.out.println(employees); // [Zehra, Yusuf, Betul,Emine]

        employees.remove(employees.size()-1); //we are using 2 arrayList methods in the same time to find the arrays last index
        System.out.println(employees);

        employees.remove("Yusuf"); //this time remove the given object
        System.out.println(employees); // [Zehra, Betul]

        boolean r1 = employees.remove("Zehra");
        boolean r2= employees.remove("Betul");

        System.out.println(employees); // []
        System.out.println(r1);
        System.out.println(r2);

    }
}
/*
{1,2,3,4,5,6}

{2,4,6,8,10,12}
 */