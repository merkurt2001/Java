package day11_controlFlowStatements_5;

public class task51_Clock {

	public static void main(String[] args) {
		
		for(int hours=1;hours<=12;hours++) {
			for(int minutes=0;minutes<=59;minutes++) {
				for(int seconds=0;seconds<=59;seconds++) {
					//System.out.println(hours+":"+minutes+":"+seconds); //window preferences run debug console limit console output
					System.out.printf("%02d:%02d:%02d\n",hours,minutes,seconds);
					
					//https://www.baeldung.com/java-printstream-printf
				}
			}
		}

	}

}
