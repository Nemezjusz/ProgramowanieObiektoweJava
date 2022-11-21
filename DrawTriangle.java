import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj bok trójkąta: ");
        int wysokosc_trojkata = scan.nextInt();

        while (wysokosc_trojkata <= 0) {
            System.out.println("Nieprawidłowa liczba. Spróbuj jeszcze raz: ");
            wysokosc_trojkata = scan.nextInt();
        }
        int szerokosc = wysokosc_trojkata * 2 - 1;
        int srodek = szerokosc/2;
        String tablica [][] = new String[wysokosc_trojkata][szerokosc];

        for (int i=0; i<wysokosc_trojkata;i++){
            for (int j=0; j<szerokosc; j++){
                tablica[i][j] = " ";
            }
        }

        for (int i=0; i<wysokosc_trojkata;i++){
            for (int j=srodek-i; j<=srodek+i;j++){
                tablica[i][j] = "#";
            }
        }

        for (int i=0; i<wysokosc_trojkata;i++){
            for (int j=0; j<szerokosc; j++){
                System.out.print(tablica[i][j]);
            }
            System.out.print("\n");
        }
    }
}
