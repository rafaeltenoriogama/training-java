import java.util.ArrayList;
import java.util.List;

public class LanguageList {
    private final List<String> languages = new ArrayList<>();

    public boolean isEmpty() {
        // Check if is empty
        if (languages.size() == 0) {
            return true;
        }
        return false;
    }

    public void addLanguage(String language) {
        // Add a language in the list
        languages.add(language);
    }

    public void removeLanguage(String language) {
        // Check if has in list and remove from that
        if (languages.contains(language)) {
            languages.remove(language);
        }
    }

    public String firstLanguage() {
        // Check if list has at least 1 language
        // Return first language which is on index 0
        if (languages.size() > 0) {
            return languages.get(0);
        }
        return null;
        // Could be else {No languages in list} as well..
    }

    public int count() {
        // We don't need a loop since size() does that
        return languages.size();
    }

    public boolean containsLanguage(String language) {
        // Check if the language is on the list
        // We don't need a loop, contains does that
        return languages.contains(language);
    }

    public boolean isExciting() {
        // Check if Java or Kotlin is on the list
        if (languages.contains("Java") || (languages.contains("Kotlin"))) {
            return true;
        }
        return false;
    }
}
