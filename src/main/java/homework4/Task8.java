package homework4;

public class Task8 {
    public static void repeatString (String s, int a) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < a; i ++) {
            stringBuilder.append(s);
        }
        System.out.println(stringBuilder);
    }
}
