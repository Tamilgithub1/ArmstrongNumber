import java.util.*;
public class wifi{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int l=String.valueOf(n).length();
		int sum=0;
		for(int i=0;i<l;i++){
			int r=Integer.parseInt(String.valueOf(n).substring(i, i+1));
			sum+=(int)Math.pow(r,l);}
		if(sum==n)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
