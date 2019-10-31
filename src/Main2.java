import java.util.Random;

public class Main2 {
    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(100);
        System.out.println(a);
        int b = a % 2 == 0 ? a + 2 : a + 1;
        System.out.println(b);
    }
}
