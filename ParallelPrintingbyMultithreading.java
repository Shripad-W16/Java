class NumberThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class AlphabetThread extends Thread {
    public void run() {
        for (char ch = 'A'; ch <= 'E'; ch++) {
            System.out.println(Thread.currentThread().getName() + " - " + ch);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ParallelPrintingbyMultithreading {
    public static void main(String[] args) {
        NumberThread numberThread = new NumberThread();
        AlphabetThread letterThread = new AlphabetThread();

        numberThread.setName("Number Thread");
        letterThread.setName("Letter Thread");

        numberThread.start();
        letterThread.start();
    }
}
