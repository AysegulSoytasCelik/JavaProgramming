package day28_ArrayList;

public class StrongPassword2 {

    public static void main(String[] args) {

        String password ="WoodenSp@@n123";

        int countUpperCase = 0;
        int countLowerCase =0;
        int countDigits =0;
        int countSpecialCharacters = 0;

        for (int i = 0; i < password.length(); i++) {
            char each = password.charAt(i);

            if (Character.isUpperCase(each)){
                countUpperCase++;
            } else if (Character.isLowerCase(each)) {
                countLowerCase++;
            } else if (Character.isDigit(each)) {
                countDigits++;
            }else{
                countSpecialCharacters++;
            }
        }
        System.out.println(countLowerCase);
        System.out.println(countUpperCase);
        System.out.println(countSpecialCharacters);
        System.out.println(countDigits);


        //same question, solve with boolean expression
        boolean hasUpperCase = countUpperCase>0;
        boolean hasLowerCase = countLowerCase>0;
        boolean hasDigit = countDigits>0;
        boolean hasSpecialChar = countSpecialCharacters>0;

       boolean strongPassword =password.length()>=8 && !password.contains(" ") && hasUpperCase
               && hasLowerCase && hasDigit && hasSpecialChar;
        System.out.println("strongPassword: " +strongPassword);
/*
        boolean strongPasword=false;
        if (password.length()>=8){
            if (!password.contains(" ")){
                if (hasUpperCase){
                    if (hasLowerCase){
                        if (hasDigit){
                            if (hasSpecialChar){
                                strongPasword=true;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(strongPasword);
*/


    }
}
