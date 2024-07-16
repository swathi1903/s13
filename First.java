import java.util.HashMap;
import java.util.Map;
public class First {
    public static void main(String[] args) {
        int[] array = {4, 2, 5, 3, 2, 4, 1, 5};
        int result = findFirstNonRepeatingElement(array);
        if (result != -1) {
            System.out.println("The first non-repeating element is: " + result);
        } else {
            System.out.println("No non-repeating element found");
        }
    }
    private static int findFirstNonRepeatingElement(int[] array) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        for (int num : array) {
            if (frequencyMap.get(num) == 1) {
                return num;
            }
        }
        return -1;
    }
}