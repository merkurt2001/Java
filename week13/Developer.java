package a_review.week13;

public final class Developer extends Employee {

    public Developer(String name, int age, char gender, String ID, String jobTitle, double hourlyRate, boolean isFullTime) {
        super(name, age, gender, ID, jobTitle, hourlyRate, isFullTime);
    }

    public void coding(){
        System.out.println(jobTitle+" "+name+" is coding");
    }

    public void fixingBug(){
        System.out.println(jobTitle+" "+name+" is fixing bug");
    }

    @Override
    public void work(){
        System.out.println(jobTitle+" "+name+" is creating the application");
    }


}
