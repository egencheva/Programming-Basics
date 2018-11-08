import java.util.Scanner;

public class six {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numMale = Integer.parseInt(scanner.nextLine());
        int numFemale = Integer.parseInt(scanner.nextLine());
        int maxTables = Integer.parseInt(scanner.nextLine());
        int count = 0;

        while (count <= maxTables) {
            for (int i = 1; i <= numMale; i++) {
                for (int j = 1; j <= numFemale; j++) {
                    count++;
                    char k = (char) 40;
                    char t = (char) 41;
                    if (count <= maxTables) {
                        System.out.printf("" + k + i + " " + "<->" + " " + j + t + " ");
                    }
                }
            }
            break;
        }
    }
}