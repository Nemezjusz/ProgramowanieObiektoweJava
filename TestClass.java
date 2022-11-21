public class TestClass {
    public static class Obiekt {
        private int czas;
        private int numer;
    }


    public static void main(String[] args) {

        int num = 1;
        if (args.length == 0) {
            System.out.println("Brak argumentów");
            System.exit(0);
        }

        int l = Integer.parseInt(args[0]);
        for (int i = 0; i < l; i++) {
            Obiekt obk = new Obiekt();
            obk.czas = (int) System.currentTimeMillis();
            obk.numer = num;
            num += 1;
            System.out.printf("%d. [%d] %n", obk.numer, obk.czas);
        }
    }
}
