package DIO;

import java.util.concurrent.ThreadLocalRandom;

public class InterviewProcess_part2 {
  public static void main(String[] args) {
    // Some candidates salary expectations
    candidatesSelection();
  }

  public static void candidatesSelection() {
    // Array with some names
    String[] candidates = { "MICHAEL", "TERRY", "MAY", "KEN", "SHOUGANAI", "HISOKA", "KILUA", "CHROLLO" };

    // Variables to control loop and message display
    int selectedCandidates = 0;
    int actualCandidates = 0;
    double salaryBasis = 2000.0;

    // Loop to show everyone that request less or equal salary basis
    while (selectedCandidates < 5 && actualCandidates < candidates.length) {
      String candidate = candidates[actualCandidates];
      double pretendSalary = pretendSalary();

      System.out.println("The " + candidate + " request: " + pretendSalary);
      if (salaryBasis >= pretendSalary) {
        System.out.println("The " + candidate + " was selected.");
        selectedCandidates++;
      }
      actualCandidates++;
    }
  }

  public static double pretendSalary() {
    // Random method to give some salary expectations
    return ThreadLocalRandom.current().nextDouble(1800.0, 2100.0);
  }

  public static void analysisCandidate(double salaryExpected) {
    // Method to check salary expectations and salary basis
    double salaryBasis = 2000.0;

    String result = (salaryBasis > salaryExpected) ? "Call candidate"
        : (salaryBasis == salaryExpected) ? "Call with counter proposal" : "Waiting for more candidates";
    System.out.println(result);

  }
}
