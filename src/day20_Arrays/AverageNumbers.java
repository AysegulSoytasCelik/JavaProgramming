package day20_Arrays;

public class AverageNumbers {
    public static void main(String[] args) {
        int[] numbers ={10,20,30,40,50,60};
        double  sum =0; //add all elements. why double? may be divisions result will be decimal
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        double averageNumber =sum/numbers.length;
        System.out.println("average number " + averageNumber);










    }
}
