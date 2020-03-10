//write a program to print the sum of digits that are even
import java.util.Scanner;
class sumOfevenNumbers{
    public static void main(String a[]){
        Scanner input = new Scanner(System.in);
        int findOut,sumOfEvenNumbers = 0,i;

        System.out.print("Enter the number:"); 
        findOut = input.nextInt();
        
        while(findOut != 0){
            
                int singleDigital = findOut % 10;
                if(singleDigital %2 == 0){
                    sumOfEvenNumbers += singleDigital;
                }
                findOut/=10;

        }
        System.out.println("sum of even numbers" +"="+sumOfEvenNumbers);
    }
}