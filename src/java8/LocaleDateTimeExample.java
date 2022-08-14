package java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class LocaleDateTimeExample {

	public static void main(String[] args) throws InterruptedException {
		localDateExample();
		localTimeExample();
		localDateTimeExample();
	}

	private static void localDateTimeExample() {
		System.out.println("DATE AND TIME:::::::::::::");
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime.toString());
		
		String dateTimeStr = "2022-08-14T16:25:56.818121500";
		LocalDateTime parsedTime = LocalDateTime.parse(dateTimeStr, DateTimeFormatter.ISO_LOCAL_DATE_TIME);
		System.out.println(parsedTime.toString());
		System.out.println(parsedTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH-mm-ss.nn")));
	}

	private static void localTimeExample() throws InterruptedException {
		System.out.println("TIME:::::::::::::::::;");
		LocalTime time = LocalTime.now();
		System.out.println(time.toString());
		
		LocalTime futureTime = time.plus(2, ChronoUnit.HOURS);
		System.out.println(futureTime.isAfter(time));

		LocalTime pastDate = LocalTime.of(10, 15, 30);
		System.out.println(pastDate.isBefore(time));

		String timeStr = "04:15:30.296237384";
		LocalTime parsedTime = LocalTime.parse(timeStr);
		System.out.println(parsedTime.toString());
		System.out.println(parsedTime.format(DateTimeFormatter.ofPattern("hh-mm-ss.nn")));
		
	}

	public static void localDateExample() {
		LocalDate date = LocalDate.now();
		System.out.println(date.toString());

		LocalDate futureDate = date.plus(2, ChronoUnit.YEARS);
		System.out.println(futureDate.isAfter(date));

		LocalDate pastDate = LocalDate.of(2022, 6, 20);
		System.out.println(pastDate.isBefore(date));

		String dateStr = "2022/31/05";
		LocalDate parsedDate = LocalDate.parse(dateStr, DateTimeFormatter.ofPattern("yyyy/dd/MM"));
		System.out.println(parsedDate.toString());
		System.out.println(parsedDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
	}
}
