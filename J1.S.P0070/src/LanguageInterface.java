
import java.util.Locale;
import java.util.ResourceBundle;

public class LanguageInterface {

    private static LanguageInterface instance;
    private static final String LANGUAGE_TYPE_DEFAULT = "en";
    private Locale resourceFile;
    private ResourceBundle resourceBundle;

    private LanguageInterface() {
        resourceFile = new Locale(LANGUAGE_TYPE_DEFAULT);
        resourceBundle = ResourceBundle.getBundle("Language", resourceFile);
    }

    public static LanguageInterface getInstance() {
        if (instance == null) {
            instance = new LanguageInterface();
        }
        return instance;
    }

    public String getMessage(String key) {
        return resourceBundle.getString(key);
    }

    public void changeLanguage(String type) {
        resourceFile = new Locale(type);
        resourceBundle = ResourceBundle.getBundle("Language", resourceFile);
    }
}
