import java.util.Scanner;

public class TerminalAccount {
  int number;
  String agency;
  String ClientName;
  Double balance;

  public static void main(String[] args) {
    System.out.println("Hello, terminal account project!");

    Scanner scanner = new Scanner(System.in);

    System.out.println("Please, insert agency number: ");
    String agency = scanner.nextLine();

    System.out.println("Please, insert account number: ");
    int number = Integer.parseInt(scanner.nextLine());

    System.out.println("Please, what is your name?: ");
    String ClientName = scanner.nextLine();

    System.out.println("Please, tell me your initial balance: ");
    double balance = Double.parseDouble(scanner.nextLine());

    System.out.println(
        "Hello, " + ClientName + ", thanks for all. Your agency is: " + agency + ", your account is: " + number
            + ", and your balance is: " + balance);

    scanner.close();

  }
}
