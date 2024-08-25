public class Switch_real_use {
  public static void main(String[] args) {
    // Basic phone plan equation
    // Without the break we can complement the answer, in descres order
    String plan = "T"; // Turbo, Basic and Medium

    switch (plan) {
      case "T": {
        System.out.println("Youtube, Netflix and Prime Video");
      }

      case "M": {
        System.out.println("WhatsApp and Instagram");
      }

      case "B": {
        System.out.println("Ilimited SMS and Calls");
      }
    }
    // They don't have break in the cases, so if is T, they wil show all. And B,
    // only the last.

  }
}
