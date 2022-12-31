package day37_OOP_InheritanceContinue_SuperKeyword.scrumTask;

public class AmazonInc{

    public static void main(String[] args) {
        String company ="Amazon Inc";
        ProductOwner po = new ProductOwner("Yusuf",42,'M',27,160000,company);
        BusinessAnalyst ba = new BusinessAnalyst("Zehra",30, 'F',26,150000,company);
        ScrumMaster sm =new ScrumMaster("Betul", 25,'F',41,145000,company);

        Tester tester1= new Tester("Aysegul",41,'F',"QA",61,130000,company);
        Tester tester2=new Tester("Serkan",33,'M',"QA",11,125000,company);
        Tester tester3= new Tester("Ali",45,'M',"QA",261,125000,company);
        Tester tester4 = new Tester("Eda",30,'F',"QA",265,123000,company);
        Tester[] testers={tester1,tester2,tester3,tester4};


        Developer developer1 =new Developer("Muhtar", 35,'M',"Java Developer",234,145000,company);

        ScrumTeam scrumTeam= new ScrumTeam(po,ba,sm);
        scrumTeam.addDeveloper(developer1);
        scrumTeam.addTesters(testers);

        System.out.println(scrumTeam);

        System.out.println("------------------------------------------------------------");

        for (Tester tester : scrumTeam.testers) {
            System.out.println(tester.name+" : "+ tester.salary);
        }
        System.out.println("-----------------------------------------------------------------");

        for (Developer developer : scrumTeam.developers) {
            System.out.println(developer.name+" : "+developer.salary);
        }

    }
}
