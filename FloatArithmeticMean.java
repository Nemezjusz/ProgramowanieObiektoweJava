public class FloatArithmeticMean {
    public static void main(String[] args) {

        if (args.length == 0){
            System.out.println("Brak argumentów");
            System.exit(0);
        }

        float sum = 0;
        for (int i = 0; i < args.length; i++) {
            float num = Float.parseFloat(args[i]);
            sum += num;
        }
        float mean = sum/args.length;
        System.out.print("Średnia liczb: ");
        System.out.printf("%.4f %n", mean);

    }
}