import java.util.Scanner;
public class W05_01_ifElse_OddEvenNumber{
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int number = kb.nextInt();
        int result = number % 2;
       
       // Case 1
        if (result!=0){
            System.out.println(number + " is an odd number.");

        }else{
            System.out.println(number + " is an even number.");
        }
        //case 2
        if (result==0){
            System.out.println(number + " is an odd number.");

        }else{
            System.out.println(number + " is an even number.");
        }

        // Case 3
        if (result==0){
            System.out.println(number + " is an even number.");

        }else{
            System.out.println(number + " is an odd number.");
        }
        // Case 4
         if (result!=0){
            System.out.println(number + " is an even number.");

        }else{
            System.out.println(number + " is an odd number.");
        }
    }
}