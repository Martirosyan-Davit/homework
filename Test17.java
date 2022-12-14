import java.util.Scanner;

public class Test17 {
    public static void main(String[] args) {

        Scanner IN = new Scanner(System.in);
        int num1 = IN.nextInt();
        int num2 = 1;
        int num3 = num1 - 1;
        int sum1 = 0;
        int sum2 = 0;

        while (num3 != 0) {

            if ((num3 & num2) == 1) {
                ++sum1;
            }
            num3 = num3 >> 1;
            ++sum2;
        }
        if (sum1 == sum2) {
            System.out.println(num1 + " is a power of 2");
        } else {
            System.out.println(num1 + " is not a power of 2");

        }

        // System.out.println(sum1);
        // System.out.println("q " +sum2);

    }

}
