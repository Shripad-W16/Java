import java.util.Scanner;

class SevenSegmentDisplay {
    private static final String[] SEGMENTS = {
        "1111110", "0110000", "1101101", "1111001", "0110011",
        "1011011", "1011111", "1110000", "1111111", "1111011"
    };

    private String pattern;

    public SevenSegmentDisplay(int digit) {
        if (digit >= 0 && digit <= 9) {
            this.pattern = SEGMENTS[digit];
        } else {
            System.out.println("Invalid digit. Showing '0' instead.");
            this.pattern = SEGMENTS[0];
        }
    }

    public void showDisplay() {
        System.out.println(
            " " + (pattern.charAt(0) == '1' ? " _ " : "   ") + " \n" +
            (pattern.charAt(5) == '1' ? "|" : " ") + 
            (pattern.charAt(6) == '1' ? "_" : " ") + 
            (pattern.charAt(1) == '1' ? "|" : " ") + "\n" +  
            (pattern.charAt(4) == '1' ? "|" : " ") + 
            (pattern.charAt(3) == '1' ? "_" : " ") + 
            (pattern.charAt(2) == '1' ? "|" : " ") + "\n"
        );
    }
}

public class MySevenSegmentDisplay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a digit (0-9) to display: ");
        
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input! Please enter a number between 0-9.");
        } else {
            int digit = scanner.nextInt();
            SevenSegmentDisplay display = new SevenSegmentDisplay(digit);
            display.showDisplay();
        }

        scanner.close();
        System.out.println("Thank you for using the Seven-Segment Display developed by shripad!");
    }
}
