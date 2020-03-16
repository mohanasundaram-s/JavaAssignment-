import java.util.Scanner;
import java.util.Arrays;
class SortingNumber{
    public static void main(String a[]){
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the How many numbers : ");
        int value = Input.nextInt();
        int arr[]=new int[value];
        System.out.println("Enter the number: ");
        for(int i=0;i<value;i++){
           
            arr[i]=Input.nextInt();
        }
        //System.out.println(arr);
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+",");
        };
        
        
    }
}
