package a_review.week13;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {
    public String BA, PO, SM;

    public ArrayList<Tester> testers ;
    public ArrayList<Developer> developers;

    public ScrumTeam(String BA, String PO, String SM){
        this.BA = BA;
        this.PO = PO;
        this.SM = SM;
        testers = new ArrayList<>();
        developers = new ArrayList<>();
    }

    public void hireTester(Tester tester){ // adds one tester to the arraylist of testers
        testers.add(tester);
    }

    public void hireTester(Tester[] testers){  // adds array of Testers to the arraylist of testers
        this.testers.addAll(  Arrays.asList(testers ) );
    /*
        for(Tester eachTester : testers) {
            hireTester(eachTester);
        }
     */

    }

    public void hireDeveloper(Developer developer){ // adds one developer to the arraylist of developers
        developers.add(developer);
    }

    public void hireDeveloper(Developer[] developers){  // adds array of Developerss to the arraylist of Developers
      this.developers.addAll( Arrays.asList(developers)  );
            /*
                for(Developer eachDeveloper : developers )  {
                    hireDeveloper(eachDeveloper);
                }
         */
    }

    public void terminateTester(String ID){ // removes tester by ID
       // testers.removeIf( p -> p.ID.equals(ID) );

        Tester tester = null;
        for(Tester each: testers){
            if(each.ID.equals(ID)){
                tester = each;
            }
        }

        testers.remove(tester);

    }

    public void terminateDeveloper(String ID){ // developer tester by ID
        Developer developer = null;

        for(Developer each : developers){
            if( each.ID.equals(ID) ){
                developer = each;
            }
        }
        developers.remove(developer);

    }

    public void dailyStandUp(){
        System.out.println(SM+" is doing daily stand up meeting");
    }

    @Override
    public String toString() {
        return "ScrumTeam{" +
                "BA='" + BA + '\'' +
                ", PO='" + PO + '\'' +
                ", SM='" + SM + '\'' +
                ", testers= " + testers.size() +
                ", developers= " + developers.size() +
                '}';
    }

}

/*
ScrumTeam:
		attributes:
			BA, PO, SM (String)
			ArrayList<Tester>
			ArrayList<Developer>
 */
