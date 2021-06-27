import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();
        int forthNumber = scanner.nextInt();

        int firstOutputNumber = --firstNumber;
        int secondOutputNumber = --secondNumber;
        int thirdOutputNumber = --thirdNumber;
        int forthOutputNumber = --forthNumber;

        System.out.println(firstOutputNumber + " " + secondOutputNumber +
                " " + thirdOutputNumber + " " + forthOutputNumber);
    }


}