import java.util.Random;

public class Main4 {
    public static void main(String[] args) {
        //int k = 2;
        int min = 5;
        int max = 155;
        int diff = max - min;
        Random rand = new Random();
        int j = rand.nextInt(diff) + 1;
        j += min;
        System.out.println("j = " + j);
        System.out.println("i = j = " + j);
        //System.out.println("k = " + k);
        if (j > 25 && j < 100) {
            System.out.println("Число " + j + " содержиться в интервале (25:100)");
        } else {
            System.out.println("Число " + j + " не содержиться в интервале (25:100)");
        }

        /*System.out.println("j = " + j + " j/k = " + (j / k + 1));
        int i = (j / k + 1) * 2;
        System.out.println("i = " + i);*/
    }
}
