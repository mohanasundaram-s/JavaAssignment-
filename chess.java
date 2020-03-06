//write a program to print 1 & 0 in chessboard pattern 
public class chess{
    int rows, cols, i, j, k;
    public static void main(String ar[]){

            k = 1;
            rows = 4;
            cols = 4 ;
            for(int i=1;i<=rows; i++){
                for(int j=1; j<=cols; j++){
                    if(k == 1){
                        System.out.println("1");
                    }
                    else{
                        System.out.println("0");
                    }
                    k *= -1;
                }
                if(cols % 2 == 0){
                    k *= -1;
                }
                System.out.print("\n");
            }

            return 0;



    }
}