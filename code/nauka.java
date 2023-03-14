import java.util.*;

public class nauka {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Podaj liczbe do rozkladu na czynniki pierwsze: ");
        int n = input.nextInt();
        rozkladNaCzynnikiPierwsze(n);
        int n2 = input.nextInt()
    }

    public static void rozkladNaCzynnikiPierwsze(int n) {
        System.out.print("Rozklad liczby " + n + " na czynniki pierwsze: ");

        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }
    }
}
