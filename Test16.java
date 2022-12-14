import java.util.Scanner;

public class Test16 {
    public static void main(String[] args) {
        int num1 = 1;
        int sum = 0;
    
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the number");
        int num2 = inp.nextInt();
      
        while (num2 != 0) {
            if ((num2 & num1) == 1) {
                ++sum;
            }
           num2 = (num2 >> num1);
            
        }
    System.out.println(sum);
    }     
}
