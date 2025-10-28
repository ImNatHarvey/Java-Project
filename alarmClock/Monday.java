package alarmClock;

import java.util.Scanner;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Monday extends Weekday {
	private String time;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Monday m = new Monday();
		
		System.out.println("============== Alarm Clock ==============");
		System.out.print("Enter the time for the alarm (HH:MM): ");
		String time = scanner.nextLine().trim();

		m.setAlarm(time);
		m.showAlarm();

		scanner.close();

	}

	@Override
	public void setAlarm(String time) {
		this.time = time;
	}

	@Override
	public void showAlarm() {
		LocalTime alarm = LocalTime.parse(time);
		LocalTime now = LocalTime.now();

		if (alarm.isAfter(now)) {
			System.out.println("I'll wake you up at later!");
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
		} else if (alarm.isBefore(now)) {
			System.out.println("Alarm is set for tomorrow!");
		}

	}

}