package serenitylabs.tutorials.vetclinic.domain;

import java.time.LocalDate;

public class DogBreeder implements WithBreed, WithColour{
        private String name;
        public String breed;
        private String colour;
        private String favouriteToy;
        private String favouriteFood;


    public static DogBreeder aDog() {
            return new DogBreeder();
    }

    public static DogBreeder aLargeDog() {
        return new DogBreeder().ofBreed("Labrador");
    }

    public static DogBreeder aSmallDog() {
        return new DogBreeder().ofBreed("Poodle");
    }

    public static DogBreeder aGuardDog() {
        return new DogBreeder().ofBreed("Rottweiler");
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

        public DogBreeder called(String name) {
            this.name=name;
            return this;
        }

    }