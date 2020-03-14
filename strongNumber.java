import java.util.Scanner;
class StrongNumber {
	
	public static void main(String[] args){
		int Number, Temp, Reminder, Sum = 0, i, Factorial;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		Number = sc.nextInt();		
		
		Temp = Number;
		while( Temp > 0){
			Factorial = 1; 
			i = 1; 
		    Reminder = Temp % 10;
		    while (i <= Reminder){
		     	Factorial = Factorial * i;
		     	i++;
		    }
		    Sum = Sum + Factorial;
		    Temp = Temp /10;
        }
        if(Number == Sum){
            System.out.println("Strong Number " + Number + " =  " + Sum);
        }
        else{
            System.out.println("It's not Strong Number "+ Number + " =  " + Sum);
        }
	}
}