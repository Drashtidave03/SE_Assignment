package pack1;

public class AccessSource {
    public    String pub    = "Public: Visible everywhere";
    protected String prot   = "Protected: Visible in same package & subclasses";
    String def              = "Default: Visible in same package only";
    private   String priv   = "Private: Visible in this class only";

    public void displayPrivate() {
        System.out.println(priv); // Only accessible here
    }
}

// File: pack1/SamePackage.java
package pack1;

public class SamePackage {
    public void test() {
        AccessSource obj = new AccessSource();
        System.out.println(obj.pub);  
        System.out.println(obj.prot);
        System.out.println(obj.def);
    }
}

// File: pack2/DifferentPackage.java
package pack2;
import pack1.AccessSource;

class SubClass extends AccessSource {
    void test() {
        System.out.println(pub);
        System.out.println(prot);
    }
}

public class DifferentPackage {
    public static void main(String[] args) {
        AccessSource obj = new AccessSource();
        
        System.out.println(obj.pub);
       
    }
}
