package day31_CustomClass_Constructors.scrumTask;

public class MyScrumTeam {
    public static void main(String[] args) {
        //4 testers objects
        Tester tester1 = new Tester("Aysegul", 26, "QA", 110000);
        Tester tester2 = new Tester("Yusuf", 27, "SDET", 142000);
        Tester tester3 = new Tester("Zehra", 23, "SDET", 135000);
        Tester tester4 = new Tester("Betul", 41, "SDET", 115000);

        Tester[] testers = {tester2, tester3, tester4};

        //4 developers objects
        Developer developer1 = new Developer("Olga", 22, "Java Developer", 125000);
        Developer developer2 = new Developer("Aygun", 39, "Java Master", 185000);
        Developer developer3 = new Developer("Tunc", 28, "Software Developer", 135000);
        Developer developer4 = new Developer("Sinem", 13, "Senior Developer", 200000);

        Developer[] developers = {developer2, developer3, developer4};

        //1 ScrumTeam Object
        ScrumTeam scrum = new ScrumTeam("Nigara", "Huseyin", "Neira", 14);

        scrum.addTester(tester1);
        scrum.addDeveloper(developer1);

        scrum.addTesters(testers);
        scrum.addDevelopers(developers);

        System.out.println(scrum);
        System.out.println("------------------------------------------------------------------");

        for (Tester eachTester : scrum.testersList) {
            System.out.println(eachTester.name + " : " + eachTester.Salary);
        }

        System.out.println("-----------------------------------------------------------------");

        for (Developer eachDev : scrum.devopsList) {
            System.out.println(eachDev.name + " : " + eachDev.Salary);
        }

        scrum.removeTester(23);
        scrum.removeDeveloper(22);

        System.out.println(scrum);


    }


}
