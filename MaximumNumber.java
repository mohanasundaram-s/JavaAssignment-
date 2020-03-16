import java.util.Scanner;
class maximumNumber{
    public static void main(String[] args){ 
        Scanner Input= new Scanner(System.in);
        System.out.print("Enter the number : ");
        int count[] = new int[10]; 
        int num =Input.nextInt();  
        String str = Integer.toString(num); 
          
        for(int i=0; i < str.length(); i++){ 
            count[str.charAt(i)-'0']++; 
        } 
        int result = 0, multiple = 1; 
        for (int i = 0; i <= 9; i++){ 
            while (count[i] > 0) 
            { 
                result = result + (i * multiple); 
                count[i]--; 
                multiple = multiple * 10; 
            } 
        } 
        System.out.println(result); 
    } 
      
  
    
} 