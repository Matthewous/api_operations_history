package ru.netology.moguchev;
import java.util.Scanner;
import java.time.LocalDate;

class FinancialTransaction {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Создание переменных
            String transactionType;
            double amount;
            LocalDate transactionDate;

            System.out.println("Введите тип транзакции:");
            transactionType = scanner.nextLine();

            System.out.println("Введите сумму транзакции:");
            amount = scanner.nextDouble();

            System.out.println("Введите дату транзакции (в формате гггг-мм-дд):");
            scanner.nextLine(); // очистка буфера после ввода числа
            transactionDate = LocalDate.parse(scanner.nextLine());

            // Вывод информации в консоль
            System.out.println("Финансовая транзакция: " + " " + transactionType + " " + amount + " " + transactionDate);

            System.out.println("Продолжить ввод новой транзакции? (да/нет)");
            String answer = scanner.nextLine();

            if (!answer.equalsIgnoreCase("да")) {
                break; // завершение программы, если пользователь не хочет продолжать
            }
        }

        System.out.println("Программа завершена.");
    }
}
