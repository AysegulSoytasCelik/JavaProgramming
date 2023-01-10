package day42_ThrowsKeyword;

public class MorningWorkOut {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("---------------------------push up started------------------------------");

        for (int i = 1; i <= 30; i++) {

            System.out.print("\rPush up "+i);

            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


        System.out.println("-------------------push ups completed-------------------------------");


        System.out.println("-------------------pull up started-------------------------------");
        for (int i = 1; i <=20 ; i++) {
            System.out.print("\rPull up"+i);
            try{
                Thread.sleep(1500);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }

        System.out.println("------------------pull up completed------------------------");
    }

    public static void sleep(double seconds){

        try {
            Thread.sleep((long)(seconds*1000));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
/*
Warmup task:
	MorningWorkOut:
			1. Do 30 push-ups and try pausing 1.5 seconds in each


			2. Do 20 Pull-ups and try pausing 2.5 seconds in each

 */