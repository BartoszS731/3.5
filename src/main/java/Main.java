import java.util.Scanner;

public class Main
    
{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj wysokość trójkąta:");
        int height = scanner.nextInt();

        for (int i = 1; i <= height; i++) {
            // Drukujemy spacje, aby wyrównać trójkąt po prawej stronie
            for (int j = 1; j <= height - i; j++) {
                System.out.print(" ");
            }
            // Drukujemy gwiazdki i puste miejsca wewnątrz trójkąta
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i || i == height) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // Nowa linia po każdej iteracji zewnętrznej pętli
        }

        scanner.close();
    }
}
