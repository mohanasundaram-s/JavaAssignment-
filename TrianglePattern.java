import java.lang.Math;
class TriangularPattern{
    public static void main(String[] args) {

       int num= 7,col= 1;
       int staringNumber= 1;
       for(int i=0;i<num;i++){
            for(int k=0;k<col;k++){
                System.out.print(staringNumber+" ");
                if(k<Math.round(col/2)){
                    staringNumber++;
                }
                else{
                    staringNumber--;
                }

            }
            System.out.println();
            col+=2;
            staringNumber=1;
           

       }

    }
}