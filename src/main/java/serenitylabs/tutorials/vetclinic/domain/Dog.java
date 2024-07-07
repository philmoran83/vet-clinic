package serenitylabs.tutorials.vetclinic.domain;

import java.time.LocalDate;

public class Dog {
    String name;
    LocalDate dateOfBirth;

    public static DogBreeder called(String name) {
        return new DogBreeder(name);
    }

    private static class DogBreeder{
        private final String name;
        private String breed;
        private LocalDate dateOfBirth;


        public DogBreeder(String name){
            this.name=name;
        }


        public DogBreeder ofBreed(String breed) {
            this.breed = breed;
            return this;
        }
        
        public DogBreeder bornOn(LocalDate dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
            return this;
        }
    }

    public String getName() {
        return name;
    }

    public Dog(String name) {
        this.name=name;
    }

    public Dog(String name, LocalDate dateOfBirth) {
        this.name=name;
        this.dateOfBirth=dateOfBirth;
    }
}