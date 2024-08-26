public class Lasagna {
  // Define the 'expectedMinutesInOven()' method
  public int expectedMinutesInOven() {
    // No arguments
    return 40;
  }

  // Define the 'remainingMinutesInOven()' method
  public int remainingMinutesInOven(int ActualMinutes) {
    // Minutes remaining means Expected - Actual = 40 - N = Remaining
    return expectedMinutesInOven() - ActualMinutes;
  }

  // Define the 'preparationTimeInMinutes()' method
  public int preparationTimeInMinutes(int layersAdded) {
    int layersTime = 2;
    return layersAdded * layersTime;
  }

  // Define the 'totalTimeInMinutes()' method
  public int totalTimeInMinutes(int numberLayers, int ovenTimeLasagna) {
    // How many layers I add plus the time to make them
    // How many minutes the lasagna was on the oven
    // I can use the parameter (numberLayers * 2) but will reuse the last method
    // instead to good maintainability
    return preparationTimeInMinutes(numberLayers) + ovenTimeLasagna;
  }
}
