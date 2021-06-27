import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int value1 = scanner.nextInt();
        int value2 = scanner.nextInt();
        int value3 = scanner.nextInt();

        int amountOfTablesGroup1 = value1 / 2;
        int amountOfTablesGroup2 = value2 / 2;
        int amountOfTablesGroup3 = value3 / 2;
        int amountOfExtraTablesGroup1 = value1 % 2;
        int amountOfExtraTablesGroup2 = value2 % 2;
        int amountOfExtraTablesGroup3 = value3 % 2;

        int extraTables1;
        int extraTables2;
        int extraTables3;

        if (amountOfExtraTablesGroup1 > 0) {
            extraTables1 = 1;

        } else {
            extraTables1 = 0;
        }
        if (amountOfExtraTablesGroup2 > 0) {
            extraTables2 = 1;

        } else {
            extraTables2 = 0;
        }
        if (amountOfExtraTablesGroup3 > 0) {
            extraTables3 = 1;

        } else {
            extraTables3 = 0;
        }
        int amountOfTablesToBuy = amountOfTablesGroup1 + amountOfTablesGroup2
                + amountOfTablesGroup3 + extraTables1 + extraTables2 +
                extraTables3;
        System.out.println(amountOfTablesToBuy);
    }
}