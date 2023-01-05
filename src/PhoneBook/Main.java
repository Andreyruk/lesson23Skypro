package PhoneBook;

import PhoneBook.PhoneBook;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание 23.");
        System.out.println();
        PhoneBook phoneBook = new PhoneBook();
        generatePhoneBook(20, phoneBook);
        System.out.println(phoneBook);
        System.out.println(phoneBook.getAbonents().get("Абонент13"));
    }

    public static void generatePhoneBook(int count, PhoneBook phoneBook) {
        for (int i = 1; i <= count; i++) {
            phoneBook.addAbonent("Абонент" + i, "+7" + generatePhoneNumber(10));
        }
    }

    public static String generatePhoneNumber(int lengthNumber) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < lengthNumber; i++) {
            Random r = new Random();
            int x = r.nextInt(9);
            sb.append(x);
        }
        return sb.toString();
    }
}