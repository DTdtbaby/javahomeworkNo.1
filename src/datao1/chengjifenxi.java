/*
 * ���뿼������.���뿼�Գɼ�;�����߷�,��ͷ�,ƽ���ֱ�����λС��;
 */
package datao1;

import java.util.Scanner;

public class chengjifenxi {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int[] arr = new int[num];
		double a = 0;
		int index1 = 0;
		int index2 = 0;
		for (int i = 0; i < num; i++) {
			arr[i] = scan.nextInt(); // �˾���Ҫע��
			a = a + arr[i];
			if (arr[index1] < arr[i]) {
				index1 = i;
			}

		}
		double b =  a / num ;
		System.out.println(arr[index1]);
		// System.out.println((double)b/100);

		for (int i2 = 0; i2 < num; i2++) {
			if (arr[index2] > arr[i2]) {
				index2 = i2;
			}
		}
		System.out.println(arr[index2]);
		//System.out.printf("%5.2f",b);
		// System.out.println(String.format("%.2f", b));
		 System.out.printf("%.2f",b);
		//(int)(78.365*100)     7836    
	}
}
