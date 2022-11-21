import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;
import java.util.Properties;
import java.util.Scanner;
import java.io.FileWriter;

public class MultiplicationTable {
    public static void main(String[] arg) throws IOException {

        Properties appProp = new Properties();



        appProp.setProperty("wartość_minimum", "1");
        appProp.setProperty("wartość_maximum", "10");
        appProp.setProperty("procent", "70");
        appProp.setProperty("powtórzeń_minimum", "10");
        appProp.setProperty("powtórzeń_maximum", "25");

        appProp.store(new FileOutputStream("config.properties"), null);

        Integer min = Integer.valueOf(appProp.getProperty("wartość_minimum"));
        Integer max = Integer.valueOf(appProp.getProperty("wartość_maximum"));
        Integer prc = Integer.valueOf(appProp.getProperty("procent"));
        Integer max_pow = Integer.valueOf(appProp.getProperty("powtórzeń_minimum"));
        Integer min_pow = Integer.valueOf(appProp.getProperty("powtórzeń_maximum"));

        int powtorzenie = 1;
        double dobre = 0;
        double uzyskany_procent = 0;

        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();
        while (powtorzenie<min_pow || uzyskany_procent < prc){
            if (powtorzenie > max_pow){break;}

            int pierwszy = rnd.nextInt(min,max);
            int drugi = rnd.nextInt(min,max);

            System.out.printf("%d * %d = ", pierwszy, drugi);
            int odp = scan.nextInt();

            if (pierwszy*drugi == odp){dobre++;}

            uzyskany_procent = (dobre/powtorzenie)*100;
            powtorzenie++;
        }
        System.out.printf("Otrzymałeś %.2f procent. Ilość odpowiedzi: %d%n", uzyskany_procent, powtorzenie);

    }
}
