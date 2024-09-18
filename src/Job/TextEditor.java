package Job;

import java.util.Scanner;
import java.util.Stack;

public class TextEditor {

    private StringBuilder text;            // Holds the text
    private Stack<String> history;         // Stack to keep track of changes for undo

    public TextEditor() {
        text = new StringBuilder();        // Initialize empty text
        history = new Stack<>();           // Initialize an empty history stack
    }

    // Add text to the editor
    public void addText(String newText) {
        history.push(text.toString());     // Save the current state before adding new text
        text.append(newText);              // Add new text to the existing text
    }

    // Delete text from the editor
    public void deleteText(int length) {
        if (length <= text.length()) {
            history.push(text.toString()); // Save the current state before deleting
            text.delete(text.length() - length, text.length()); // Delete 'length' number of characters
        } else {
            System.out.println("Cannot delete more characters than the text length.");
        }
    }

    // Undo the last operation
    public void undo() {
        if (!history.isEmpty()) {
            text = new StringBuilder(history.pop()); // Restore the last saved state
        } else {
            System.out.println("Nothing to undo.");
        }
    }

    // Display the current text
    public void display() {
        System.out.println("Current Text: " + text.toString());
    }

    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nText Editor Options:");
            System.out.println("1. Add Text");
            System.out.println("2. Delete Text");
            System.out.println("3. Undo");
            System.out.println("4. Display Text");
            System.out.println("5. Exit");

            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1: // Add Text
                    System.out.print("Enter text to add: ");
                    String newText = scanner.nextLine();
                    editor.addText(newText);
                    break;

                case 2: // Delete Text
                    System.out.print("Enter number of characters to delete: ");
                    int length = scanner.nextInt();
                    editor.deleteText(length);
                    break;

                case 3: // Undo
                    editor.undo();
                    break;

                case 4: // Display Text
                    editor.display();
                    break;

                case 5: // Exit
                    running = false;
                    System.out.println("Exiting editor.");
                    break;

                default:
                    System.out.println("Invalid option. Try again.");
            }
        }

        scanner.close();
    }
}
