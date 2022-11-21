import java.util.Scanner;
public class Grep {
    public static void main(String[] arg) {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Wpisz pattern: ");
        String pattern = myObj.nextLine();
        System.out.println("Wpisz tekst: ");
        String tekst = myObj.nextLine();

        int i = tekst.indexOf(pattern);
        if (i == -1){
            System.out.println("Pattern nie pojawił się w tekscie");
        }
        else {
            System.out.printf("Twój pattern pojawił się w %d indeksie tekstu%n", i);
        }

        for (int j = 0; j < tekst.length(); j++){
                for (int k = 0; k<pattern.length(); k++) {
                    if (tekst.charAt(j) == pattern.charAt(k)) {
                        if (k-1==pattern.length()){
                            System.out.printf("Znaleziono pattern w % indeksie tekstu%n", j);
                            System.exit(0);
                        }
                    }
                    else {
                        break;
                    }
                }


        }
    }
}
