package homework4;

public class Task13 {
    public void filTheDiagonalsOfTheMatrix(int[][] array) {
        for (int i = 0; i < array.length; i ++) {
            array[i][i] = 1;
            array[i][array.length - i - 1] = 1;
        }
    }
}
