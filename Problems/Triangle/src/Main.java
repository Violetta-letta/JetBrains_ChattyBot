import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        boolean isALess = b + c > a;
        boolean isBLess = a + c > b;
        boolean isCLess = b + a > c;

        if (isALess && isBLess && isCLess) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}