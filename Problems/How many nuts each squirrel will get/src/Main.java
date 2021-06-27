import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        int nutsPerSquirrel = secondNumber / firstNumber;

        System.out.println(nutsPerSquirrel);
    }
}