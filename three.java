import java.util.Scanner;

public class three {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String years = scanner.nextLine();
        String type = scanner.nextLine();
        String dessert = scanner.nextLine();
        int months = Integer.parseInt(scanner.nextLine());
        double rent = 0.0;
        boolean validType = true;
        boolean validYears = true;
        double ttlPrice = 0.0;

        switch (years) {
            case ("one"):
                switch (type) {
                    case "Small":
                        rent = 9.98;
                        break;
                    case "Middle":
                        rent = 18.99;
                        break;
                    case "Large":
                        rent = 25.98;
                        break;
                    case "ExtraLarge":
                        rent = 35.99;
                        break;
                    default:
                        validType = false;
                }
                break;
            case ("two"):
                switch (type) {
                    case "Small":
                        rent = 8.58;
                        break;
                    case "Middle":
                        rent = 17.09;
                        break;
                    case "Large":
                        rent = 23.59;
                        break;
                    case "ExtraLarge":
                        rent = 31.79;
                        break;
                    default:
                        validType = false;
                }
                break;
            default:
                validType = false;
        }

        if (dessert.equals("yes")) {
            if (rent <= 10) {
                ttlPrice = (rent + 5.50) * months;
            } else if (rent > 30) {
                ttlPrice = (rent + 3.85) * months;
            } else {
                ttlPrice = (rent + 4.35) * months;
            }
        } else if (!dessert.equals("No")) {
            ttlPrice = rent * months;
        }
        if (years.equals("two")) {
            ttlPrice = ttlPrice * (100 - 3.75) / 100;
        }
        System.out.printf("%.2f lv.", ttlPrice);
    }
}

