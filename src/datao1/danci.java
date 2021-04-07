package datao1;

import java.util.Scanner;

import javax.swing.text.AttributeSet.CharacterAttribute;


/*
 * 请你帮助小蓝，给了一个单词后，帮助他找到出现最多的字母和这 个字母出现的次数。

输入描述
输入一行包含一个单词，单词只由小写英文字母组成。

对于所有的评测用例，输入的单词长度不超过 1000。

输出描述
输出两行，第一行包含一个英文字母，表示单词中出现得最多的字母是哪 个。如果有多个字母出现的次数相等，输出字典序最小的那个。

第二行包含一个整数，表示出现得最多的那个字母在单词中出现的次数。
 */

//输入的要用string类型来接收
public class danci {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	//第一步,定义一个变量来接收字符串;
	String str=scan.next();
	//第二部,定义一个数组来存储26个英文字母
	int [] arr=new int[26];
	//第三步:遍历整个字符串,来获得每个字母所在的次数是多少
	for(int i=0;i<str.length();i++){
		arr[str.charAt(i)-'a']++;
	}
	//第四步:在得到一个完整的数组之后,对其按照数组元素的大小顺序进行选择.选择数组元素最大的进行输出
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
//1:无需package
//2: 类名必须Main, 不可修改

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