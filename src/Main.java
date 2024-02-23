import java.time.LocalDate;

public class Main {
    public static void chekYear(int year) {
        if (year >= 1584 && year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }

    public static int calculateDeliveryDays(int deliveryDistance) {
        int day = 0;
        if (deliveryDistance > 0) {
            day += 1;
        }
        if (deliveryDistance > 20) {
            day += 1;
        }
        if (deliveryDistance > 60) {
            day += 1;
        }
        if (deliveryDistance > 100) {
            day = -1;
        }
        return day;

    }

    public static void chekOs(int os, int year) {
        int currentYear = LocalDate.now().getYear();
        if (year < currentYear && os == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (year < currentYear && os == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (year >= currentYear && os == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (year >= currentYear && os == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Неверная опереционная система");
        }

    }

    public static void main(String[] args) {
        System.out.println("Задание 1");
        int year = 2021;
        chekYear(year);

        System.out.println("Задание 2");
        int os = 0; //0 — iOS, 1 — Android
        year = 2020;
        chekOs(os,year);

        System.out.println("Задание 3");
        int deliveryDistance = 95;
        int day = calculateDeliveryDays(deliveryDistance);
        if (day>0){
            System.out.println("Потребуется дней: " + day);
        }else {
            System.out.println("Доставки нет");
        }

    }
}