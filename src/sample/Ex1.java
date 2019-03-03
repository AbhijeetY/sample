package sample;


public class Ex1{

	public static void main(String[] args) throws Exception {


		String s1="hello world java";
		String s[]=s1.split(" ");
		int x=s.length;
		
		for(int i=x-1;i>=0;i--)
		{
			char ch[]=s[i].toCharArray();
			int x1=ch.length;
			for(int j=x1-1;j>=0;j--)
			{
				System.out.print(ch[j]);
				
			}System.out.print(" ");
		}
		System.out.println(x);
	}
	public static void sample()
	{
		System.out.println("git sample methood");
	}
}
