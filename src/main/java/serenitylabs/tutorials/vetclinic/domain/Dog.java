package serenitylabs.tutorials.vetclinic.domain;

import java.time.LocalDate;

public class Dog {
    private final String name;
    private final LocalDate dateOfBirth;
    private final String breed;
    private final String colour;
    private final String favouriteFood;
    private final String favouriteToy;


    public static WithBreed called(String name) {
        return new DogBreeder(name);
    }

    public String getColour() {
        return this.colour;
    }

    public String getFavoriteFood() {
        return this.favouriteFood;
    }

    public String getFavoriteToy() {
        return this.favouriteToy;
    }

    interface WithBreed {
        WithColour ofBreed(String breed);
    }
    interface WithColour {
        DogBreeder ofColour(String colour);
    }


    public static class DogBreeder implements WithBreed, WithColour{
        private final String name;
        public String breed;
        private String colour;
        private String favouriteToy;
        private String favouriteFood;


        public DogBreeder(String name){
            this.name=name;
        }

        public DogBreeder ofBreed(String breed) {
            this.breed =breed;
            return this;
             }

        public Dog bornOn(LocalDate dateOfBirth) {
            return new Dog(name, breed,colour, favouriteToy, favouriteFood,dateOfBirth);
        }

        public DogBreeder ofColour(String colour) {
            this.colour=colour;
            return this;
        }

        public DogBreeder withFavouriteToy(String favouriteToy) {
            this.favouriteToy=favouriteToy;
            return this;
        }

        public DogBreeder withFavouriteFood(String favouriteFood) {
            this.favouriteFood=favouriteFood;
            return this;
        }
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

    private Dog(String name,String breed,String colour, String favouriteToy, String favouriteFood, LocalDate dateOfBirth) {
        this.name=name;
        this.dateOfBirth=dateOfBirth;
        this.breed = breed;
        this.colour = colour;
        this.favouriteToy =favouriteToy;
        this.favouriteFood =favouriteFood;
    }
}