package com.swisscom.neo2.appointments;

import java.io.Serializable;
import java.time.LocalDateTime;

public class AppointmentTimeSlot implements Serializable {

    private final String appointmentTimeSlotId;
    private final LocalDateTime appointmentStartDate;
    private final LocalDateTime appointmentEndDate;

    public AppointmentTimeSlot(final String appointmentTimeSlotId, final LocalDateTime appointmentStartDate, final LocalDateTime appointmentEndDate) {
        this.appointmentTimeSlotId = appointmentTimeSlotId;
        this.appointmentStartDate = appointmentStartDate;
        this.appointmentEndDate = appointmentEndDate;
    }

    public String getAppointmentTimeSlotId() {
        return appointmentTimeSlotId;
    }

    public LocalDateTime getAppointmentStartDate() {
        return appointmentStartDate;
    }

    public LocalDateTime getAppointmentEndDate() {
        return appointmentEndDate;
    }

    @Override
    public String toString() {
        return "AppointmentTimeSlot{" +
                "appointmentTimeSlotId='" + appointmentTimeSlotId + '\'' +
                ", appointmentStartDate=" + appointmentStartDate +
                ", appointmentEndDate=" + appointmentEndDate +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private String appointmentTimeSlotId;
        private LocalDateTime appointmentStartDate;
        private LocalDateTime appointmentEndDate;

        public Builder appointmentTimeSlotId(final String appointmentTimeSlotId) {
            this.appointmentTimeSlotId = appointmentTimeSlotId;
            return this;
        }

        public Builder appointmentStartDate(final LocalDateTime appointmentStartDate) {
            this.appointmentStartDate = appointmentStartDate;
            return this;
        }

        public Builder appointmentEndDate(final LocalDateTime appointmentEndDate) {
            this.appointmentEndDate = appointmentEndDate;
            return this;
        }

        public AppointmentTimeSlot build() {
            return new AppointmentTimeSlot(
                    appointmentTimeSlotId,
                    appointmentStartDate,
                    appointmentEndDate
            );
        }

    }
}