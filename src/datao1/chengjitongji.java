/*
 * 输入考试人数;考试的分数.计算及格率和优秀率(85分以上),四舍五入输出
 */
package datao1;

import java.util.Scanner;

public class chengjitongji {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int sc1 =scan.nextInt();
		int[] a=new int [sc1];
		int y=0;
		int j=0;
		for(int i=0;i<sc1;i++){
			a[i]=scan.nextInt();
		}
		for(int i=0;i<sc1;i++){
			if(a[i]>=85){
				y++;
			}
			if(a[i]>=60){
				j++;
			}
		}
		 System.out.printf( "%.0f",(float) j /sc1 * 100);
	        System.out.println("%");
	        System.out.printf("%.0f",(float) y / sc1 * 100);
	        System.out.println("%");
			System.out.println("6");
		}
		
/*
 * System.out.println((int)(y/sc1*100)+'%');
			System.out.println((int)(j/sc1*100)+'%');	
 */



}
