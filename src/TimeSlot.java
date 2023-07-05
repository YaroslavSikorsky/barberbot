import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class TimeSlot {
	private LocalDateTime localDateTime;
	private int time;
	private boolean booked;

	public TimeSlot(LocalDateTime localDateTime, int time) {
		this.localDateTime = localDateTime;
		this.time = time;
		this.booked = false;

	}

	public LocalDateTime getDate() {
		return localDateTime;
	}

	public int getTime() {
		return time;
	}

	public void setDate(LocalDateTime localDateTime) {
		this.localDateTime = localDateTime;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public boolean isBooked() {
		return booked;
	}

	public void bookTime() {
		if (this.booked == true) {
			System.out.println("This time is busy");
		} else {
			this.booked = true;
			System.out.println("You booked a time");
		}
	}

	@Override
	public String toString() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM.dd.yy HH:mm");
		String dateStr = dtf.format(localDateTime);
		return dateStr + " - " + time + " minutes " + (booked ? "BOOKED" : "AVAILABLE");
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) return false;
		if (!(obj instanceof TimeSlot)) return false;
		TimeSlot ts = (TimeSlot) obj;
		if (this.localDateTime.equals(ts.localDateTime) && this.time == ts.time) {
			return true;
		}
		return false;
	}
}
