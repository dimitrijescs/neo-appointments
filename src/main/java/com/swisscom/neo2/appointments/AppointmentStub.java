package com.swisscom.neo2.appointments;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class AppointmentStub {

    private static Appointment createAppointment(final LocalDate fromDate, final int plusDays, final int startHour, final int endHour) {
        final LocalDateTime startDate = LocalDateTime.of(fromDate, LocalTime.of(startHour, 0)).plusDays(plusDays);
        final LocalDateTime endDate = LocalDateTime.of(fromDate, LocalTime.of(endHour, 0)).plusDays(plusDays);
        return Appointment.builder().appointmentId(UUID.randomUUID().toString())
                .addStartDate( startDate)
                .addEndDate(endDate)
                .build();
    }

    public static List<Appointment> getUnfilteredAppointments(final LocalDate fromDate) {
        List<Appointment> appointments = new ArrayList<>();
        appointments.add(createAppointment(fromDate, 1, 8, 12)); // morning
        appointments.add(createAppointment(fromDate, 1, 12, 16)); // afternoon
        appointments.add(createAppointment(fromDate, 1, 9, 13)); // morning
        appointments.add(createAppointment(fromDate, 1, 9, 17)); // fullday
        appointments.add(createAppointment(fromDate, 1, 10, 18)); // fullday
        appointments.add(createAppointment(fromDate, 1, 15, 19)); // afternoon
        appointments.add(createAppointment(fromDate, 3, 7, 11)); // morning
        appointments.add(createAppointment(fromDate, 4, 8, 12)); // morning
        appointments.add(createAppointment(fromDate, 4, 9, 13)); // morning
        appointments.add(createAppointment(fromDate, 4, 14, 18)); // afternoon
        appointments.add(createAppointment(fromDate, 5, 14, 18)); // afternoon
        appointments.add(createAppointment(fromDate, 5, 9, 17)); // fullday
        return appointments;
    }

    public static List<Appointment> getFilteredAppointments(final LocalDate fromDate) {
        List<Appointment> appointments = new ArrayList<>();
        appointments.add(createAppointment(fromDate, 1, 9, 13)); // morning
        appointments.add(createAppointment(fromDate, 1, 15, 19)); // afternoon
        appointments.add(createAppointment(fromDate, 3, 7, 11)); // morning
        appointments.add(createAppointment(fromDate, 4, 14, 18)); // afternoon
        appointments.add(createAppointment(fromDate, 5, 9, 17)); // fullday
        return appointments;
    }
}