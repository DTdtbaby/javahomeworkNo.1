package datao1;

/*
����:��һ������
������  �ֱ���Ա�2012,03,12����;
����06;�ʺ�ʱ����;
19**06**
*/
public class caishengri{
	public static void main(String[] args) {
		//�������������
		
		
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