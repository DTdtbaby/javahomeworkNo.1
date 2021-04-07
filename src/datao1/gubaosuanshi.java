package datao1;

import java.lang.reflect.Array;
import java.util.ArrayList;

/*
 * ABCDE ∗ ?=EDCBA
 * ABCDE 应该代表不同的数字，问号也代表某个数字
 */
public class gubaosuanshi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A,B,C,D,E,F;
		for(int a=1;a<10;a++){
			//a=a*10000;
			for(int b=0;b<10;b++){
				//b=b*1000;
				for(int c=0;c<10;c++){
					//c=c*100;
					for(int d=0;d<10;d++){
						//d=d*10;
						for(int e=0;e<10;e++){
							int x=a*10000+b*1000+c*100+d*10+e;
							int y=e*10000+d*1000+c*100+b*10+a;
							for(int i=2;i<10;i++){
								if(i==x/y&&a!=b&&a!=c&&a!=d&&a!=e&&b!=c&&b!=d&&b!=e&&c!=d&&c!=e&&d!=e){
									
									System.out.println(i+"--------");
								System.out.println(a+","+b+","+c+","+d+","+e);	
								break;
								}
						}
					}
				}
			}
		}
		//int x=a*10000+b*1000+c*100+d*10+e;
		
		}
		
	}

}
