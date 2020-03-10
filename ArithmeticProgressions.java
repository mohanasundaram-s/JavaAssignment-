//Write a program to print Arithmetic Progression series 
import java.util.Scanner;

class ArithmeticProgression{
    public static void main(String[] args){
            Scanner input = new Scanner(System.in);

            int StartingNo = 0;
            int NoOfElement = 0;
            int Difference = 0;
            int term = 0;

            System.out.print("Enter the  starting number:"); 
            StartingNo = input.nextInt();

            System.out.print("Enter the Difference:"); 
            Difference = input.nextInt();

            System.out.print("Enter the NoOfElement:"); 
            NoOfElement = input.nextInt();

            System.out.println("");
            System.out.println("The Arithmetic Progression is as follows :");

            for(int i = 0; i < NoOfElement; i++){
                term = StartingNo + i * Difference;
                System.out.print(term+",");
            }
            
            System.out.println("...");
    }
}
/*Enter the  starting number:2
Enter the Difference:3
Enter the NoOfElement:5

The Arithmetic Progression is as follows :
2,5,8,11,14,...
*/
