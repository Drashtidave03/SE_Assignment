public class static {
    private static int count = 0;
    private String name;

    public Counter(String name) {
        this.name = name;
        incrementCount();
    }

    private static void incrementCount() {
        count++;
    }

    public static int getCount() {
        return count;
    }

    public void display() {
        System.out.println("Object: " + name + " | Global Count: " + count);
    }

    public static void main(String[] args) {
        Counter obj1 = new Counter("Instance_A");
        Counter obj2 = new Counter("Instance_B");
        Counter obj3 = new Counter("Instance_C");

        obj1.display();
        obj2.display();
        obj3.display();

        System.out.println("Final Static Count: " + Counter.getCount());
    }
}
