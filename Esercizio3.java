import java.util.Scanner;

public class Esercizio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        while (true){
            System.out.println("inserisci una stringa, digita :q per interrompere ");
            input = scanner.nextLine();
            if (input.equals(":q")){
                System.out.println("programma terminato");
                break;
            }

            String risultato = String.join(",", input.split(""));
            System.out.println("Stringa suddivisa: " + risultato);

        }
    }
}
