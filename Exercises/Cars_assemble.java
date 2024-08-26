public class Cars_assemble {

  public double productionRatePerHour(int speed) {
    // Base prod rate
    double baseRate = 221 * speed;

    // Success rate based on speed
    double successRate;

    if (speed >= 1 && speed <= 4) {
      successRate = 1.0;
      // 100%
    } else if (speed >= 5 && speed <= 8) {
      successRate = 0.9;
      // 90%
    } else if (speed == 9) {
      successRate = 0.8;
      // 80%
    } else if (speed == 10) {
      successRate = 0.77;
      // 77%
    } else {
      successRate = 0.0;
      // Invalid speed
    }

    // Calculating
    return baseRate * successRate;
  }

  public int workingItemsPerMinute(int speed) {
    // Call previous metho to get hourly prod
    double productionPerHour = productionRatePerHour(speed);

    // Convert to minute rate
    double productionPerMinute = productionPerHour / 60.0;

    // Return whole cars produced per minute
    return (int) productionPerMinute;
  }
}
