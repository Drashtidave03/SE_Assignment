public class MethodOverload {
    
    public int display(int value) {
        return value;
    }

    public double display(double value) {
        return value;
    }

    public String display(String value) {
        return value;
    }

    public static void main(String[] args) {
        OverloadDemo demo = new OverloadDemo();

        System.out.println("Integer: " + demo.display(100));
        System.out.println("Double: " + demo.display(99.99));
        System.out.println("String: " + demo.display("Hello"));
    }
}
