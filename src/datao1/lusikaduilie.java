package datao1;

import java.math.BigDecimal;

/*
 * 1/3,3/4,4/7,7/11,11/18...�ᷢ����Խ��Խ�ӽ��ڻƽ�ָ�����

���������Ǽ��������һ�ʼ�������ֵ����������Ѿ��ﵽ���� 0.618034һ�µľ��ȡ�

��д���ñ�ֵ����ʽ�ǣ�����/��ĸ�����磺29/47
 */
public class lusikaduilie {
//1 ,3 ,4 ,7 ,11
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//BigDecimal a=new BigDecimal(0);
		double [] arr=new double [999];  //����Ҫ����С������,��˱���Ҫ��double���͵�����
		arr[0]=1;          //ע��˴�������÷�
		arr[1]=3;
		//double arr[]={0,1};
		//System.out.println(arr[0]+arr[1]);
		for(int i=2;i<999;i++){
			arr[i]=arr[i-1]+arr[i-2];

			if(Math.abs(arr[i-1]/arr[i]-0.618034)<1e-6){    //ע��˴����˾���ֵ
				System.out.println((int)arr[i-1]+"/"+(int)arr[i]);
				break;  //�˴�Ҫ��Break  ��Ȼ��������������
			}

}
	}
}
