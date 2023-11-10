public class Service {
    private String type;
    private int price;
    private double time;



    public Service(String type, int price, double time) {
        this.type = type;
        this.price = price;
        this.time = time;
    }

    // Інформація про послугу
    void moreInfo() {
        System.out.println(type + " " + "тривалість " + time + "год , ціна залежить від досвіду майстра");
    }

    void findPrice(Employee employee) {
        if (employee.experience.equalsIgnoreCase("майстер")) {
            System.out.println("Ціна " + (price + 100) + "грн");
        } else {
            System.out.println("Ціна " + price + "грн");
        }
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public double getTime() {
        return time;
    }

}



