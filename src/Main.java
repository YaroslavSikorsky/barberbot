public class Main {
	public static void main(String[] args) {

		Salon salon = new Salon("Пушкина, 21");
		Barber jura = new Barber("Юра");
		salon.addBarber(jura);

		Client anton = new Client("Антон", "111-111-1111");
		Appointment appointment = new Appointment("01.01.2024", "10:00", jura, anton);

		jura.addAppointment(appointment);
		anton.addAppointment(appointment);
//
		System.out.println(jura.getName() + " назначена встреча " + anton.getName() + " c " + appointment.getDate() + " " + appointment.getTime() + ".");


	}
}
