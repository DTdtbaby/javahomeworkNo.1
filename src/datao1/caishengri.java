package datao1;

/*
问题:猜一下生日
年月日  分别可以被2012,03,12整除;
月是06;问何时生日;
19**06**
*/
public class caishengri{
	public static void main(String[] args) {
		//定义变量年月日
		
		
			for(int year=1901;year<2012;year++){
				for(int day=1;day<=30;day++){
					int sum=year*10000+600+day;
					if(sum%2012==0&sum%day==0){
						System.out.println(sum);	
					}
			}
			
		}
		
	}
}