package day28_ArrayList;

import java.util.ArrayList;

public class UniqueElements {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Java"); //0
        list.add("Java"); //1
        list.add("Java"); //2
        list.add("Python"); //3 ilk ve son index esit
        list.add("C#"); //4
        list.add("C#"); //5
        list.add("C#"); //6
        list.add("Ruby"); //7 ilk ve son index esit
        list.add("C++"); //8
        list.add("C++"); //9
        System.out.println(list);

        ArrayList<String > unique =new ArrayList<>();
        for (String each : list) {
            if (list.indexOf(each)==list.lastIndexOf(each)){
                unique.add(each);
                //element, ilk okundugu index ile son okundugu index esit olunca tek oldugu anlamina geliyor
            }
        }
        System.out.println(unique);
    }


}
