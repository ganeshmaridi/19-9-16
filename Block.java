import java.util.*;
public class Block
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		Rep g=new Rep();
		int k=g.maxBlock(s);
		System.out.print(k);
	    
	}
}
class Rep
{
	
	public int maxBlock(String s) {
		 int maxcount = 0, count = 0;
		 
		 if(s.length() == 0)
			return maxcount;
		else if(s.length() == 1)
			return ++maxcount;
		maxcount++; 
		count++;
		for(int i=1; i < s.length(); i++)
		{
			if(s.charAt(i) == s.charAt(i-1))
			{
				count++;
				if(count > maxcount)
					maxcount = count;
			}
			else
				count = 1;
		}
		
		return maxcount; 
	}
}
