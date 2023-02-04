// // display no 1 to 5 
// /** 
// import java.util.Scanner;
// public class whileloop {
//     public static void main(String args[]) {
//       int i=1;
//         while(i<=5){
//             System.out.println(i);
//             i++;
//         }
//     }

// }  **/

// // Sum of Positive Numbers Only
// // import java.util.Scanner;
// // public class whileloop{
// //     public static void main(String args[]) {
// //         int sum=0;
// //         Scanner s= new Scanner(System.in);
// //         System.out.println("enter number");
// //         int a=s. nextInt();

// //         while(a>=0){
// //             sum += sum+a;
// //             System.out.println("enter a number");
// //             a=s.nextInt();
// //         }
// //         System.out.println(sum);

// //     }
// // }
// // Java program to find the sum of positive numbers
import java.util.Scanner;
//public class whileloop{
 class jhgjh {
  public static void main(String[] args) {

    int sum = 0;

    // create an object of Scanner class
    Scanner input = new Scanner(System.in);

    // take integer input from the user
    System.out.println("Enter a number");
    int number = input.nextInt();

    // while loop continues 
    // until entered number is positive
    while (number >= 0) {
      // add only positive numbers
      sum += number;

      System.out.println("Enter a number");
      number = input.nextInt();
    }

    System.out.println("Sum = " + sum);
    input.close();
  }
}

// import java.util.Scanner;

// import javax.swing.text.html.StyleSheet;

// public class whileloop {
//    public static void main(String[] args) 
//     {
        
//     System.out.println("enter number");
//         Scanner s= new Scanner(System.in);
//         int a= s.nextInt();
//         int sum=0;
//         while(a>=0){
//             sum+=a;
//             System.out.println("enter number");
//              a =s.nextInt();

//         }
//         System.out.println("sum of positive numbers entered by user is " +" "+sum);


//         s.close();
    
//     }
// }

