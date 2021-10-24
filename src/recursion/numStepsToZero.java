package recursion;

public class numStepsToZero {

        public static void main(String[] args) {
            int n = 14;
            System.out.println(numberOfSteps(n));

        }
        public static int numberOfSteps(int num) {
            int result = 0;
            while (num != 0) {
                num = ((num % 2) == 0) ? num/2 : num-1;
                result++;
            }
            return result;
        }
    }

