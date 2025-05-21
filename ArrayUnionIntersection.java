import java.util.*;

public class ArrayUnionIntersection {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 4, 5, 6};
        int[] array2 = {2, 3, 5, 7};

        
        Set<Integer> union = new HashSet<>();
        for (int num : array1) {
            union.add(num);
        }
        for (int num : array2) {
            union.add(num);
        }

       
        Set<Integer> set1 = new HashSet<>();
        for (int num : array1) {
            set1.add(num);
        }

        Set<Integer> intersection = new HashSet<>();
        for (int num : array2) {
            if (set1.contains(num)) {
                intersection.add(num);
            }
        }

        
        System.out.println("Union: " + union);
        System.out.println("Intersection: " + intersection);
    }
}
