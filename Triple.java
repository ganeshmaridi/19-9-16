import java.util.*;
public class Triple
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		Rep g=new Rep();
		int k=g.countTriple(s);
		System.out.print(k);
	    
	}
}
class Rep
{
	
	public int countTriple(String s) {
		 int count = 0 ;
		
		for(int i=2; i < s.length(); i++)
		{
			if((s.charAt(i) == s.charAt(i-1))&&(s.charAt(i) == s.charAt(i-2)))
			{
				count++;
			}
		
		}
		
		return count; 
	}
}
