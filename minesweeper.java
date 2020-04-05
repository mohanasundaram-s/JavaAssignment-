import java.util.Scanner;
class content{
    //rows and column define
    int row = 7;
    int column = 7;
    int[][] mines=new int[row][column];
    String[][] showArray=new String[row][column];
    public content(){
        mines[0][1]=-1;
        mines[1][3]=-1;
        mines[2][6]=-1;
        mines[3][3]=-1;
        mines[4][2]=-1;
        mines[5][4]=-1;
        mines[6][5]=-1;
        for(int i=0;i<mines.length;i++){
            for(int j=0;j<mines.length;j++){
                if(mines[i][j] != -1){
                    mines[i][j] =0;
                }
                if(mines[i][j] == -1){
                    neighbourfamily(i,j);
                }
            }
        }
        //show(mines);
    }
    public void show(String[][] arr){
        for(int wc=0;wc<arr.length;wc++){
			for(int wa=0;wa<arr.length;wa++){
				System.out.print(mines[wc][wa]+" ");
			}
			System.out.println();
		}
    }
    public void neighbourfamily(int c,int r){
        if(c < column && r < row && mines[c][r] != -1){
            mines[c-1][r-1]=mines[c-1][r-1]+1;
        }
        if(c < column-1 && r < row && mines[c][r] != -1){
            mines[c+1][r-1]=mines[c+1][r-1]+1;
        }
        if(c < column && r < row-1 && mines[c][r] != -1){
            mines[c-1][r+1]=mines[c-1][r+1]+1;
        }
        if(c < column-1 && r < row-1 && mines[c][r] != -1){
            mines[c+1][r-1]=mines[c+1][r-1]+1;
        }
       
    }
    public void checkStatus(int sc,int sa,String inp){
        if(mines[sc][sa] != -1 &&  inp.equals("n") ){
            showArray[sc][sa]=Integer.toString(mines[sc][sa]);
			show(showArray);
			gameComplete=false;

        }
        else if(showArray[sc][sa]=="F" && inp.equals("n")){
            showArray[sc][sa]="*";
            show(showArray);
            gameComplete=false;
        }
        else if(showArray[sc][sa]=="." && inp.equals("y")){
         
             showArray[sc][sa]="F";
             show(showArray);
             gameComplete=false;
        }
        else if(showArray[sc][sa].equals("-1") && inp.equals("n")){
			for(int k=0;k<showArray.length;k++){
				for(int l=0;l<showArray.length;l++){
					if(showArray[k][l].equals("-1")){
						showArray[k][l]="B";
					}
				}
			}	
			show(showArray);
			System.out.println("Game Over .....");
			gameComplete=true;
		}
		
    }
    
    
    boolean gameComplete = false;
    public void startGame(){
        while(gameComplete != true){
            Scanner Input = new Scanner(System.in);
            System.out.print("Enter the column :");
            int columns =Input.nextInt();
            System.out.print("Enter the row :");
            int rows =Input.nextInt();
            System.out.print("fix the flag ? y/n :");
            String value =Input.next(); 
            checkStatus(columns,rows,value);
                    
        }
    }
}
class minesweeper{
    public static void main(String arg[]){
        System.out.println("hi");
        content game = new content();
        game.startGame();
    }
}
