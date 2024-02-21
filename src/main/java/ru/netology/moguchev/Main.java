package ru.netology.moguchev;
import java.util.Scanner;
import java.time.LocalDate;

class FinancialTransaction {

    public static void main(String[] args) {
        // Создание переменных
        int transactionId;
        String transactionType;
        double amount;
        LocalDate transactionDate;

        // Создание объекта Scanner
        Scanner scanner = new Scanner(System.in);

        // Заполнение переменных пользователем
//        System.out.println("Введите идентификатор транзакции:");
//        transactionId = scanner.nextInt();

        System.out.println("Введите тип транзакции:");
        transactionType = scanner.nextLine();

        System.out.println("Введите сумму транзакции:");
        amount = scanner.nextDouble();

        System.out.println("Введите дату транзакции (в формате гггг-мм-дд):");
        transactionDate = LocalDate.parse(scanner.nextLine());

        // Вывод информации в консоль
        System.out.println("Финансовая транзакция: " + " " + transactionType + " " + amount + " " + transactionDate);
    }
}
