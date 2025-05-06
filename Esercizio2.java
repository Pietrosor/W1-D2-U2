import java.util.Scanner;

public class Esercizio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inerisci un numero da 0 a 3 ");
        int numero = scanner.nextInt();

        switch (numero){
            case 0:
                System.out.println("zero");
                break;
                case 1:
                System.out.println("uno");
                break;
                case 2:
                System.out.println("due");
                break;
                case 3:
                System.out.println("tre");
                break;
            default:
                System.out.println("numero non accettato");
        }
    }


}
