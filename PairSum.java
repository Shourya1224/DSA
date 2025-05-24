import java.util.*;

public class PairSum {

    public static List<List<Integer>> findAllPairs(int[] arr, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            int complement = target - num;
            if (map.containsKey(complement)) {
                for (int i = 0; i < map.get(complement); i++) {
                    result.add(Arrays.asList(complement, num));
                }
            }
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 20, 10, 30};
        int target = 50;
        List<List<Integer>> pairs = findAllPairs(arr, target);
        for (List<Integer> pair : pairs) {
            System.out.println(pair);
        }
    }
}
