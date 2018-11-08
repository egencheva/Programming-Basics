import java.util.Scanner;

public class two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        double budget = Integer.parseInt(scanner.nextLine());
        double ttlBudget = num * 20;
        double diff = Math.abs(ttlBudget - budget);
        double fireworks = (diff*40/100);
        double donation = (diff*60/100);

        if (budget >=ttlBudget){
            System.out.printf("Yes! %.0f lv are for fireworks and %.0f lv are for donation.",fireworks,donation);
        }else if (budget<ttlBudget){
            System.out.printf("They won't have enough money to pay the covert. They will need %.0f lv more.",diff);
        }

    }
}

