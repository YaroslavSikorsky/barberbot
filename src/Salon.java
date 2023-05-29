import java.util.ArrayList;
import java.util.List;

public class Salon {
	private String address;
	private List<Barber> barbers;
	private List<Appointment> appointments;

	public Salon(String address) {
		this.address = address;
		this.barbers = new ArrayList<>();
		this.appointments = new ArrayList<>();
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setBarbers(List<Barber> barbers) {
		this.barbers = barbers;
	}

	public void setAppointments(List<Appointment> appointments) {
		this.appointments = appointments;
	}

	public String getAddress() {
		return address;
	}

	public List<Barber> getBarbers() {
		return barbers;
	}

	public List<Appointment> getAppointments() {
		return appointments;
	}

	public void addBarber(Barber barber) {
		barbers.add(barber);
	}

	public void removeBarber(Barber barber) {
		barbers.remove(barber);
	}
}
