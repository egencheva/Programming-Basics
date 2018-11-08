import java.util.Scanner;

public class four {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int singer = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int guests = 0;
        int income = 0;
        int ttlIncome = 0;

        while (!input.equals("The restaurant is full")) {
            int num = Integer.parseInt(input);

            if (num < 5) {
                income = num * 100;
            } else if (num >= 5) {
                income = num * 70;
            }
            ttlIncome += income;
            input = scanner.nextLine();
            guests += num;
        }
        if (ttlIncome >=singer) {
            System.out.printf("You have %d guests and %d leva left.", guests, ttlIncome - singer);
        } else {
            System.out.printf("You have %d guests and %d leva income, but no singer.", guests, ttlIncome);
        }
        System.out.printf("You have %d guests and %d leva left.", guests, ttlIncome - singer);
    }
}
