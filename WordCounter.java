import java.io.BufferedReader;
import java.io.FileReader;

public class WordCounter {
    public static void main(String[] arg) {
        int words = 0;
        int lines = 0;
        int letters = 0;
        int plik = 0;
        boolean l = false;
        boolean c = false;
        boolean w = false;

        if (arg.length == 0){
            System.out.println("Brak argumentów");
            System.exit(0);
        }

        for (int i = 0; i < arg.length; i++){
            if (arg[i].startsWith("-")){
                if (arg[i].contains("w")){w = true;}
                if (arg[i].contains("l")){l = true;}
                if (arg[i].contains("c")){c = true;}
            }
            else {plik = i;}
        }
        try {
            FileReader input = new FileReader(arg[plik]);
            BufferedReader reader = new BufferedReader(input);

            while (reader.readLine() != null){
                String line = reader.readLine();
                lines += 1;
                String[] line_words = line.split(" ");
                words += line_words.length;
                for (int i=0;i<line_words.length;i++){
                    letters += line_words[i].length();
                }

            }
            reader.close();
            input.close();
        }
        catch(Exception e) {e.getStackTrace();}

        if(!l & !c & !w){
            l = true;
            c = true;
            w = true;
        }

        if (l){System.out.printf("Wierszy: %d%n",lines);}
        if (w){System.out.printf("Słów: %d%n", words);}
        if (c){System.out.printf("Liter: %d%n", letters);}
    }
}
