import java.util.ArrayList;
import java.util.List;

public class Barber {
	private String name;
	private List<Appointment> appointments;

	public Barber(String name) {
		this.name = name;
		this.appointments = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public List<Appointment> getAppointments() {
		return appointments;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAppointments(List<Appointment> appointments) {
		this.appointments = appointments;
	}

	public void addAppointment(Appointment appointment) {
		appointments.add(appointment);
	}

	public void removeAppointment(Appointment appointment) {
		appointments.remove(appointment);
	}

	@Override
	public String toString() {
		return name + " vstrecha s ";

	}
}
