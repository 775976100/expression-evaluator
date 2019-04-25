package xxx;

public class Dfs4 {
//反转字符串
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println(reverse("abcd",3));
	
	}
	static String reverse(String src,int end) {
		if(end==0) {
			return ""+src.charAt(0);
	}
	return src.charAt(end)+reverse(src,end-1);

}
}
