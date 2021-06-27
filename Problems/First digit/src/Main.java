import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int userInput = scanner.nextInt();
        int tents = userInput / 10;

        System.out.println(tents);
    }
}