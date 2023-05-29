public class Appointment {
	private String date;
	private String time;
	private Barber barber;
	private Client client;

	public Appointment(String date, String time, Barber barber, Client client) {
		this.date = date;
		this.time = time;
		this.barber = barber;
		this.client = client;
	}

	public String getDate() {
		return date;
	}

	public String getTime() {
		return time;
	}

	public Barber getBarber() {
		return barber;
	}

	public Client getClient() {
		return client;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public void setBarber(Barber barber) {
		this.barber = barber;
	}

	public void setClient(Client client) {
		this.client = client;
	}

}
