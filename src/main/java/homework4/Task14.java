package homework4;

public class Task14 {
    public static int[] createArray(int len, int initialValue) {
        int[] result = new int[len];
        for (int i = 0; i < result.length; i ++) {
            result[i] = initialValue;
        }
        return result;
    }
}
