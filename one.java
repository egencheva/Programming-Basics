import java.util.Scanner;

public class one {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceWiskey = Double.parseDouble(scanner.nextLine());
        double lWater = Double.parseDouble(scanner.nextLine());
        double lWine = Double.parseDouble(scanner.nextLine());
        double lShampaing = Double.parseDouble(scanner.nextLine());
        double lWiskey = Double.parseDouble(scanner.nextLine());

        double priceShampeign=priceWiskey*0.5;
        double priceWine=priceShampeign*0.4;
        double priceWater = priceShampeign*0.1;

        double ttlExpense = priceWiskey*lWiskey+priceShampeign*lShampaing+priceWine*lWine+priceWater*lWater;

        System.out.printf("%.2f",ttlExpense);
    }
}


