import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int one = scanner.nextInt();
        int two = scanner.nextInt();
        int three = scanner.nextInt();

        boolean isFirstNegative = one <= 0;
        boolean isSecondNegative = two <= 0;
        boolean isThirdNegative = three <= 0;

        boolean isJustFirstPositive = !isFirstNegative && isSecondNegative
                && isThirdNegative;

        boolean isJustSecondPositive = isFirstNegative && !isSecondNegative
                && isThirdNegative;

        boolean isJustThirdPositive = isFirstNegative && isSecondNegative
                && !isThirdNegative;

        boolean isJustOneNumberPositive = isJustFirstPositive || isJustSecondPositive
                || isJustThirdPositive;

        System.out.println(isJustOneNumberPositive);

    }
}