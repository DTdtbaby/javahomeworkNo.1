package datao1;
/*
 * S ����һ������ء��������������������䣬��������˵��
 *  "20 ��ǰ�����ɷ������պ����ҵ� 2 ����
 *  ��������������պ����ҵ� 1.5 ��"��

������� S �������ڵ�������
 */
public class nianlingwenti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		double b;
		//b/a=1.5;
		//(b-20)/(a-20)=2;
		for(int i=1;i<200;i++){
			a=i;
			b=a*1.5;
			if((b-20)/(a-20)==2){
				System.out.println(a);
				//break;
			}
			
		}
	}

}
