import java.util.Random;

public class Main3 {
    public static void main(String[] args) {
        Random rand = new Random();
        int month = rand.nextInt(11) + 1;
        switch(month) {
            case 1:
                System.out.println(month + " january");
                break;
            case 2:
                System.out.println(month + " february");
                break;
            case 3:
                System.out.println(month + " march");
                break;
            case 4:
                System.out.println(month + " april");
                break;
            case 5:
                System.out.println(month + " may");
                break;
            case 6:
                System.out.println(month + " june");
                break;
            case 7:
                System.out.println(month + " july");
                break;
            case 8:
                System.out.println(month + " august");
                break;
            case 9:
                System.out.println(month + " september");
                break;
            case 10:
                System.out.println(month + " october");
                break;
            case 11:
                System.out.println(month + " november");
                break;
            case 12:
                System.out.println(month + " december");
        }

    }
}
