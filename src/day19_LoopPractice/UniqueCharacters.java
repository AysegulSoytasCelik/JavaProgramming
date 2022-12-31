package day19_LoopPractice;

public class UniqueCharacters {
    public static void main(String[] args) {
        /*
 2. Write a program that can find the unique characters from a string
        without using indexOf() and lastIndexOf() methods
                    Ex:
                        str = "aabccdeef";

                        output:
                                bdf
         */
        String str = "aabccdeef";
        String result = "";  //unique characters bdf
        for (int j = 0; j < str.length(); j++) {
            char ch=str.charAt(j); //'A'
            int count = 0; //represents the frequency of the ch

            for (int i = 0; i < str.length(); i++) { //compares the character that outer loop
                                                    // picked,with each character of the string,

                char each = str.charAt(i); //each character of str
                if (ch==each){
                    count++;
                }

            }

            if (count==1){   //if the frequency of the character is 1, then the character is unique.
                result+=ch;
            }
        }

        System.out.println(result);

    }
}
