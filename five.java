import java.util.Scanner;

public class five {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int months = Integer.parseInt(scanner.nextLine());
        double electricity = 0.0;
        double waterPerMo = 20;
        double netPerMo = 15;

        for (int i = 1; i <= months; i++) {
            double electricityPerMo = Double.parseDouble(scanner.nextLine());
            electricity += electricityPerMo;
        }
        double cost = electricity + waterPerMo * months + netPerMo * months;
        double ttlOther = cost* 1.2;
        double avgCost = (cost+ttlOther) / months;

        System.out.printf("Electricity: %.2f lv%n", electricity);
        System.out.printf("Water: %.2f lv%n", waterPerMo * months);
        System.out.printf("Internet: %.2f lv%n", netPerMo * months);
        System.out.printf("Other: %.2f lv%n", ttlOther);
        System.out.printf("Average: %.2f lv%n", avgCost);
    }
}

