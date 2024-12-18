public class UncommonBugSolution {
    public static void main(String[] args) {
        int x = 10;
        int y = 0;
        int z = 0;
        try {
            z = x / y;
        } catch (ArithmeticException e) {
            System.err.println("Error: Division by zero encountered.");
            // Handle the exception appropriately. Log, use default value, etc.
            z = Integer.MAX_VALUE; // Or any other suitable default
        }
        System.out.println(z);
    }
}