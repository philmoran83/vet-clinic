package serenitylabs.tutorials.vetclinic.domain;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;


public class WhenWeCreateANewDog {

    @Test
    public void a_new_dog_should_have_a_name_and_a_breed_and_a_colour() throws Exception {
        Dog fido = Dog.called("Fido").ofBreed("Labrador").andOfColour("Black");

        assertThat(fido.getName(),equalTo("Fido"));
        assertThat(fido.getBreed(),equalTo("Labrador"));
        assertThat(fido.getColour(),hasItem("Black"));

    }

    @Test
    public void a_new_dog_should_have_a_description() throws Exception {
        Dog fido = Dog.called("Fido").ofBreed("Labrador").andOfColour("Black");
        String description = fido.toString();

        assertThat(description, startsWith("Fido"));
        assertThat(description, endsWith("labrador"));
        assertThat(description, containsString("Black"));
    }

    @Test
    public void a_dog_can_have_several_colours() throws Exception {
        Dog fido = Dog.called("Fido").ofBreed("Labrador").andOfColour("Black","White");
        assertThat(fido.getColour(), hasItem("Black"));
        assertThat(fido.getColour(), hasItem("White"));
    }

}
