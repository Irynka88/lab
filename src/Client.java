import java.util.List;
import java.util.Scanner;

public class Client {
    String name;
    int money;

    public  Client(){

    }

    void  greetings(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть імя");
        name = scanner.nextLine();
        System.out.println("Власні кошти грн");
        money = scanner.nextInt();
        if(money < 200){
            System.out.println("У вас недостатньо коштів , мінімальна вартість процедури 200грн");
        }

    }

    int chooseServise(){

        System.out.println("Доброго дня! " + name + ", бажаєте зробити процедуру чи придбати курс?");
        System.out.println("№11 (процедура)");
        System.out.println("№22 (курс)");
        Scanner sc = new Scanner(System.in);
        int service = sc.nextInt();
        return service;



    }

    public void favorChoose () {
        System.out.println("Оберіть будь ласка , процедуру:");
        System.out.println("1.Фарбування брів фарбою/хною");
        System.out.println("2.Ламінування брів");
        System.out.println("3.Ламінування вій");
        System.out.println("4.Нарощення вій (класика / 2Д / 3Д + різні ефекти)");
        System.out.println("5.Макіяж нюд / вечірній / весільний");
        System.out.print("№: ");
    }

    public void courseChoose(){
        System.out.println("Оберіть будь ласка , курс:");
        System.out.println("1.*Базовий курс архітектура брів*");
        System.out.println("2.*Курс повищення кваліфікації бровиста*");
        System.out.println("3.*Базовий курс lash-мейкер з нуля*");
        System.out.println("4.*Курс повищення кваліфікації lash-мейкера*");
        System.out.println("5.*Курс самомакіяжу та нюдового макіяжу*");
        System.out.println("6.*Курс вечірніх / весільних макіяжів*");
        System.out.print("№: ");
    }








}


