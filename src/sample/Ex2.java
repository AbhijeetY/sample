package sample;


import java.util.ArrayList;
import java.util.List;

public class Ex2 {

	public static void main(String[] args) {

		int a[]= {11,3,5,4,5,2,5,6,5,1};
		int len=a.length;
		int b[] = new int[len];
		List<Integer> al=new ArrayList<Integer>();
		
		
		
		for(int i=0,c=0;i<len;i++)
		{
			if(a[i]==5)
			{
				b[c]=a[i];
				c++;
			}
			else
				al.add(a[i]);
		}		
		for(int i=al.size(),c=0;i<len;i++)
		{
			al.add(b[c]);
			c++;
		}
		
		System.out.println(al);
	}

}
