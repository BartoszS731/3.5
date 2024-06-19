import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj szerokość prostokąta:");
        int width = scanner.nextInt();

        System.out.println("Podaj wysokość prostokąta:");
        int height = scanner.nextInt();

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
}