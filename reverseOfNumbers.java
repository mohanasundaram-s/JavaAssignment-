//write a program to find the reverse of a number. 
import java.util.Scanner;
class reverseOfNumbers{
    public static void main(String arg[]){
        Scanner input = new Scanner(System.in);
        int userInput,reverse=0;
        
        System.out.print("Enter the number:"); 
        userInput = input.nextInt();
        int value = userInput;

        while(value != 0){
            int singleDigital = value % 10;
            reverse = reverse*10+singleDigital;
            value/=10;
        }
        System.out.println("Reverse number :"+reverse);
    }
}
/*Enter the number:123456789          
Reverse number :987654321
*/
