import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int one = scanner.nextInt();
        int two = scanner.nextInt();
        int three = scanner.nextInt();

        boolean isInSortingRangeBetween = one <= two && one >= three;
        boolean isInReversedRangeBetween = one >= two && one <= three;


        boolean isOneBetween = isInReversedRangeBetween || isInSortingRangeBetween;

        System.out.println(isOneBetween);
    }
}