package a_review.week13;

public final class Tester extends Employee{ // Tester IS An Employee, Tester IS A Person

    public Tester(String name, int age, char gender, String ID, String jobTitle, double hourlyRate, boolean isFullTime) {
        super(name, age, gender, ID, jobTitle, hourlyRate, isFullTime);
    }

    public void findBug(){
        System.out.println(jobTitle+" "+name+" found a bug");
    }

    public void testing(){
        System.out.println(jobTitle+" "+name+" is testing the application");
    }

    @Override
    public void work(){
        System.out.println(jobTitle+" "+name+" is automating the application");
    }

}

/*
Tester extends Employee:
		attributes: name, age, gender, hourlyRate, jobTitle, isFullTime

 */
