package homework4;

public class Task5 {
    public static boolean isLimit(int a, int b) {
        int sumOfNums = a + b;
        if (sumOfNums >= 10 && sumOfNums <= 20) {
            return true;
        }
        else {
            return false;
        }
    }
}
