public class Tern_statement {

  public static void main(String[] args) {
    // Just make some if statement
    double balance = 900.0;
    double check = 950.0;

    String result = (check < balance) ? "You have more" : "Try below than " + balance;
    System.out.println(result);

    // if (check < balance) {
    // System.out.println("Look's like you got more than " + check + " in your
    // account!");
    // } else {
    // System.out.println("Looks like you got less than " + check + " in your
    // account!");
    // System.out.println("Try something below than " + balance + " next time.");
    // }
  }
}
