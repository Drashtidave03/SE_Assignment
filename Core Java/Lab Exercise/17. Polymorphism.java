
class Parent {
    public void show() {
        System.out.println("show method in Parent class");
    }
    public void call() {
        System.out.println("call in parent");
    }
}

class Child extends Parent {
    @Override
    public void show() {
        System.out.println("show method in Child class (Overridden)");
    }

    @Override
    public void call() {
        System.out.println("call in child (Overridden)");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Parent obj = new Child();

        obj.show(); 
        obj.call(); 
    }
}
