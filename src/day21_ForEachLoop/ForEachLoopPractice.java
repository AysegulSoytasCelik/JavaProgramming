package day21_ForEachLoop;

public class ForEachLoopPractice {
    public static void main(String[] args) {
        String[] words= {"Java Programming", "Cydeo School", "Wooden Spoon", "Early Birds", "Angry Birds"};
        for (String each:words){
            System.out.println(each.charAt(0)+" "+each.charAt(each.length()-1) );
            //if u write only chars and try to concat them, the result will be normal addition
            //because every single char has a number
            //so, we should put string between them
        }




    }
}
