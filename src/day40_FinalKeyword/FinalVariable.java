package day40_FinalKeyword;

public class FinalVariable {
    final String birthDay;

   final static String name;

   static {
       name="Batch 10";
   }


    public FinalVariable(String birthDay) {
        this.birthDay = birthDay;
    }


    public  static void main(String[] args) {

        final double pi = 3.14;
        // pi = 4.14;  final variables CAN NOT be REASSIGNED
        // pi=5.4;

        final String name;
        name = "Java";
        //   name ="Wooden Spoon";  ==> name's variable is 'final' so you CAN NOT be REASSIGNED it

        System.out.println(name);
        System.out.println("-------------------------------------------------------------------------");

        FinalVariable obj = new FinalVariable("Oct/02");

      //  obj.birthDay="June/01"; ==> final variables  can NOT be REASSIGNED

        System.out.println(obj.birthDay);

        System.out.println(FinalVariable.name); // --> batch 10
        // because static runs first

    }
}
