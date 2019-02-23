package sample;

import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Ex6 {

	public static void main(String[] args) {

		System.out.println(new Date());
		System.out.println(new Date().getTime());
		Instant instant = Calendar.getInstance().toInstant();
		System.out.println(instant);
		System.out.println(instant.isBefore(new Date().toInstant()));
		System.out.println("change is done");
		System.out.println("change3 is done");
	}

}
