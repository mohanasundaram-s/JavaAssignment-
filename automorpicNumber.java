import java.util.Scanner;
class automorpicNumber{
    public static void main(String arg[]){
        Scanner Input = new  Scanner(System.in);
        System.out.print("Enter the number : ");
        long value = Input.nextInt();
        while(value !=0){
                long unit_digit1=value%10;
                long square=value*value;
                long unit_digit2=square%10;
                System.out.println(square);
                if(unit_digit1==unit_digit2)
                {
                    System.out.println(value+" is a automorpic number");
                    break;
                }
                else
                {
                    System.out.println(value+" is not a automorphic number");   
                    break;
                }
        }

    }
}