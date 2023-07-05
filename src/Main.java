import java.time.LocalDateTime;
import java.time.Month;


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
		LocalDateTime localDateTime1 = LocalDateTime.of(2023, Month.JULY, 15, 12, 00, 00);
		LocalDateTime localDateTime2 = LocalDateTime.of(2023, Month.JULY, 15, 13, 00, 00);
		LocalDateTime localDateTime3 = LocalDateTime.of(2023, Month.JULY, 15, 14, 00, 00);
		schedule.addTimeSlot(new TimeSlot(localDateTime1, 60));
		schedule.addTimeSlot(new TimeSlot(localDateTime2, 60));
		schedule.addTimeSlot(new TimeSlot(localDateTime3, 60));
		schedule.viewSchedule();

		TimeSlot selectedSlot = new TimeSlot(localDateTime1, 60);
		schedule.makeAppointment(selectedSlot);
		schedule.viewSchedule();

		schedule.makeAppointment(selectedSlot);

	}


}
