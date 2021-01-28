package a_review.week13;

public class Employee extends Person { // Employee IS A Person

    public double hourlyRate;
    public String jobTitle, ID;
    public boolean isFullTime;

    public Employee(String name, int age, char gender, String ID, String jobTitle, double hourlyRate, boolean isFullTime){
        super(name, age, gender);
        this.ID = ID;
        this.jobTitle =jobTitle;
        this.hourlyRate = hourlyRate;
        this.isFullTime = isFullTime;
    }

    public void work(){
        System.out.println(jobTitle+" "+name+" is working");
    }

    public double calculateSalary(){ // 40 hours in a week, 52 weeks in a year
        if(isFullTime) {
            return hourlyRate * 40 * 52; // 40 hours for full time
        }
        return hourlyRate * 20 * 52; // 20 hours for  part time
    }

    @Override
    public String toString() {
        return "Employee{" +
                "jobTitle= '" + jobTitle + '\'' +
                ", name= '" + name + '\'' +
                ", gender= " + gender +
                ", age= " + age +
                ", ID= '" + ID + '\'' +
                ", hourlyRate= $" + hourlyRate +
                ", isFullTime= " + isFullTime +
                ", Salary= $"+ calculateSalary()+
                '}';
    }

}

/*

	Employee extends Person:
		attributes: name, age, gender, hourlyRate, jobTitle, ID, isFullTime
 */
