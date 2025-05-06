import java.util.Scanner;

public class Esercizio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci un numero intero ");
        int numero = scanner.nextInt();

        for (int i = numero-1; i >=0 ; i--) {
            System.out.println(i);
            
        }
    }
}
