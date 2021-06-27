import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int height = scanner.nextInt();
        int speedUp = scanner.nextInt();
        int speedDown = scanner.nextInt();
        int days;
        int nights = 0;

        for (days = 1; days < 101; days++) {
            int movementUp = height - ((speedUp * days) - (nights * speedDown));
            if (movementUp <= 0) {
                System.out.println(days);
                break;
            }
            nights++;
        }
    }
}
