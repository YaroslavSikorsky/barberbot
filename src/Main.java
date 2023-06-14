import java.util.Calendar;

public class Main {
	public static void main(String[] args) {

		Salon salon = new Salon("Пушкина, 21");
		Barber jura = new Barber("Jura");
		salon.addBarber(jura);

		Client anton = new Client("Anton", "111-111-1111");
		Appointment appointment = new Appointment("01.01.2024", "10:00", jura, anton);

		jura.addAppointment(appointment);
		anton.addAppointment(appointment);
		System.out.println(jura.toString() + anton.toString() + appointment.toString());

		Schedule schedule = new Schedule();

		Calendar calendar = Calendar.getInstance();
		calendar.set(2021, Calendar.AUGUST, 26, 10, 0, 0);

		Calendar calendar2 = Calendar.getInstance();
		calendar2.set(2021, Calendar.AUGUST, 26, 11, 0, 0);

		Calendar calendar3 = Calendar.getInstance();
		calendar3.set(2021, Calendar.AUGUST, 26, 12, 0, 0);

		schedule.addTimeSlot(new TimeSlot(calendar.getTime(), 60));
		schedule.addTimeSlot(new TimeSlot(calendar2.getTime(), 60));
		schedule.addTimeSlot(new TimeSlot(calendar3.getTime(), 60));

		schedule.viewSchedule();

		TimeSlot selectedSlot = new TimeSlot(calendar3.getTime(), 60);
		schedule.makeAppointment(selectedSlot);

		schedule.viewSchedule();
	}
}
