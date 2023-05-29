import java.util.ArrayList;
import java.util.List;

public class Client {
	private String name;
	private String phoneNumber;
	public List<Appointment> appointments;

	public Client(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.appointments = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public List<Appointment> getAppointments() {
		return appointments;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
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

}
