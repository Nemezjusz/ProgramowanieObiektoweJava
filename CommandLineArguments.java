public class CommandLineArguments {
    public static void main(String[] args) {
        int i;
        System.out.printf("Liczba argumentów: %d%n", args.length);
        for (i = 0; i < args.length; i++){
            System.out.printf("Numer %d: ",i+1);
            System.out.println(args[i]);
        }

    }
}
