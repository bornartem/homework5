public class Main {
    public static void main(String[] args) {
    int clientOS = 0;// Задача 1
    if (clientOS<1) {
        System.out.println("Установите версию приложения для IOS по ссылке");
    } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        int clientOS1 =1;// Задача 2
        int clientDeviceYear =2015;
        if (clientOS1==0 && clientDeviceYear<2015) {
            System.out.println("Установите облегченную версию приложения для IOS по ссылке");
        } else if (clientOS1==1 && clientDeviceYear<2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS1==0 && clientDeviceYear>=2015) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        } else {
            System.out.println ("Установите версию приложения для Android по ссылке");
        }

        int year =2000; // Задача 3
        if (year%4==0 && year % 100 !=0) {
            System.out.println(year + " год является високосным");
        } else if (year%400==0) {
            System.out.println (year + " год является високосным");
        } else {
            System.out.println (year + " год не является високосным");
        }
        int deliveryDistance = 95;
        if (deliveryDistance<=20) {
            System.out.println ("Доставка в пределах суток");
        } else if (deliveryDistance>20 && deliveryDistance <=60) {
            System.out.println ("Доставка двое суток");
        } else if (deliveryDistance>60 && deliveryDistance <=100) {
            System.out.println("Доставка трое суток");
        } else {
            System.out.println ("Доставки нет");
        }
        int monthNumber =12;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println ("На дворе зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println ("На дворе весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println ("На дворе лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println ("На дворе осень");
            default:
                System.out.println ("Такого времени года не существует");

        }
    }
}