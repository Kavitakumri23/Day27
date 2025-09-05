public class Demo5 {
        public static void main(String[] args) {
            int n = 5;
            int result = factorial(n);
            System.out.println("Factorial of " + n + " = " + result);
        }

        static int factorial(int n) {
            // base case
            if (n == 0 || n == 1) {
                return 1;
            }
            // recursive case
            return n * factorial(n - 1);
        }
    }


