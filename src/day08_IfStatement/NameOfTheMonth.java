package day08_IfStatement;

public class NameOfTheMonth {
    public static void main(String[] args) {
        int m = 10;
        String month;

        if (m==1){
            month="January";
        } else if (m==2) {
            month="February";
        } else if (m== 3) {
            month="March";
        } else if (m==4) {
            month="April";
        } else if (m==5) {
            month="May";
        } else if (m==6) {
            month="June";
        } else if (m==7) {
            month="July";
        } else if (m==8) {
            month="August";
        } else if (m==9) {
            month="September";
        } else if (m==10) {
            month="October";
        } else if (m==11) {
            month="November";
        } else {
            month="December";
        }
        System.out.println("month is: "+month);

    }
}
