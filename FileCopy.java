import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class FileCopy {
    public static void main(String[] arg) {
        if (arg.length == 0){
            System.out.println("Brak argumentów");
            System.exit(0);
        }
        boolean czy_url = true;
        if (arg[0].startsWith("htpp")){czy_url = true;}

        try {

            if (czy_url) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(
                        new URL(arg[0]).openStream()));
                FileWriter writer = new FileWriter(arg[1]);
                while (reader.readLine() != null) {
                    String linia = reader.readLine();
                    writer.write(linia + "\n");
                }

                writer.close();
                reader.close();
        }
            else {
                FileReader input = new FileReader(arg[0]);
                BufferedReader reader = new BufferedReader(input);
                FileWriter writer = new FileWriter(arg[1]);
                while (reader.readLine() != null) {
                    String linia = reader.readLine();
                    writer.write(linia + "\n");
                }
                writer.close();
                reader.close();
                input.close();
            }
        }
        catch(Exception e) {
            System.out.println("Plik źródłowy nie istnieje");
            e.getStackTrace();
        }
    }
}