import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int inputFromUser = scanner.nextInt();

        int thousands = inputFromUser / 1000;
        int justAmountofThousands = thousands * 1000;
        int hundreds = (inputFromUser - justAmountofThousands) / 100;
        int justAmountOfHundredesAndThousands = justAmountofThousands + hundreds * 100;
        int tens = (inputFromUser - justAmountOfHundredesAndThousands) / 10;
        int justAmountOfTens = tens * 10;
        int ones = inputFromUser - justAmountOfHundredesAndThousands - justAmountOfTens;


        if (thousands == ones && hundreds == tens) {
            System.out.println(1);
        } else {
            System.out.println(37);
        }

    }
}