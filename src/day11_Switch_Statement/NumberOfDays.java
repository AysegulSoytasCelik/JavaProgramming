package day11_Switch_Statement;

public class NumberOfDays {
    public static void main(String[] args) {
        /*
        NumberOfDays
			28 Days: 2
			30 days: 4, 6, 9, 11
			31 days: 1, 3, 5, 7, 8, 10, 12

			If(1~12){


			}else{
				Invalid
			}
         */
        int year = 2000;
        int number = 2;  //february not 28days in 2000
        String result ="";

        if (number>=1 && number<=12){
            switch (number){
                case 2:
                    /*if (year %4==0 ){
                        System.out.println("29days");
                    }else{
                        System.out.println("28days");
                   */
            result= (year %4 ==0)? "29days":"28days";
                    break;
                case 4: case 6: case 9: case 11:
                    //System.out.println("30days");
                    result = "30days";
                    break;
                default:
                    //System.out.println("31days");
                    result="31days";
            }

        }else{
            //System.out.println("invalid Number");
            result="invalid number";
        }
        System.out.println(result);






    }
}
