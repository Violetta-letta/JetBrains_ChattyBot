import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int unknownX;
        byte counterOfPrintedValues = 0;



        for (unknownX = 0; unknownX <= 1000; unknownX++) {
            if (counterOfPrintedValues == 3) {
                break;
            }
            int equation = a * (int) (Math.pow(unknownX, 3)) + b * (int) (Math.pow(unknownX, 2)) +
                    c * unknownX + d;

            byte maxPossibleCounter = 3;
            if (equation == 0  && counterOfPrintedValues <= maxPossibleCounter) {
                System.out.println(unknownX);
                counterOfPrintedValues++;
            }
        }

    }
}
