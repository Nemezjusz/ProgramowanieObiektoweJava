import java.io.FileReader;
import java.io.BufferedReader;

public class LineCounter {
    public static void main(String[] arg) {

        int lines = 0;
        try {
            FileReader input = new FileReader(arg[0]);
            BufferedReader reader = new BufferedReader(input);

            while (reader.readLine() != null){
                lines += 1;
            }
            reader.close();
            input.close();
        }
        catch(Exception e) {
            e.getStackTrace();
        }
        System.out.println(lines);

    }
}
