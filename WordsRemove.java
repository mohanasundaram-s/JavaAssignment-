import java.util.Scanner;
class wordRemove{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the sentence");
        String input = s.nextLine();
        char c = s.next().charAt(0);
        String r = "";
        for (int i = 0; i < input.length(); i ++) {
             if (input.charAt(i) != c) r += input.charAt(i);
              
             
        }
        System.out.println(r);
    }
}