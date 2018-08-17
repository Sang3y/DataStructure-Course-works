import java.util.Scanner;

public class stringReverse {
public void recurse(String s)
{
	String collect = "";
	int length = s.length();
	for(int i=length-1; i>=0; i--)
	{
		collect +=s.charAt(i);
	}
	System.out.println(collect);
}
public String recursive(String s)
{
	if((s==null)||s.length()<=1)
		return s;
	
	return recursive(s.substring(1))+s.charAt(0);
}
public static void main(String[] args)
{
	Scanner scan = new Scanner(System.in);
	stringReverse obj1 = new stringReverse();
	System.out.print("Enter the string: ");
	String s = scan.nextLine();
	System.out.println(obj1.recursive(s));
}
}
