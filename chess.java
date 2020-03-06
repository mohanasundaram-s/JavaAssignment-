///write a program to print 1 & 0 in chessboard pattern 
public class chess{
        public static void main(String ar[]){

            int  k = 1;
            int  rows = 4;
            int cols = 4 ;
            for(int i=1;i<=rows; i++){
                for(int j=1; j<=cols; j++){
                    if(k == 1){
                        System.out.print("1");
                    }
                    else{
                        System.out.print("0");
                    }
                    k *= -1;
                }
                if(cols % 2 == 0){
                    k *= -1;
                }
                System.out.println("\n");
            }
    }
}


   
