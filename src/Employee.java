public class Employee {
    String name;
    String profession;
    String experience;



    public Employee(String name, String profession, String experience) {
        this.name = name;
        this.profession = profession;
        this.experience = experience;
    }
    //Знайомство з працівником
    void employee(){
        System.out.println("Привіт!");
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getProfession() {
        return profession;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getExperience() {
        return experience;
    }
}
