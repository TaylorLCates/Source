import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Worker worker = new Worker();

        System.out.println("Please give me a number less than or equal to 1,000,000");
        System.out.print("> ");
        int n = Integer.parseInt(scanner.next());

        if (n <= 1000000) {
            if (worker.isPrime(n)) {
                System.out.println("Your number is prime");
            } else System.out.println("Your number is not prime");

        } else System.out.println("Enter a valid number, dummy");
    }
}
