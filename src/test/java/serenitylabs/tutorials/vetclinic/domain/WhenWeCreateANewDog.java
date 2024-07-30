package serenitylabs.tutorials.vetclinic.domain;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class WhenWeCreateANewDog {
    private final static LocalDate THE_FOURTH_OF_JULY = LocalDate.of(2016,07,04);
    @Test
    public void a_new_dog_should_have_a_name()
    {
        Dog fido = DogBreeder.aDog()
                .called("Fido")
                .ofBreed("Labrador")
                .ofColour("black")
                .bornOn(THE_FOURTH_OF_JULY);

        Assert.assertEquals("Fido",fido.getName());
        Assert.assertEquals("Labrador", fido.getBreed());
        Assert.assertEquals("black", fido.getColour());
        Assert.assertEquals(LocalDate.of(2016,07,04), fido.getDateOfBirth());
        Assert.assertNull(fido.getFavoriteToy());
        Assert.assertNull(fido.getFavoriteFood());
    }
    @Test
    public void a_dog_can_have_an_optional_favourite_food()
    {
        Dog fido = DogBreeder.aDog()
                .called("Fido")
                .ofBreed("Labrador")
                .ofColour("black")
                .withFavouriteFood("pizza")
                .bornOn(THE_FOURTH_OF_JULY);

        Assert.assertEquals("Fido",fido.getName());
        Assert.assertEquals("Labrador", fido.getBreed());
        Assert.assertEquals(LocalDate.of(2016,07,04), fido.getDateOfBirth());
        Assert.assertEquals("black", fido.getColour());
        Assert.assertEquals("pizza", fido.getFavoriteFood());
        Assert.assertNull(fido.getFavoriteToy());
    }

    @Test
    public void a_dog_can_have_an_optional_favourite_toy()
    {
        Dog fido = DogBreeder.aDog()
                .called("Fido")
                .ofBreed("Labrador")
                .ofColour("black")
                .withFavouriteToy("teddy")
                .bornOn(THE_FOURTH_OF_JULY);

        Assert.assertEquals("Fido",fido.getName());
        Assert.assertEquals("Labrador", fido.getBreed());
        Assert.assertEquals(LocalDate.of(2016,07,04), fido.getDateOfBirth());
        Assert.assertEquals("black", fido.getColour());
        Assert.assertEquals("teddy", fido.getFavoriteToy());
        Assert.assertNull(fido.getFavoriteFood());
    }

    @Test
    public void a_small_dog_should_have_a_name()
    {
        Dog spot = DogBreeder.aSmallDog()
                .called("Spot")
                .ofColour("black")
                .bornOn(THE_FOURTH_OF_JULY);

        Assert.assertEquals("Spot",spot.getName());
        Assert.assertEquals("Poodle", spot.getBreed());
        Assert.assertEquals("black", spot.getColour());
        Assert.assertEquals(LocalDate.of(2016,07,04), spot.getDateOfBirth());
        Assert.assertNull(spot.getFavoriteToy());
        Assert.assertNull(spot.getFavoriteFood());
    }

    @Test
    public void a_large_dog_should_have_a_name()
    {
        Dog rex = DogBreeder.aLargeDog()
                .called("Rex")
                .ofColour("black")
                .bornOn(THE_FOURTH_OF_JULY);

        Assert.assertEquals("Rex",rex.getName());
        Assert.assertEquals("Labrador", rex.getBreed());
        Assert.assertEquals("black", rex.getColour());
        Assert.assertEquals(LocalDate.of(2016,07,04), rex.getDateOfBirth());
        Assert.assertNull(rex.getFavoriteToy());
        Assert.assertNull(rex.getFavoriteFood());
    }

    @Test
    public void a_guard_dog_should_have_a_name()
    {
        Dog zeta = DogBreeder.aGuardDog()
                .called("Zeta")
                .ofColour("black")
                .bornOn(THE_FOURTH_OF_JULY);

        Assert.assertEquals("Zeta",zeta.getName());
        Assert.assertEquals("Rottweiler", zeta.getBreed());
        Assert.assertEquals("black", zeta.getColour());
        Assert.assertEquals(LocalDate.of(2016,07,04), zeta.getDateOfBirth());
        Assert.assertNull(zeta.getFavoriteToy());
        Assert.assertNull(zeta.getFavoriteFood());
    }
}
