class PatternPrinter {
    
     
    public void pattern(int n) {
        for (int i = 1; i <= n; i++) { 
            for (int j = 1; j <= n - i; j++) { 
                System.out.print(" ");
            }
            for (int k = 1; k <= (5 * i - 1); k++) 
            { 
                System.out.print("*");
            }
            System.out.println(); 
             }
}
}

public class PaternPrinting {
    public static void main(String[] args) {
        PatternPrinter printer = new PatternPrinter();
        printer.pattern(5); 
    }
}