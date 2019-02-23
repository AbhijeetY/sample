package sample;

import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Ex6 {

	public static void main(String[] args) {

		Instant instant = Calendar.getInstance().toInstant();
		System.out.println(instant);
		System.out.println(instant.isBefore(new Date().toInstant()));
		System.out.println("change is done");
	}

}
