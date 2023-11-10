public class EmployeeTeach extends Employee{

    private  int yearOfExperience;

    public EmployeeTeach(String name, String profession, String experience, int yearOfExperience) {
        super(name, profession, experience);
        this.yearOfExperience = yearOfExperience;
    }

    void employee(){
        System.out.println("Привіт! Я " + getName());
    }


}
