import java.util.Scanner;
// 1:����package
// 2: ��������Main, �����޸�

public class Main {
    public static void main(String[] args) {
    	//System.out.println("����");
        Scanner scan = new Scanner(System.in);
        String str = scan.next();            // ����һ��str�ַ���
        int[]arr = new int[26];               //����һ��arr����ֻ��26���ַ�
        for(int i = 0;i<str.length();i++){     //������������,ȷ��ÿ���ַ���������һ��
          arr[str.charAt(i)-'a']++;             //����õ���ĸascall��ֱ��һ����
        }
        int index = 0;                            //��������
        for(int i = 0;i<26;i++){                  //26����ĸ���б���
          if(arr[i]>arr[index]){                  //ȷ��Ԫ����������ĸ�����������ָ����������
            index = i;
          }
        }
        System.out.println((char)(index+'a'));   //����ַ�
        System.out.println(arr[index]);    //����ַ��ĸ���
        scan.close();
    }
}