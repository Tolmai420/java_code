import java.util.Scanner;
public class W05_02_ifElse_PosNegZero  {
    
    public static void main (String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter a Number :");
        int number = kb.nextInt();
        
        if(number>0 ){
            System.out.println(number + " is a positive number. ");
        }else if(number<0 ){
            System.out.println(number + " is a negative number. ");

        }else{
            System.out.println(number + " is zero. ");
        }

    }
}