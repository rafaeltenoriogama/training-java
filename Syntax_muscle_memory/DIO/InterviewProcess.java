public class InterviewProcess {
  public static void main(String[] args) {
    // Some candidates salary expectations
    analysisCandidate(1900.0);
    analysisCandidate(2200.0);
    analysisCandidate(2000.0);
  }

  public static void analysisCandidate(double salaryExpected) {
    // Method to check salary expectations and salary basis
    double salaryBasis = 2000.0;

    String result = (salaryBasis > salaryExpected) ? "Call candidate"
        : (salaryBasis == salaryExpected) ? "Call with counter proposal" : "Waiting for more candidates";
    System.out.println(result);

  }
}
