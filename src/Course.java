public class Course {
    String title;
    int prices;
    int duration;



    public Course(String title, int prices, int duration) {
        this.title = title;
        this.prices = prices;
        this.duration = duration;

    }
        //Все про курс
    void course(Employee employee){
        if (employee.experience.equalsIgnoreCase("майстер")){
            System.out.println("Я можу записати вас на "+ title + ". Його вартість "+ prices + "грн , і тривалість "+ duration + " днів.");
        }
        else {
            System.out.println("Я ще не маю достатньо досвіду , щоб провеси курси(");
        }
    }
    void infoCourse(){
        System.out.println(title + " триває " + duration + " днів");
        System.out.println("Вартість даного курсу "+ prices + "грн");
    }


    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setPrices(int prices) {
        this.prices = prices;
    }

    public int getPrices() {
        return prices;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }
}
