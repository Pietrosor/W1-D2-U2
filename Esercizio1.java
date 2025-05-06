public class Esercizio1 {

    public static boolean stringaPariDispari(String string){

        return string.length()%2==0;
    }

    public static boolean annoBisestile(int anno){
        return (anno%4 == 0 && anno%100 == 0) || (anno%400 == 0);
    }

    public static void main(String[] args) {
        System.out.println(stringaPariDispari("ciao"));
        System.out.println(stringaPariDispari("serio"));

        System.out.println(annoBisestile(2000));
        System.out.println(annoBisestile(2024));
    }
}
