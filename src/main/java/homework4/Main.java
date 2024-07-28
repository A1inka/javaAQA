package homework4;

public class Main {
    public static void main(String[] args) {
        // 1 задание
        Task1.printThreeWords();
        // 2 задание
        Task2.checkSumSign();
        // 3 задание
        Task3.printColor();
        // 4 задание
        Task4.compareNumbers();
        // 5 задание
        System.out.println(Task5.isLimit(5, 10));
        // 6 задание
        Task6.checkPositivity(-8);
        // 7 задание
        System.out.println(Task7.isPositivity(20));
        // 8 задание
        Task8.repeatString("array", 6);
        // 9 задание
        System.out.println(Task9.isLeapYear(2004));
        // 10 задание
        Task10 task10 = new Task10();
        int[] array1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        task10.reverseArray(array1);
        for (int i : array1) {
            System.out.println(i);
        }
        // 11 задание
        Task11 task11 = new Task11();
        int[] array2 = new int[100];
        task11.fillArray(array2);
        for (int i : array2) {
            System.out.println(i);
        }
        // 12 задание
        Task12 task12 = new Task12();
        int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        task12.multiplyArray(array3);
        for (int i : array3) {
            System.out.println(i);
        }
        // 13 задание
        Task13 task13 = new Task13();
        int[][] array4 = new int[10][10];
        task13.filTheDiagonalsOfTheMatrix(array4);
        for (int i = 0; i < array4.length; i++) {
            for (int j = 0; j < array4[i].length; j++) {
                System.out.print(array4[i][j] + " ");
            }
            System.out.println();
        }
        // 14 задание
        int[] array5 = Task14.createArray(5, 10);
        for (int i : array5) {
            System.out.println(i);
        }
    }
}
