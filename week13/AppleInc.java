package a_review.week13;

import java.util.Arrays;

public class AppleInc {

    public static void main(String[] args) {
        Tester tester1 = new Tester("Ali", 28, 'M', "A01", "QA", 55, true);
        Tester tester2 = new Tester("Joseph", 28, 'M', "A02", "SDET", 50, true);
        Tester tester3 = new Tester("Serkan", 28, 'M', "A03", "QA", 52, true);

        Tester[] testers = {tester2, tester3};

        Developer developer1 = new Developer("Eren", 29, 'F', "B01", "Java Developer", 65, true);
        Developer developer2 = new Developer("Zeynep", 29, 'F', "B02", "Software Developer", 66, true);
        Developer developer3 = new Developer("Safiye", 29, 'F', "B03", "Java Developer", 67, true);
        Developer developer4 = new Developer("Nurullah", 29, 'M', "B04", "Junior Developer", 68, true);

        Developer[] developers = {developer2, developer3, developer4};

        ScrumTeam scrum1 = new ScrumTeam("Yakup", "Ilyas", "Baky");
        scrum1.hireTester(tester1);
        scrum1.hireDeveloper(developer1);

        scrum1.hireTester(testers);
        scrum1.hireDeveloper(developers);
        System.out.println(scrum1);

        System.out.println("===================================================");
        double budget = 0;

        // display the developers of the scrum team:
        for(Developer each : scrum1.developers){
            System.out.println( each.name +" : "+each.calculateSalary());
            budget += each.calculateSalary();
        }

        System.out.println("=================================================");
        // display the testers of the scrum team:
        for(Tester each  : scrum1.testers){
            System.out.println(each.name +" : "+each.calculateSalary());
            budget += each.calculateSalary();
        }

        System.out.println("====================================================");
        // display the budget for developers and testers:

        System.out.println("budget = " + budget);

        System.out.println("=====================================================");
        ScrumTeam scrum2 = new ScrumTeam("Yakup", "Ilyas", "Baky");
        ScrumTeam scrum3 = new ScrumTeam("Yakup", "Ilyas", "Baky");

        ScrumTeam[] scrums = {scrum1, scrum2, scrum3};

        for(ScrumTeam eachScrum : scrums){
            System.out.println(eachScrum);
        }


        System.out.println(Arrays.toString(scrums));


        System.out.println("========================================================");
        scrum1.terminateTester("A01");
        scrum1.terminateDeveloper("B04");
        System.out.println(scrum1);


    }

}
