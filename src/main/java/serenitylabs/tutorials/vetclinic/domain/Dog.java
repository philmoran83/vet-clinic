package serenitylabs.tutorials.vetclinic.domain;

import java.time.LocalDate;

public class Dog {
    private final String name;
    private final LocalDate dateOfBirth;
    private final String breed;
    private final String colour;
    private final String favouriteFood;
    private final String favouriteToy;


    public String getColour() {
        return this.colour;
    }

    public String getFavoriteFood() {
        return this.favouriteFood;
    }

    public String getFavoriteToy() {
        return this.favouriteToy;
    }


    public String getName() {
        return name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getBreed() {
        return breed;
    }

    Dog(String name, String breed, String colour, String favouriteToy, String favouriteFood, LocalDate dateOfBirth) {
        this.name=name;
        this.dateOfBirth=dateOfBirth;
        this.breed = breed;
        this.colour = colour;
        this.favouriteToy =favouriteToy;
        this.favouriteFood =favouriteFood;
    }
}