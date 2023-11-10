import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        System.out.println("―――――――――BEAUTY ROOM―――――――――");

        Client client = new Client();
        client.greetings();

        Client chooseFavor = new Client();
        Client chooseCourse = new Client();

        Scanner s = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);

        //Список працівників
        Employee firstBrow= new Employee("Олена" , "бровист" , "початківець");
        EmployeeTeach secondBrow = new EmployeeTeach("Діана","бровист" , "майстер",7);
        Employee firstLash = new Employee("Юлія", "lash-мейкер", "початківець");
        EmployeeTeach secondLash = new EmployeeTeach("Вікторія","lash-мейкер","майстер", 10 );
        Employee firstMu = new Employee("Катерина","візажист","початківець");
        EmployeeTeach secondMu = new EmployeeTeach("Адріана","візажист","майстер", 11);

        Employee firstTeach = new EmployeeTeach("Роксана","бровист","арт-майстер",15);


//        List<EmployeeTeach> employeeTeaches = new ArrayList<>();
//        employeeTeaches.add(secondLash);
//        employeeTeaches.add(secondBrow);
//        employeeTeaches.add(secondMu);
//
//        for (EmployeeTeach emp: employeeTeaches){
//            emp.moreInfo();
//        }



        //Дні для акції
        TodayDay day1 = new TodayDay("вівторок");
        TodayDay day2 = new TodayDay("субота");
        //Вибір курсів
        Course junBrow = new Course("*Базовий курс архітектура брів*",2500,5);
        Course midBrow = new Course("*Курс повищення кваліфікації бровиста*",5000, 7);
        Course junLash = new Course("*Базовий курс lash-мейкер з нуля*",7000,10);
        Course midLash = new Course("*Курс повищення кваліфікації lash-мейкера*",10000,16);
        Course junMu = new Course("*Курс самомакіяжу та нюдового макіяжу*",4000, 5);
        Course midMu = new Course("*Курс вечірніх / весільних макіяжів*",8000,10);
        //Послуги
        Service paintBrow = new Service("Фарбування брів фарбою/хною", 200 , 1.0);
        Service lamiBrow = new Service("Ламінування брів" , 400 , 1.0);
        Service lashLami = new Service("Ламінування вій", 400 ,1.0);
        Service extension = new Service("Нарощення вій класика / 2Д /3Д + ефекти" , 650 , 2.5);
        Service makeup = new Service("Макіяж нюд / вечірній / весільний" , 800 , 2.5);



        //Вибір послуги і майстра

        switch (client.chooseServise()){
            case 11 :
                chooseFavor.favorChoose();
                int choose = s.nextInt();
                switch (choose){
                    case 1:
                        paintBrow.moreInfo();
                        System.out.print("Виберіть майстра (Олена / Діана): ");
                        String se = s2.nextLine();
                        switch (se){
                            case "Олена": firstBrow.employee();
                                paintBrow.findPrice(firstBrow);
                                break;
                            case "Діана": secondBrow.employee();
                                paintBrow.findPrice(secondBrow);
                                break;
                            default:
                                System.out.println("Обраний майстер не може виконати цю процедуру(");
                        }
                        break;
                    case 2:
                        lamiBrow.moreInfo();
                        System.out.print("Виберіть майстра (Олена / Діана): ");
                        String se2 = s2.nextLine();
                        switch (se2){
                            case "Олена": firstBrow.employee();
                                lamiBrow.findPrice(firstBrow);
                                break;
                            case "Діана": secondBrow.employee();
                                lamiBrow.findPrice(secondBrow);
                                break;
                            default:
                                System.out.println("Обраний майстер не може виконати цю процедуру(");
                        }
                        break;
                    case 3:
                        lashLami.moreInfo();
                        System.out.print("Виберіть майстра (Юлія / Вікторія): ");
                        String se3 = s2.nextLine();
                        switch (se3){
                            case "Юлія": firstLash.employee();
                                lashLami.findPrice(firstLash);
                                break;
                            case "Вікторія": secondLash.employee();
                                lashLami.findPrice(secondLash);
                                break;
                            default:
                                System.out.println("Обраний майстер не може виконати цю процедуру(");
                        }
                        break;
                    case 4:
                        extension.moreInfo();
                        System.out.print("Виберіть майстра (Юлія / Вікторія): ");
                        String se4 = s2.nextLine();
                        switch (se4){
                            case "Юлія": firstLash.employee();
                                extension.findPrice(firstLash);
                                break;
                            case "Вікторія": secondLash.employee();
                                extension.findPrice(secondLash);
                                break;
                            default:
                                System.out.println("Обраний майстер не може виконати цю процедуру(");
                        }
                        break;
                    case 5:
                        makeup.moreInfo();
                        System.out.println("Виберіть майстра (Катерина / Адріана): ");
                        String se5 = s2.nextLine();
                        switch (se5){
                            case "Катерина": firstMu.employee();
                                makeup.findPrice(firstMu);
                                break;
                            case "Адріана": secondMu.employee();
                                makeup.findPrice(secondMu);
                                break;
                            default:
                                System.out.println("Обраний майстер не може виконати цю процедуру(");
                        }
                        break;
                    default:
                        System.out.println("В нас немає даної процедури");

                }
                break;
            case 22:
                firstTeach.employee();
                chooseCourse.courseChoose();
                int choose2 = s.nextInt();
                switch (choose2){
                    case 1 :
                        junBrow.infoCourse();
                        break;
                    case 2:
                        midBrow.infoCourse();
                        break;
                    case 3:
                        junLash.infoCourse();
                        break;
                    case 4:
                        midLash.infoCourse();
                        break;
                    case 5:
                        junMu.infoCourse();
                        break;
                    case 6:
                        midMu.infoCourse();
                        break;
                }
                break;

        }




            //Акція
        System.out.print("Обери день : ");
        String day = s2.nextLine();
        switch (day){
            case "вівторок":
                day1.sale();
                break;
            case "субота":
                day2.sale();
                break;
            default:
                System.out.println("У вівторок та суботу у нас працює акція TodayDay , на жаль на обраний день акцій немає( ");
        }





//        // Вибір курсів
//        System.out.println("Можливо бажаєте придбати у нас курс?");
//        Scanner str = new Scanner(System.in);
//        String  cust1 = str.nextLine();
//        if(cust1.equalsIgnoreCase("Так")) {
//            System.out.println("Обирайте майстра");
//            String emp = str.nextLine();
//        }



//        firstBrow.employee();
//        Course browCourse = new Course("Базовий курс архітектури брів", 3000.0  ,7.0 );
//        browCourse.course(firstBrow);
       // Service set1 = new Service();
//        set1.setPrice(firstBrow);
       // set1.priceSet(secondBrow);





    }
}