import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peanutButterCupsAmount = scanner.nextInt();
        boolean isWeekend = scanner.nextBoolean();

        boolean isPartySuccessfulAtWeekday = (peanutButterCupsAmount >= 10) &&
                (peanutButterCupsAmount <= 20) && !isWeekend;
        boolean isPartySuccessfulAtWeekend = (peanutButterCupsAmount >= 15) &&
                (peanutButterCupsAmount <= 25) && isWeekend;

        boolean isPartySuccessful =   isPartySuccessfulAtWeekday || isPartySuccessfulAtWeekend;
        System.out.println(isPartySuccessful);
    }
}