public class MultiCatchExample {
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            arr[10] = 30 / 0; 

        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero.");
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of range.");
            
        } catch (Exception e) {
            System.out.println("Error: An unexpected exception occurred.");
            
        } finally {
            System.out.println("Execution completed.");
        }
    }
}
