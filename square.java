public class square{
	public static void main(String[] args) {
		int count = 1;
		for(int i=1;i<=16;i++){	
            System.out.print(count);
			if( i<4 || i>8 && i<12 ){
				count++;
			}
			else if(i>4 && i<8 || i>12){
				count--;
			}
			else if (i%4==0){
				System.out.println();
				count+=4;
			}
		}
	}
}
