package com.swisscom.neo2.appointments;

import java.util.Collection;

/**
 * Interview Question
 * <p>
 * Input appointments can last either 4h or 8h, and are always between 8AM and 7PM. Appointment list size is not defined,
 * and appointments can overlap.
 * </p><p>
 * Implement the "filter" function so that either a single 8h appointment, or two 4h appointments (one in the morning
 * and one in the afternoon) are returned on a daily basis.
 * </p><p>
 * Definition of morning: appointment.getServiceTimeSlot().getAppointmentStartDate() before 12h
 * </p><p>
 * Definition of afternoon: appointment.getServiceTimeSlot().getAppointmentEndDate() after 15h
 * </p>
 */
public interface AppointmentFilter {

    Collection<Appointment> filter(final Collection<Appointment> appointments);
}