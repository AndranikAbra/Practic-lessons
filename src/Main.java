public class Main {

        public static void main(String[] args) {
            int a = 27;
            int b = 35;

            Arithmetic ar = new Arithmetic(a,b);

            System.out.println("сумма чисел " + a + " и " + b + " = " + ar.sum());
            System.out.println("произведение чисел " + a + " и " + b + " = " + ar.product());
            System.out.println("максимальное из чисел " + a + " и " + b + " = " + ar.max());
            System.out.println("минимальное из чисел " + a + " и " + b + " = " + ar.min());
        }
    static class Arithmetic {
        int a;
        int b;

        public Arithmetic(int a, int b) {
            this.a = a;
            this.b = b;
        }

        public int sum() {
            return a + b;
        }

        public int product() {
            return a * b;
        }

        public int max() {
            return Math.max(a, b);
        }

        public int min() {
            return Math.min(a, b);
        }

    }
}
