import java.time.LocalDate;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Weekend {
    public static void main(String[] args){
        String wstep = "Dziś ";
        String liczba_dni = ", do weekendu pozostało: ";
        String nazwa_dnia = "";

        Date myDate = new Date();
        int i = myDate.getDay();

        switch (i) {
            case 1:
                nazwa_dnia = "poniedziałek";
                break;
            case 2:
                nazwa_dnia = "wtorek";
                break;
            case 3:
                nazwa_dnia = "środa";
                break;
            case 4:
                nazwa_dnia = "czwartek";
                break;
            case 5:
                nazwa_dnia = "piątek";
                break;
            case 6:
                nazwa_dnia = "sobota";
                break;
            case 0:
                nazwa_dnia = "niedziela";
                break;
        }

        if (i == 4){
            System.out.println(wstep+nazwa_dnia+", do weekendu pozostał: 1 dzień.");
        }
        else if (i >= 5 || i == 0){
            System.out.println(wstep+nazwa_dnia+liczba_dni + '0' + " dni. Jest weekend!");
        }
        else {
            String s = Integer.toString(5-i);
            System.out.println(wstep+nazwa_dnia+liczba_dni + s + " dni.");
        }

    }

}
