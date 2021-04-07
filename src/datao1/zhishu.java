/*
 * 求地2019个质数
 */
package datao1;

public class zhishu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int []arr=new int[2019];
		//arr[0]=2;
		int num=1;
		for(int i=3;i<1000;i++){
		for(int x=2;x<i;x++){
			if(i%x!=0){
				num++;
		
				if(num>2019){
					System.out.println(i);
					break;
				}}	
		}
		}
	}

}
