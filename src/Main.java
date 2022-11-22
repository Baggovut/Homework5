import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Задание 1
        byte clientOS, monthNumber;
        short telephoneReleaseDate, year, deliveryDistance;
        Scanner scan = new Scanner(System.in);

        System.out.println("\033[4mЗадание 1\033[0m \nУкажите тип ОС (0 или 1): ");
        while(!scan.hasNextByte()){
            System.out.println("Введено недопустимое значение, попробуйте снова: ");
            scan.nextLine();
        }
        clientOS = scan.nextByte();
        if(clientOS == 0){
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else if(clientOS == 1){
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        else{
            System.out.println("Неизвестная ОС");
        }

        //Задание 2
        System.out.println("\033[4mЗадание 2\033[0m \nУкажите тип ОС (0 или 1): ");

        while(!scan.hasNextByte()){
            System.out.println("Введено недопустимое значение, попробуйте снова: ");
            scan.nextLine();
        }
        clientOS = scan.nextByte();

        System.out.println("Укажите год выпуска телефона: ");
        while(!scan.hasNextShort()){
            System.out.println("Введено недопустимое значение, попробуйте снова: ");
            scan.nextLine();
        }

        telephoneReleaseDate = scan.nextShort();

        if(clientOS == 0 && telephoneReleaseDate >= 2015){
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else if(clientOS == 0){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        else if(clientOS == 1 && telephoneReleaseDate >= 2015){
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        else if(clientOS == 1){
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        else{
            System.out.println("Неизвестная ОС");
        }

        //Задание 3
        System.out.println("\033[4mЗадание 3\033[0m \nУкажите год: ");

        while(!scan.hasNextShort()){
            System.out.println("Введено недопустимое значение, попробуйте снова: ");
            scan.nextLine();
        }

        year = scan.nextShort();

        if(year%4 == 0 && (year%100 != 0 || year%400 == 0)){
            System.out.println(year+" год является високосным");
        }
        else{
            System.out.println(year+" год не является високосным");
        }

        //Задание 4
        System.out.println("\033[4mЗадание 4\033[0m \nУкажите расстояние для доставки: ");

        while(!scan.hasNextShort()){
            System.out.println("Введено недопустимое значение, попробуйте снова: ");
            scan.nextLine();
        }

        deliveryDistance = scan.nextShort();

        if(deliveryDistance < 0)
        {
            System.out.println("Расстояние не может быть меньше 0.");
        }
        else{
            System.out.println("Потребуется дней: "+(int)Math.ceil(1+(((float)deliveryDistance-20)/40)));
        }

        //Задание 5
        System.out.println("\033[4mЗадание 5\033[0m \nУкажите номер месяца: ");

        while(!scan.hasNextShort()){
            System.out.println("Введено недопустимое значение, попробуйте снова: ");
            scan.nextLine();
        }

        monthNumber = scan.nextByte();

        switch(monthNumber){
            case 12:
            case 1:
            case 2:
                System.out.println("Сезон зимы.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Сезон весны.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Сезон лета.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Сезон осени.");
                break;
            default:
                System.out.println("Некорректное значение месяца!");
                break;
        }

        scan.close();
    }
}