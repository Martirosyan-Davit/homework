import java.util.Scanner;

public class Test2 {

  public static void main(String[] args) {
    int count = 4;
    int arr[] = new int[count];

    for (int i = 0; i < count; ++i) {
      
      System.out.println("please enter the number");
      Scanner input = new Scanner(System.in);
      arr[i] = input.nextInt();
      
    }
    int sum = 0;
    int min = arr[0];
    for (int i = 0; i < arr.length; ++i){
      sum = arr[i] + sum;
      if (arr[i] < min ) {
        min = arr[i];
      }
    }
   
    if (sum == 0) {
      System.out.println("this number is smallest" + min);
    }

  }      
        
}

    

