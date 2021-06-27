import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int firstInput = scanner.nextInt();
        int secondInput = scanner.nextInt();
        long output = 1L;


        for (int i = firstInput; i < secondInput; i++) {
            output = output * i;
        }

        System.out.println(output);

    }
};
