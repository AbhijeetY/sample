package sample;


public class Ex5{

	public static void main(String[] args) {

		String str="Abhijeet";
		char a[]=str.toCharArray();
		//Arrays.sort(a);
		char temp;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
		}	
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]);
		}
	}

}
