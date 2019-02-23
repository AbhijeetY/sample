package sample;

import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Ex6 {

	public static void main(String[] args) {

		Instant instant = Calendar.getInstance().toInstant();
		System.out.println(instant);
		System.out.println(instant.isBefore(new Date().toInstant()));
		System.out.println("update the change is done");
		System.out.println("change3 is done");
		
		try {
			throw new Exception("in try");
		}catch(Exception e) {
			try {
				throw new Exception("in catch");
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}finally {
			
		}
	}

}
