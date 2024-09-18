package Job;

import java.util.Scanner;
import java.util.Stack;

public class TextEditorPractice {

    StringBuilder text;
    Stack<String> history;

    public TextEditorPractice() {
        this.history = new Stack<>();
        this.text = new StringBuilder();
    }

    public void addText(String txt){
      this.history.push(this.text.toString());
      this.text.append(txt);
    }

    public void deleteText(int length){
        if(length <= text.length()){
            this.history.push(this.text.toString());
            this.text.delete(text.length()-length,text.length());
        }else{
            this.history.push(this.text.toString());
            this.text= new StringBuilder();
        }
    }

    public void undo(){
        if(!history.empty()){
            text=new StringBuilder(history.pop());
        }else{
            System.out.println("nothing to undo");
        }
    }

    public void printText(){
        System.out.println("Current Text: " + text.toString());
    }

    public static void main(String[] args) {
        TextEditorPractice editor = new TextEditorPractice();
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
                    editor.printText();
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
