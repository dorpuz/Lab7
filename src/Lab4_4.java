import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab4_4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Podaj liczbę, której pierwiastek chcesz policzyć: ");
            double d = scanner.nextDouble();
            if (d < 0) throw new IllegalArgumentException();

            System.out.println("Pierwiastek liczby " + d + " wynosi " + Math.sqrt(d));

        } catch (IllegalArgumentException iae) {
            iae.printStackTrace();
            System.err.println("Liczba ujemna!");
        } catch (InputMismatchException ime) {
            //ime.printStackTrace();
            System.err.println("Nieprawidłowy ciąg znaków!");
        }

        scanner.close();
    }
}
