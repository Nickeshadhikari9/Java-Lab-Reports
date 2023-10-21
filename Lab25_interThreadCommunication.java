class SharedResource {
    boolean isOdd = true;

    synchronized void printOdd(int number) {
        while (!isOdd) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("Odd: " + number);
        isOdd = false;
        notify();
    }

    synchronized void printEven(int number) {
        while (isOdd) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("Even: " + number);
        isOdd = true;
        notify();
    }
}

public class Lab25_interThreadCommunication {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();
        Thread evenThread = new Thread(() -> {
            for (int i = 2; i <= 10; i += 2) {
                sharedResource.printEven(i);
            }
        });
        Thread oddThread = new Thread(() -> {
            for (int i = 1; i <= 9; i += 2) {
                sharedResource.printOdd(i);
            }
        });
        evenThread.start();
        oddThread.start();
    }
}
