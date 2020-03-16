import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;
class disariumNumber {
    public static void main(String arg[]){
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the how many Digit:");
        int arrAllocation = Input.nextInt();
        System.out.print("Enter the number : ");
        int value = Input.nextInt();
        int userValue = value;
        int sumOfDigits = 0,i=0;
        int arr[]=new int[arrAllocation];
        while(value != 0){
            int currentDigit = value  % 10;
            arr[i]=currentDigit;
            i++;
            value=value/10;
        } 
        int j=arrAllocation;
        for (int c = 0; c < arr.length; c++){
              System.out.println("Element at index " + c +  " : "+Math.pow(arr[c],j));
              sumOfDigits+=(int) Math.pow(arr[c],j);
              j--;

        }
        System.out.println(userValue+"hi");
        if(sumOfDigits == userValue){
            System.out.println(userValue+" is Disarium Number");
        }
        else{
            System.out.println(userValue+" is not  Disarium Number");
        }
    }
} 