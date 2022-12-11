import java.util.Scanner;

public class Test12 {
    public static void main(String[] args) {

        Scanner Main = new Scanner(System.in);
        System.out.println("enter number");
        int num1 = Main.nextInt();

        if (num1 % 2 == 0) {
            for (int i = 0; i <= 100; ++i)
                System.out.println(i);

        } else {
            for (int i = 100; i >= 0; --i)
                System.out.println(i);
        }

    }
}
