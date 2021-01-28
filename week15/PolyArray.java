package a_review.week15;

import day07_control_flow_statements.SmallTasks;

public class PolyArray {

    public static void main(String[] args) {
        IPhone phone1 = new IPhone("11", 8.0, 1999);
        Samsung phone2 = new Samsung("note", 8.0, 1000);
        CyberPhone phone3 = new CyberPhone();

        Phone [] phones = new Phone[3];
        phones[0] = phone1;
        phones[1] = phone2;
        phones[2] = phone3;
        
        for(Phone each : phones) {
            System.out.println(each.brand + " " + each.price);

        }

    }

}
