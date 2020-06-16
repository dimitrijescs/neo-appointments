package com.swisscom.neo2.appointments;


import org.easymock.EasyMockSupport;
import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import static org.assertj.core.api.Assertions.assertThat;

public class AppointmentFilterImplTest {

    private final EasyMockSupport mocks = new EasyMockSupport();

    private final AppointmentFilter filter = new AppointmentFilterImpl();

    @Test
    public void should_return_empty_for_empty_input() throws Exception {
        final Collection<Appointment> actual = filter.filter(Collections.emptyList());
        assertThat(actual).isEmpty();
    }

    @Test
    public void should_work_for_two_non_overlapping_appointments() throws Exception {
        final Appointment first = createAppointment("1", LocalDate.now(), LocalTime.of(8, 0), LocalTime.of(12, 0));
        final Appointment second = createAppointment("2", LocalDate.now(), LocalTime.of(13, 0), LocalTime.of(17, 0));

        final Collection<Appointment> actual = filter.filter(Arrays.asList(first, second));
        assertThat(actual).containsExactlyInAnyOrder(first, second);
    }


    public void template_when_using_mocks() {
        mocks.resetAll();

        mocks.replayAll();
        final Object actual = null;

        mocks.verifyAll();
    }

    private Appointment createAppointment(final String id, final LocalDate localDate, final LocalTime start, final LocalTime end) {
        return Appointment.builder()
                .appointmentId("appointmentId" + id)
                .addStartDate(LocalDateTime.of(localDate, start))
                .addEndDate(LocalDateTime.of(localDate, end))
                .build();
    }
}