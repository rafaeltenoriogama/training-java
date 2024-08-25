public class Swtich_statement {

  public static void main(String[] args) {
    // Just make some if statement
    double balance = 900.0;
    double check = 950.0;
    String result;

    if (check < balance) {
      result = "Ok";
    } else {
      result = "Nok";
    }

    switch (result) {
      case "Ok":
        System.out.println("You have more than " + check);
        break;

      case "Nok":
        System.out.println("You have less than " + balance);
    }

  }
}
