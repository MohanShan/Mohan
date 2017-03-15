import java.util.Scanner;

public class Revstr {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.next();
		StringBuffer buff=new StringBuffer(str);
		buff.reverse();
		System.out.println(buff);
		String s1=buff.toString();
		
	}

}
