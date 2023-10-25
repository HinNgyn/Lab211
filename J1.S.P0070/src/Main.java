
public class Main {

    private ConsoleInputService consoleInputService;
    private LanguageInterface languageInterface;
    
    public static void main(String[] args) {
        Main mainProgramming = new Main();
        
        mainProgramming.languageInterface = LanguageInterface.getInstance();
        mainProgramming.consoleInputService = ConsoleInputService.getInstance();
        mainProgramming.start();
        
        
    }

    void start() {
        menu();
        String userChoice = consoleInputService.getStringFromConsole();

        switch (userChoice) {
            case "1":
                break;

            case "2":

                break;
            case "3":
                return;
            default:
                System.out.println(languageInterface.getMessage("INVALID_USER_CHOICE"));
        }
        start();
    }

    void menu() {
        System.out.println("-------Login Program-------");
        System.out.println("1. Vietnamese");
        System.out.println("2. English");
        System.out.println("3. Exit.");
        System.out.print("Please choice one option: ");
    }

}
