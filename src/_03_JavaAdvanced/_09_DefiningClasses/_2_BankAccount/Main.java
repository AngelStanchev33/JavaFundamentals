package _03_JavaAdvanced._09_DefiningClasses._2_BankAccount;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Integer, BankAccount> bank = new HashMap<>();

        String line = scanner.nextLine();

        while (!("End").equals(line)) {

            String[] tokens = scanner.nextLine().trim().split("\\s+");
            String command = tokens[0];

            if (command.equals("Create")) {
                create(bank);
            } else if (command.equals("Deposit")) {
                deposit(tokens, bank);
            } else if (command.equals("SetInterest")) {
                setInterest(Double.parseDouble(tokens[1]));
            } else {
                printInterest(bank, tokens);
            }
        }
    }

    private static void printInterest(Map<Integer, BankAccount> bank, String[] tokens) {
        int id = Integer.parseInt(tokens[1]);

        if (!checkIfAccountExist(bank, id)) {
            return;
        }
        BankAccount account = bank.get(id);
        int years = Integer.parseInt(tokens[2]);

        System.out.printf("%.2f%n", account.getInterestRate(years));

    }

    private static void setInterest(double interest) {
        BankAccount.setInterestRate(interest);
    }

    private static void create(Map<Integer, BankAccount> bank) {
        BankAccount account = new BankAccount();
        bank.put(account.getId(), account);
        System.out.println("Account ID" + account.getId() + "created");
    }

    private static void deposit(String[] tokens, Map<Integer, BankAccount> bank) {
        int id = Integer.parseInt(tokens[1]);

        if (!checkIfAccountExist(bank, id)) {
            return;
        }

        int amount = Integer.parseInt(tokens[2]);
        BankAccount account = bank.get(id);

        account.deposit(amount);
        System.out.println("Deposited" + amount + "to ID" + id);

    }

    public static boolean checkIfAccountExist(Map<Integer, BankAccount> bank, int id) {
        if (!bank.containsKey(id)) {
            System.out.println("Account does not exist");
            return false;
        }
        return true;
    }
}
