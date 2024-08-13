public class LogLevels {
    
    public static String message(String logLine) {
        // Divide in two parts before and after ":"
        String[] parts = logLine.split(":", 2);

        // Remove blank spaces
        return parts[1].trim();
    }

    public static String logLevel(String logLine) {
        // Extract tue message between "[]"
        String convertLower = logLine.substring(logLine.indexOf("[") + 1, logLine.indexOf("]"));
        // Return the error in lowercase
        return convertLower.toLowerCase();
    }

    public static String reformat(String logLine) {
        // Extract message after ":"
        String message = logLine.substring(logLine.indexOf(":") + 1).trim();
        
        // Extract error in brackets
        String logLevel = logLine.substring(logLine.indexOf("[") + 1, logLine.indexOf("]")).toLowerCase();
        
        // Concatenate and format
        String AllTogether = message + " (" + logLevel + ")";
        return AllTogether;
    }
}
