public class ArithmeticMean {
    public static void main(String[] args) {

        if (args.length == 0){
            System.out.println("Brak argumentów");
            System.exit(0);
        }

        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            int num = Integer.parseInt(args[i]);
            sum += num;
        }
        int mean = sum/args.length;
        System.out.print("Średnia liczb: ");
        System.out.printf("%d %n", mean);

    }
}
