import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberToRead = scanner.nextInt();

        int firstNumber = numberToRead / 100;
        int countOfHundreds = numberToRead % 100;
        int thirdNumber = numberToRead % 10;
        int finalNumberOfTens = (numberToRead - (firstNumber * 100)) / 10;

        if (thirdNumber != 0) {
            System.out.print(thirdNumber);
        }

        if (countOfHundreds != 0) {
            System.out.print(finalNumberOfTens);
        }
        if (firstNumber != 0) {
            System.out.println(firstNumber);
        }
    }
}