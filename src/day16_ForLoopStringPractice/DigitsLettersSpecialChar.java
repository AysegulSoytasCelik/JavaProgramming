package day16_ForLoopStringPractice;

public class DigitsLettersSpecialChar {
    public static void main(String[] args) {
        String str = "Cydeo12345School!@$% WoodenSpoon";
        String digits = "";//12345
        String letters = "";//CydeoSchoolWoodenSpoon
        String specialChars = ""; //!@$%

        for (int i = 0; i < str.length(); i++) { //i: index numbers of str
            char ch = str.charAt(i);//ch:each character that we have in str
            if (ch >= '0' && ch <= '9') {
                digits += ch;
            } else if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
                letters += ch;
            } else {
                if (ch!=' ')//if the special character is not a space
                specialChars += ch;
            }
        }
        System.out.println("digits= " + digits);
        System.out.println("letters= " + letters);
        System.out.println("specialchars= "+specialChars);

    }


}