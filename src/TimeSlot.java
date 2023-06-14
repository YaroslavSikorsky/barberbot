import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeSlot {
	private Date date;
	private int time;
	private boolean booked;

	public TimeSlot(Date date, int time) {
		this.date = date;
		this.time = time;
		this.booked = false;

	}

	public Date getDate() {
		return date;
	}

	public int getTime() {
		return time;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public boolean isBooked() {
		return booked;
	}

	public void bookTime() {
		this.booked = true;
	}

	@Override
	public String toString() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("E dd.MM.yyyy hh:mm a");
		String dateStr = dateFormat.format(date);
		return dateStr + " - " + time + " minutes " + (booked ? "BOOKED" : "AVAILABLE");
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) return false;
		if (!(obj instanceof TimeSlot)) return false;
		TimeSlot ts = (TimeSlot) obj;
		if (this.date.equals(ts.date) && this.time == ts.time) {
			return true;
		}
		return false;
	}
}
