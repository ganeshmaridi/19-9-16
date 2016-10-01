import java.util.*;
public class No
{
	public static void main(String args[])
	{
		int sum;
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		Number g=new Number();
		int k=g.SumDigits(s);
		System.out.print(k);
	    
	}
}
class Number
{
	public int SumDigits(String s)
	{
		int sum=0;
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			
			if(Character.isDigit(c)) {
				String sb = new String();
				sb = s.substring(i,i+1);
				sum = sum + Integer.parseInt(sb);
				
			}
		}
		return sum;  
	}
}				
