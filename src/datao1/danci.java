package datao1;

import java.util.Scanner;

import javax.swing.text.AttributeSet.CharacterAttribute;


/*
 * �������С��������һ�����ʺ󣬰������ҵ�����������ĸ���� ����ĸ���ֵĴ�����

��������
����һ�а���һ�����ʣ�����ֻ��СдӢ����ĸ��ɡ�

�������е���������������ĵ��ʳ��Ȳ����� 1000��

�������
������У���һ�а���һ��Ӣ����ĸ����ʾ�����г��ֵ�������ĸ���� ��������ж����ĸ���ֵĴ�����ȣ�����ֵ�����С���Ǹ���

�ڶ��а���һ����������ʾ���ֵ������Ǹ���ĸ�ڵ����г��ֵĴ�����
 */

//�����Ҫ��string����������
public class danci {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	//��һ��,����һ�������������ַ���;
	String str=scan.next();
	//�ڶ���,����һ���������洢26��Ӣ����ĸ
	int [] arr=new int[26];
	//������:���������ַ���,�����ÿ����ĸ���ڵĴ����Ƕ���
	for(int i=0;i<str.length();i++){
		arr[str.charAt(i)-'a']++;
	}
	//���Ĳ�:�ڵõ�һ������������֮��,���䰴������Ԫ�صĴ�С˳�����ѡ��.ѡ������Ԫ�����Ľ������
	int index=0;
	for(int i=0;i<26;i++){
		if(arr[index]<arr[i]){
		index=i;
		}
	}
	//System.out.println((char)(arr[index]+'a'));
	System.out.println((char)(index+'a'));
	System.out.println(arr[index]);
}
}

/*
import java.util.Scanner;
//1:����package
//2: ��������Main, �����޸�

public class Main {
 public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     String str = scan.next();
     int[]arr = new int[26];
     for(int i = 0;i<str.length();i++){
       arr[str.charAt(i)-'a']++;
     }
     int index = 0;
     for(int i = 0;i<26;i++){
       if(arr[i]>arr[index]){
         index = i;
       }
     }
     System.out.println((char)(index+'a'));
     System.out.println(arr[index]);
     scan.close();
 }
}
*/