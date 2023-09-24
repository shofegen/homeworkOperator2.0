public class Main {
    public static void main(String[] args) {
        byte clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Указана несуществующая операционная система");
        }


        short clientDeviceYear = 2013;
        byte clientOS1 = 0;
        if (clientDeviceYear >= 2015) {
            System.out.println("Установите обновление по ссылке");
        } else if (clientDeviceYear < 2015 && clientOS1 == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientDeviceYear < 2015 && clientOS1 == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Указана несуществующая операционная система");
        }


        short year = 2021;
        if ((year % 4 == 0 && year % 100 !=0) || (year % 400 == 0) && (year>1584)){
            System.out.println(year + " год является высокосным");
        } else {
            System.out.println(year + " год не является высокосным");
        }


        int deliveryDistance = 95;
        int resault = 1;
        if (deliveryDistance <=20){
        } else if (deliveryDistance >20 || deliveryDistance <=60) {
            resault = resault + 2;
        } else if (deliveryDistance >60 || deliveryDistance <=100) {
            resault = resault + 3;
        } else {
            System.out.println("Доставка не может быть осуществлена");
        }
        System.out.println("Потребуется дней: " + resault + " , для выпуска карты с учетом доставки");


        char monthNumber = 12;
        switch (monthNumber){
            case 3:
            case 4:
            case 5:
                System.out.println("Вески");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            default:
                System.out.println("Данного месяца не существует");
        }

    }
}