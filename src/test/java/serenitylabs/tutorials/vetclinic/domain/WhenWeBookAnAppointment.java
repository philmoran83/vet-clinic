package serenitylabs.tutorials.vetclinic.domain;

import org.junit.Assert;
import org.junit.Test;
import java.time.LocalDateTime;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

public class WhenWeBookAnAppointment {

    private static final LocalDateTime TODAY_AT_2_PM = LocalDateTime.now().withHour(2).withMinute(0);

    @Test
    public void an_appointment_has_a_patient_name_an_owner_and_a_date() {
        Appointment appointment = Appointment.forPetCalled("Fido").ownedBy("Fred").at(TODAY_AT_2_PM);

        assertThat(appointment.getPetName(), equalTo("Fido"));
        assertThat(appointment.getOwner(), equalTo("Fred"));
        assertThat(appointment.getAppointmentTime(), equalTo(TODAY_AT_2_PM));

    }

    @Test
    public void an_appointment_can_have_an_optional_reason() {
        Appointment appointment = Appointment.forPetCalled("Fido").ownedBy("Fred").because("He is sick").at(TODAY_AT_2_PM);

        assertThat(appointment.getReason().isPresent(),equalTo(true));
        assertThat(appointment.getReason().get(), equalTo("He is sick"));


    }

    @Test
    public void compare_an_appointment_to_a_specified_time() {

        LocalDateTime ONE_MIN_BEFORE = LocalDateTime.now().withHour(1).withMinute(59);
        LocalDateTime ONE_MIN_AFTER = LocalDateTime.now().withHour(2).withMinute(1);
        LocalDateTime EXACT_SAME_TIME = TODAY_AT_2_PM;

        Appointment appointment = Appointment.forPetCalled("Fido").ownedBy("Fred").because("He is sick").at(TODAY_AT_2_PM);

        assertThat(appointment.isBefore(ONE_MIN_BEFORE), equalTo(false));
        assertThat(appointment.isBefore(ONE_MIN_AFTER), equalTo(true));
        assertThat(appointment.isBefore(EXACT_SAME_TIME), equalTo(false));
        assertThat(appointment.isAfter(ONE_MIN_BEFORE), equalTo(true));
        assertThat(appointment.isAfter(ONE_MIN_AFTER), equalTo(false));
        assertThat(appointment.isAfter(EXACT_SAME_TIME), equalTo(false));




    }


}
