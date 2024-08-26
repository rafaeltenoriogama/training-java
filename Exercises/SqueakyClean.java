class SqueakyClean {
    static String clean(String identifier) {
        var result = new StringBuilder();
        var doUpper = false;
        for (int i = 0; i < identifier.length(); i++) {
            final var c = identifier.charAt(i);
            
            // Convert leetspeak characters to their alphabetic equivalents
            if (c == '4') {
                result.append('a');
            } else if (c == '3') {
                result.append('e');
            } else if (c == '0') {
                result.append('o');
            } else if (c == '1') {
                result.append('l');
            } else if (c == '7') {
                result.append('t');
            } else if (Character.isSpaceChar(c)) {
                // Replace spaces with underscores
                result.append('_');
            } else if (Character.isISOControl(c)) {
                // Replace control characters with "CTRL"
                result.append("CTRL");
            } else if (c == '-') {
                // Set flag to capitalize the next character
                doUpper = true;
            } else if (c >= 'α' && c <= 'ω') {
                // Skip Greek lowercase characters (not handled)
            } else if (doUpper) {
                // Capitalize the character and reset the flag
                result.append(Character.toUpperCase(c));
                doUpper = false;
            } else if (Character.isLetter(c) || c == '_') {
                // Append letters and underscores as they are
                result.append(c);
            }
        }
        return result.toString();
    }
}