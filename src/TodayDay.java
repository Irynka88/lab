public class TodayDay {
    String day;


    public TodayDay(String day) {
        this.day = day;
    }

    //Генерація знижки
    void sale() {
        System.out.println("По вівторках та суботах у нас працює акція TodayDay! Ваша знижка " + ((int) (50 + Math.random() * 51)) + "грн");
    }


    public void setDay(String day) {
        this.day = day;
    }

    public String getDay() {
        return day;
    }
}
    // Залишок коштів



