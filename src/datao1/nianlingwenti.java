package datao1;
/*
 * S 夫人一向很神秘。这会儿有人问起她的年龄，她想了想说：
 *  "20 年前，我丈夫的年龄刚好是我的 2 倍，
 *  而现在他的年龄刚好是我的 1.5 倍"。

你能算出 S 夫人现在的年龄吗？
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
