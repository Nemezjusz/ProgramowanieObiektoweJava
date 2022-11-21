import java.util.Scanner;

public class DrawSquare {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj bok kwadratu: ");
        int bok_kwadratu = scan.nextInt();

        while (bok_kwadratu <= 0){
            System.out.println("Nieprawidłowa liczba. Spróbuj jeszcze raz: ");
            bok_kwadratu = scan.nextInt();
        }

        for (int j=0;j<bok_kwadratu;j++) {
            if (j!=0){
                System.out.print("\n");
            }

            if (j==0 || j == bok_kwadratu-1)
                for (int i = 0; i < bok_kwadratu; i++) {
                    System.out.print("#");
                }
            else{
                System.out.print("#");
                for (int i = 0; i<bok_kwadratu-2; i++){
                    System.out.print(" ");
                }
                System.out.print("#");
            }
        }
    }
}
