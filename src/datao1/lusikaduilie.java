package datao1;

import java.math.BigDecimal;

/*
 * 1/3,3/4,4/7,7/11,11/18...会发现它越来越接近于黄金分割数！

你的任务就是计算出从哪一项开始，这个比值四舍五入后已经达到了与 0.618034一致的精度。

请写出该比值。格式是：分子/分母。比如：29/47
 */
public class lusikaduilie {
//1 ,3 ,4 ,7 ,11
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//BigDecimal a=new BigDecimal(0);
		double [] arr=new double [999];  //由于要进行小数运算,因此必须要用double类型的数据
		arr[0]=1;          //注意此处数组的用法
		arr[1]=3;
		//double arr[]={0,1};
		//System.out.println(arr[0]+arr[1]);
		for(int i=2;i<999;i++){
			arr[i]=arr[i-1]+arr[i-2];

			if(Math.abs(arr[i-1]/arr[i]-0.618034)<1e-6){    //注意此处用了绝对值
				System.out.println((int)arr[i-1]+"/"+(int)arr[i]);
				break;  //此处要加Break  不然会把所有数据输出
			}

}
	}
}
