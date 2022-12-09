import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner cc = new Scanner(System.in);
        

    System.out.println("Enter sentence");
         String Tox = cc.nextLine();
         StringBuilder BAr = new StringBuilder();

         BAr.append(Tox);

         BAr.reverse();

         System.out.println( "Reversed String  : " + BAr);







    }
    
}
