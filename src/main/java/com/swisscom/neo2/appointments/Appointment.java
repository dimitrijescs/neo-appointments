package com.swisscom.neo2.appointments;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

public class Appointment implements Serializable {

    private final String appointmentId;
    private final AppointmentTimeSlot appointmentTimeSlot;

    public Appointment(final String appointmentId, final AppointmentTimeSlot appointmentTimeSlot) {
        this.appointmentId = appointmentId;
        this.appointmentTimeSlot = appointmentTimeSlot;
    }

    public String getAppointmentId() {
        return appointmentId;
    }

    public AppointmentTimeSlot getAppointmentTimeSlot() {
        return appointmentTimeSlot;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "appointmentId='" + appointmentId + '\'' +
                ", appointmentTimeSlot=" + appointmentTimeSlot +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private String appointmentId;
        private LocalDateTime startDate;
        private LocalDateTime endDate;

        public Builder appointmentId(final String appointmentId) {
            this.appointmentId = appointmentId;
            return this;
        }

        public Appointment build() {
            return new Appointment(appointmentId, new AppointmentTimeSlot(UUID.randomUUID().toString(),startDate,endDate));
        }

        public Builder addStartDate(LocalDateTime startDate) {
            this.startDate = startDate;
            return  this;
        }
        public Builder addEndDate(LocalDateTime endDate) {
            this.endDate = endDate;
            return  this;
        }
    }
}