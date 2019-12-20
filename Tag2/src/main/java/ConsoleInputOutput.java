import java.util.Scanner;

public class ConsoleInputOutput implements InputOutput {
    private final Scanner scanner;

    public ConsoleInputOutput(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public String receiveInput() {
        return scanner.nextLine();
    }

    @Override
    public void displayText(Object text) {
        if (!"".equals(text.toString())) {
            System.out.println(text);
        }
    }

    @Override
    public void displayNewLine() {

    }

    @Override
    public void displayPrompt(String prompt) {
        System.out.print(prompt);
    }
}
