public class Main {
    public static void main(String[] args) {
        //task1
        char clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по сслыке");
        } else {
            System.out.println("Ошибка!");
        }

        //task2
        int clientDeviceYear = 2015;
        if (clientDeviceYear <= 2015 && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientDeviceYear <= 2015 && clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        if (clientDeviceYear > 2015 && clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientDeviceYear > 2015 && clientOS == 1) {
            System.out.println("Установите версию приложения для Android по сслыке");
        }
        //task3
        int yearVisokosn = 2024;
        int yaerFore = yearVisokosn % 4;
        int yaerFotihangret = yearVisokosn % 400;
        int yearhangret = yearVisokosn % 100;

        if (yaerFore == 0 || yaerFotihangret == 0 && yearhangret != 0) {
            System.out.println("Высокосный год.");
        } else if (yaerFore != 0 || yaerFotihangret != 0 && yearhangret == 0) {
            System.out.println("Не высокосный год.");
        }
//task4
int deliveryDistance = 95;
        int oneday = 1;
        int twoday = 2;
        int threeday = 3;

        if (deliveryDistance<=20) {
            System.out.println("Потребуется дней: " + oneday);
        } else if (deliveryDistance>20 &&deliveryDistance<=60) {
            System.out.println("Потребуется дней: " + twoday);
        }else if (deliveryDistance>60 && deliveryDistance<=100) {
                System.out.println("Потребуется дней: " + threeday);
            } else if (deliveryDistance>100) {
                System.out.println("Доставки нет!");}
      //task5
int monthNumber = 11;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
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
            default:
                System.out.println("Ошибка!");}
        }

    }
