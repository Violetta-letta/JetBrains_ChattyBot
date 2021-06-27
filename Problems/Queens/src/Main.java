import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        boolean isXTheSame = x1 == x2;
        boolean isYTheSame = y1 == y2;


        int x1Next1UpRight = x1 + 1;
        int x1Next2UpRight = x1 + 2;
        int x1Next3UpRight = x1 + 3;
        int x1Next4UpRight = x1 + 4;
        int x1Next5UpRight = x1 + 5;
        int x1Next6UpRight = x1 + 6;
        int x1Next7UpRight = x1 + 7;


        int x1Next1UpLeft = x1 - 1;
        int x1Next2UpLeft = x1 - 2;
        int x1Next3UpLeft = x1 - 3;
        int x1Next4UpLeft = x1 - 4;
        int x1Next5UpLeft = x1 - 5;
        int x1Next6UpLeft = x1 - 6;
        int x1Next7UpLeft = x1 - 7;

        int x1Next1DownLeft = x1 - 1;
        int x1Next2DownLeft = x1 - 2;
        int x1Next3DownLeft = x1 - 3;
        int x1Next4DownLeft = x1 - 4;
        int x1Next5DownLeft = x1 - 5;
        int x1Next6DownLeft = x1 - 6;
        int x1Next7DownLeft = x1 - 7;

        int x1Next1DownRight = x1 + 1;
        int x1Next2DownRight = x1 + 2;
        int x1Next3DownRight = x1 + 3;
        int x1Next4DownRight = x1 + 4;
        int x1Next5DownRight = x1 + 5;
        int x1Next6DownRight = x1 + 6;
        int x1Next7DownRight = x1 + 7;




        int y1Next1UpRight = y1 + 1;
        int y1Next2UpRight = y1 + 2;
        int y1Next3UpRight = y1 + 3;
        int y1Next4UpRight = y1 + 4;
        int y1Next5UpRight = y1 + 5;
        int y1Next6UpRight = y1 + 6;
        int y1Next7UpRight = y1 + 7;


        int y1Next1UpLeft = y1 + 1;
        int y1Next2UpLeft = y1 + 2;
        int y1Next3UpLeft = y1 + 3;
        int y1Next4UpLeft = y1 + 4;
        int y1Next5UpLeft = y1 + 5;
        int y1Next6UpLeft = y1 + 6;
        int y1Next7UpLeft = y1 + 7;

        int y1Next1DownLeft = y1 - 1;
        int y1Next2DownLeft = y1 - 2;
        int y1Next3DownLeft = y1 - 3;
        int y1Next4DownLeft = y1 - 4;
        int y1Next5DownLeft = y1 - 5;
        int y1Next6DownLeft = y1 - 6;
        int y1Next7DownLeft = y1 - 7;

        int y1Next1DownRight = y1 - 1;
        int y1Next2DownRight = y1 - 2;
        int y1Next3DownRight = y1 - 3;
        int y1Next4DownRight = y1 - 4;
        int y1Next5DownRight = y1 - 5;
        int y1Next6DownRight = y1 - 6;
        int y1Next7DownRight = y1 - 7;

        boolean isNextUpRight1 = x1Next1UpRight == x2 && y1Next1UpRight == y2;
        boolean isNextUpRight2 = x1Next2UpRight == x2 && y1Next2UpRight == y2;
        boolean isNextUpRight3 = x1Next3UpRight == x2 && y1Next3UpRight == y2;
        boolean isNextUpRight4 = x1Next4UpRight == x2 && y1Next4UpRight == y2;
        boolean isNextUpRight5 = x1Next5UpRight == x2 && y1Next5UpRight == y2;
        boolean isNextUpRight6 = x1Next6UpRight == x2 && y1Next6UpRight == y2;
        boolean isNextUpRight7 = x1Next7UpRight == x2 && y1Next7UpRight == y2;

        boolean isNextUpLeft1 = x1Next1UpLeft == x2 && y1Next1UpLeft == y2;
        boolean isNextUpLeft2 = x1Next2UpLeft == x2 && y1Next2UpLeft == y2;
        boolean isNextUpLeft3 = x1Next3UpLeft == x2 && y1Next3UpLeft == y2;
        boolean isNextUpLeft4 = x1Next4UpLeft == x2 && y1Next4UpLeft == y2;
        boolean isNextUpLeft5 = x1Next5UpLeft == x2 && y1Next5UpLeft == y2;
        boolean isNextUpLeft6 = x1Next6UpLeft == x2 && y1Next6UpLeft == y2;
        boolean isNextUpLeft7 = x1Next7UpLeft == x2 && y1Next7UpLeft == y2;

        boolean isNextDownRight1 = x1Next1DownRight == x2 && y1Next1DownRight == y2;
        boolean isNextDownRight2 = x1Next2DownRight == x2 && y1Next2DownRight == y2;
        boolean isNextDownRight3 = x1Next3DownRight == x2 && y1Next3DownRight == y2;
        boolean isNextDownRight4 = x1Next4DownRight == x2 && y1Next4DownRight == y2;
        boolean isNextDownRight5 = x1Next5DownRight == x2 && y1Next5DownRight == y2;
        boolean isNextDownRight6 = x1Next6DownRight == x2 && y1Next6DownRight == y2;
        boolean isNextDownRight7 = x1Next7DownRight == x2 && y1Next7DownRight == y2;

        boolean isNextDownLeft1 = x1Next1DownLeft == x2 && y1Next1DownLeft == y2;
        boolean isNextDownLeft2 = x1Next2DownLeft == x2 && y1Next2DownLeft == y2;
        boolean isNextDownLeft3 = x1Next3DownLeft == x2 && y1Next3DownLeft == y2;
        boolean isNextDownLeft4 = x1Next4DownLeft == x2 && y1Next4DownLeft == y2;
        boolean isNextDownLeft5 = x1Next5DownLeft == x2 && y1Next5DownLeft == y2;
        boolean isNextDownLeft6 = x1Next6DownLeft == x2 && y1Next6DownLeft == y2;
        boolean isNextDownLeft7 = x1Next7DownLeft == x2 && y1Next7DownLeft == y2;

        boolean isNextUpRight = isNextUpRight1 || isNextUpRight2 || isNextUpRight3
                || isNextUpRight4 || isNextUpRight5 || isNextUpRight6 || isNextUpRight7;

        boolean isNextUpLeft = isNextUpLeft1 || isNextUpLeft2 || isNextUpLeft3
                || isNextUpLeft4 || isNextUpLeft5 || isNextUpLeft6 || isNextUpLeft7;

        boolean isNextDownLeft = isNextDownLeft1 || isNextDownLeft2 || isNextDownLeft3 ||
                isNextDownLeft4 || isNextDownLeft5 || isNextDownLeft6 || isNextDownLeft7;

        boolean isNextDownRight = isNextDownRight1 || isNextDownRight2 || isNextDownRight3 ||
                isNextDownRight4 || isNextDownRight5 || isNextDownRight6 || isNextDownRight7;

        if (isXTheSame || isYTheSame) {
            System.out.println("YES");
        } else if (isNextUpRight || isNextUpLeft) {
            System.out.println("YES");
        } else if (isNextDownLeft || isNextDownRight) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}