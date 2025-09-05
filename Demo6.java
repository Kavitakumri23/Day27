public class Demo6 {
        public static void main(String[] args) {
            int n = 5;
            int result = sum(n);
            System.out.println("Sum of first " + n + " natural numbers = " + result);
        }

        static int sum(int n) {
            // base case
            if (n == 0) {
                return 0;
            }
            // recursive case
            return n + sum(n - 1);
        }
    }

