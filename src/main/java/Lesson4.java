public class Lesson4 {

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 5;
        int b = 9;
        int sumOfNums = a + b;
        if (sumOfNums >= 0) {
            System.out.println("Сумма положительная");
        }
        else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 0;
        if (value <= 0) {
            System.out.println("Красный");
        }
        else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        }
        else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 5;
        int b = 7;
        if (a >= b) {
            System.out.println("a >= b");
        }
        else {
            System.out.println("a < b");
        }
    }

    public static boolean isLimit(int a, int b) {
        int sumOfNums = a + b;
        if (sumOfNums >= 10 && sumOfNums <= 20) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void checkPositivity (int a) {
        if (a >= 0) {
            System.out.println("Число положительное");
        }
        else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean isPositivity (int a) {
        if (a >= 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void repeatString (String s, int a) {
        System.out.println(s.repeat(a));
    }

    public static boolean isLeapYear (int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public static int[] createArray(int len, int initialValue) {
        int[] result = new int[len];
        for (int i = 0; i < result.length; i ++) {
            result[i] = initialValue;
        }
        return result;
    }

    public static void main (String[] args) {

        // 1 задание
        printThreeWords();

        // 2 задание
        checkSumSign();

        // 3 задание
        printColor();

        // 4 задание
        compareNumbers();

        // 5 задание
        System.out.println(isLimit(5, 10));

        // 6 задание
        checkPositivity(-8);

        // 7 задание
        System.out.println(isPositivity(20));

        // 8 задание
        repeatString("array", 6);

        // 9 задание
        System.out.println(isLeapYear(2004));

        // 10 задание
        int[] array1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == 0) {
                array1[i] = 1;
            }
            else {
                array1[i] = 0;
            }
        }
        for (int i : array1) {
            System.out.println(i);
        }

        // 11 задание
        int[] array2 = new int[100];
        for (int i = 0; i < array2.length; i ++) {
            array2[i] = i + 1;
        }
        for (int i : array2) {
            System.out.println(i);
        }

        // 12 задание
        int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array3.length; i ++) {
            if (array3[i] < 6) {
                array3[i] *= 2;
            }
        }
        for (int i : array3) {
            System.out.println(i);
        }

        // 13 задание
        int[][] array4 = new int[10][10];
        for (int i = 0; i < array4.length; i ++) {
            array4[i][i] = 1;
            array4[i][array4.length - i - 1] = 1;
        }
        for (int i = 0; i < array4.length; i++) {
            for (int j = 0; j < array4[i].length; j++) {
                System.out.print(array4[i][j] + " ");
            }
            System.out.println();
        }

        // 14 задание
        int[] array5 = createArray(5, 10);
        for (int i : array5) {
            System.out.println(i);
        }

    }


}
