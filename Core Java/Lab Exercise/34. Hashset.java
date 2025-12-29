import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class UniqueList {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 4, 4, 5));
        
        HashSet<Integer> set = new HashSet<>(numbers);
        List<Integer> uniqueNumbers = new ArrayList<>(set);

        System.out.println("Original: " + numbers);
        System.out.println("Unique: " + uniqueNumbers);
    }
}
