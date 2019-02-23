package sample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Ex3 {

	private static Map<String,List<String>> map=new HashMap<String,List<String>>();
	
	static {
		List<String> pune=new ArrayList<String>();
		pune.add("INFOSYS");
		pune.add("WIPRO");
		pune.add("AMDOCS");
		
		List<String> mumbai=new ArrayList<String>();
		mumbai.add("TCS");
		mumbai.add("BMW");
		mumbai.add("PRI");
		
		if(!map.containsKey("pune"))
		{
			map.put("pune", pune);
		}
		
		if(!map.containsKey("mumbai"))
		{
			map.put("mumbai", mumbai);
		}
	}
	public static void getByCity(String city)
	{
		Set<Entry<String,List<String>>> ct=map.entrySet();
		
		for(Entry<String, List<String>> entry:ct)
		{
			if(city.equalsIgnoreCase(entry.getKey())) 
			{
				System.out.println(entry.getValue());
			}
		}
	}
	
	public static void getByCompany(String company)
	{
		
	}
	
	public static void main(String[] args) {


		System.out.println("enter city");
		Scanner s= new Scanner(System.in);
		String city=s.nextLine();
		getByCity(city);
		s.close();
		
	}

}
