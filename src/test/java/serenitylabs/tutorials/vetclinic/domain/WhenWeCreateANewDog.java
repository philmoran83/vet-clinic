package serenitylabs.tutorials.vetclinic.domain;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class WhenWeCreateANewDog {

    @Test
    public void a_new_dog_should_have_a_name()
    {

        Dog fido = Dog.called("Fido").ofBreed("Labrador").bornOn(THE_FOURTH_OF_JULY);
    }
}
