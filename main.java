import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        System.out.println("PLease Enter your Paragraph");
        Scanner scan = new Scanner(System.in);

        String userInput = scan.nextLine();
        scan.close();

        userInput = userInput.trim();
        int count = 0;

        if (userInput.length() == 0) {
            count = 0;
        } else {
            // count the words
            count++;
            for (int i = 0; i < userInput.length(); i++) {
                if (userInput.charAt(i) == ' ') {
                    count++;
                }
            }
        }

        System.out.println("Your word count is " + count);
    }
}