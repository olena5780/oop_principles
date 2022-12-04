package oop_principles.encapsulation;

public class Employee {


    public Employee(){}

    //4-args constructor


    public Employee(String fullName, String jobPosition, int age, Company company) {
        this.fullName = fullName;
        this.jobPosition = jobPosition;
        this.age = age;
        this.company = company;
    }

    //Instance variables
    private String fullName;
    private String jobPosition;
    private int age;
    private Company company;

    //getters and setters
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getJobPosition() {
        return jobPosition;
    }

    public void setJobPosition(String jobPosition) {
        this.jobPosition = jobPosition;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    //toString() method
    @Override
    public String toString() {
        return "Employee{" +
                "fullName='" + fullName + '\'' +
                ", jobPosition='" + jobPosition + '\'' +
                ", age=" + age +
                ", company=" + company +
                '}';
    }
}