import java.util.Scanner;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class Main {
    public static void main(String[] args) {
    	//System.out.println("输入");
        Scanner scan = new Scanner(System.in);
        String str = scan.next();            // 定义一个str字符串
        int[]arr = new int[26];               //定义一个arr数组只有26个字符
        for(int i = 0;i<str.length();i++){     //遍历整个长度,确保每个字符串都遍历一遍
          arr[str.charAt(i)-'a']++;             //将获得的字母ascall码分别加一计数
        }
        int index = 0;                            //制造索引
        for(int i = 0;i<26;i++){                  //26个字母进行遍历
          if(arr[i]>arr[index]){                  //确保元素中数组字母所包含的数字个数最大的输出
            index = i;
          }
        }
        System.out.println((char)(index+'a'));   //输出字符
        System.out.println(arr[index]);    //输出字符的个数
        scan.close();
    }
}