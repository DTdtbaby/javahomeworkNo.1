/*
 *  ��һ����˵��������¡������Է�����������Ĵ󳼺����������Ҫʲô���꣬��˵�����ڵ� 11 �����̸�� 11 �����ӣ��ڵ� 22 �����̸�� 22 �����ӣ��ڵ� 33 �����̸�� 44 �����ӣ��ڵ� 44 �����̸�� 88 �����ӣ�......��һ���������ǰһ���������ֱ�������������̸񣨹������干�� 6464 �񣩡�

������Ϊ��ֻ����Ҫһ�����Ӷ��ѣ�������Ц��

��ʱ���������޷�׼ȷ���㣬�����������˳Ծ�����ʹȫ���綼��������Ҳ�����ã�

������������׼ȷ�ؼ��㣬������Ҫ���������ӡ�
 */
 package datao1;
//import java.math.BigDecimal;  //�˾���С����ܶ��ʱ����Ҫ
import java.math.BigInteger;
import java.util.Scanner;
// 1:����package
// 2: ��������Main, �����޸�

public class qipanfangmaizi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //�ڴ��������Ĵ���...
        BigInteger a=new BigInteger("2");   //ע��˴�
        BigInteger b=new BigInteger("0");
        for(int i=0;i<64;i++){   //ע��˴�û�еȺ�
        	b=b.add(a.pow(i));		//ע��˴��÷�  ����д��  a.(pow(i));
        	//����
        	//BigInteger c= a.pow(i);
        	//b=b.add(c);
        }
        System.out.println(b);
        scan.close();
    }
}
/*
import java.util.Scanner;
import java.math.BigInteger;
// 1:����package
// 2: ��������Main, �����޸�

public class Main {
    public static void main(String[] args) {
      BigInteger sum=new BigInteger("0");
      BigInteger js=new BigInteger("2");
      for(int i=0;i<64;i++){
        BigInteger val=js.pow(i);
        sum=sum.add(val);
      }
      System.out.println(sum);
    }
}
*/