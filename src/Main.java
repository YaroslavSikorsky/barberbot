public class Main {
	public static void main(String[] args) {

		Salon salon = new Salon("Пушкина, 21");
		Barber jura = new Barber("Jura");
		salon.addBarber(jura);

		Client anton = new Client("Anton", "111-111-1111");
		Appointment appointment = new Appointment("01.01.2024", "10:00", jura, anton);

		jura.addAppointment(appointment);
		anton.addAppointment(appointment);

		System.out.println(jura.getName() + " vstre4a c " + anton.getName() + " na " + appointment.getDate() + " " + appointment.getTime() + ".");


	}
}
