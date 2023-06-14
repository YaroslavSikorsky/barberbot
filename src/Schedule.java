import java.util.ArrayList;
import java.util.List;


public class Schedule {
	private List<TimeSlot> timeSlots;

	public Schedule() {
		this.timeSlots = new ArrayList<>();

	}

	public void addTimeSlot(TimeSlot timeSlot) {
		this.timeSlots.add(timeSlot);
	}

	public void removeTimeSlot(TimeSlot timeSlot) {
		this.timeSlots.remove(timeSlot);
	}

	public List<TimeSlot> getTimeSlots() {
		return this.timeSlots;
	}

	public void viewSchedule() {
		System.out.println("Schedule:");
		for (TimeSlot timeSlot : timeSlots) {
			System.out.println(timeSlot);
		}
	}

	public void makeAppointment(TimeSlot timeSlot) {
		for (TimeSlot ts : timeSlots) {
			if (ts.equals(timeSlot)) {
				ts.bookTime();
			}
		}
	}
}
