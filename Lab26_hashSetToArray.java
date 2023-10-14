import java.util.HashSet;
public class Lab26_hashSetToArray {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("DSA");
        hashSet.add("OOP in Java");
        hashSet.add("SAD");
        hashSet.add("Probability and Statistics");
        hashSet.add("Web Technology");
        String[] array = hashSet.toArray(new String[0]);
        System.out.println("Elements(Subjects) in the array:");
        for (String element : array) {
            System.out.println(element);
        }
    }
}
