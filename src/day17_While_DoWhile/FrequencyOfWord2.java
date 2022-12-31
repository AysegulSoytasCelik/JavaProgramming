package day17_While_DoWhile;

public class FrequencyOfWord2 {
    public static void main(String[] args) {
        String str = " Cat Cat Dog Dog cAt CAT CaT";
        int frequency = 0;

        for (int i = 0; i <= str.length() - 3; i++) {
            String eachSub = str.substring(i, i + 3);
            if (eachSub.equalsIgnoreCase("Cat")) {
                frequency++;
            }

        }

        System.out.println(frequency);
        System.out.println("===============================================================");
        String str2 = "Abla abla Abla ABla abi abi abi ABI";
        int frequency2 = 0;

        for (int i = 0; i <= str2.length() - 4; i++) {
            String eachWord = str2.substring(i, i + 4);
            if (eachWord.equalsIgnoreCase("abla")) {
                frequency2++;
            }

        }

        System.out.println(frequency2);
        System.out.println("======================================================");
        String str3 = "Process finished with exit code 0";
        char ch ='i';
        int frequancy3 = 0;

        for (int i = 0; i <str3.length() ; i++) {
            char eachChar= str3.charAt(i);
            if (eachChar==ch){
                frequancy3++;
            }

        }
        System.out.println(frequancy3);

    }
}
