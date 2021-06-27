import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();
        int width = scanner.nextInt();
        int neededSegment = scanner.nextInt();

        String yes = "YES";
        String no = "NO";
        boolean isLengthZero = length <= 0;
        boolean isWidthZero = width <= 0;
        boolean isNotEnoughSegments = length * width <= neededSegment;


        if (isLengthZero || isWidthZero || isNotEnoughSegments) {
            System.out.println(no);
        } else if (neededSegment % length == 0 || neededSegment % width == 0) {
            System.out.println(yes);
        } else {
            System.out.println(no);
        }
    }
}