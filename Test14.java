import java.util.Scanner;
public class Test14 {
    public static void main(String[] args) {
        Scanner This = new Scanner(System.in);
        

        System.out.println("enter name");
        String Name = This.nextLine();
        System.out.println("enter the number");
        int num1 = This.nextInt();
        
        for (int i = 0; i <= num1 - 1; ++i) {
            System.out.println(Name);
        }

    }
    
}
