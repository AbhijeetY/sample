package sample;

public class Ex4 {

	public static void main(String[] args) {

		int flag=0;
		String s1="test";
		String s2="test";
		char ch1[]=s1.toCharArray();
		char ch2[]=s2.toCharArray();
		char temp;
		for(int j=0;j<ch1.length;j++) {				
			temp=ch1[j];
			for(int k=1;k<ch1.length-1;k++)
			{
				ch1[k-1]=ch1[k];
			}
			ch1[ch1.length-1]=temp;		
		}		
		for(int i=0;i<ch1.length;i++) {
			if(ch1[i]==ch2[i])
				flag=1;				
			else {
				flag=0;
				break;
			}
		}		
		
		if(flag==1)
			System.out.println("equlas.....");
		else
			System.out.println("Not equlas.....");
	}
}
