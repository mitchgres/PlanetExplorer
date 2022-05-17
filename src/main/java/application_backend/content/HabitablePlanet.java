package application_backend.content;

import javafx.scene.image.Image;

public class HabitablePlanet extends Planet {
    /**
     * HabitablePlanet is a class which is a subset of the Planet class and inherits all its attributes buts
     * adds some to represent if there is life on that planet.
     */
    private long humanPopulation; // private member-level var.s representing life on a planet
    private AnimalList animalExamples;

    HabitablePlanet(){
        /**
         * No-Args Constructor that just sets all the values for the object to null or zero so they can be
         * changed later.
         */
        new HabitablePlanet(
                null, null, null,
                null, 0, null,
                null, null, 0, null, 0,
                null
        );
    }

    HabitablePlanet(
            String title, String size, String description,
            String place, long temperature, String orbits,
            Image imageReference, ElementConfiguration elements, long age,
            Atmosphere atmosphereComposition, long humanPopulation, AnimalList animalExamples
    ){
        /**
         * Constructor that takes in all the attributes of a habitable planet and sets it to their member-level
         * equivalent in the object
         */
        setTitle(title);
        setSize(size);
        setDescription(description);
        setPlace(place);
        setTemperature(temperature);
        setOrbits(orbits);
        setImageReference(imageReference);
        setElements(elements);
        setAge(age);
        setAtmosphereComposition(atmosphereComposition);
        setHumanPopulation(humanPopulation);
        setAnimalExamples(animalExamples);
    }

    // Getter for the HumanPopulation
    public long getHumanPopulation(){
        return this.humanPopulation;
    }

    // Setter for HumanPopulation
    public void setHumanPopulation(long humanPopulation){
        this.humanPopulation = humanPopulation;
    }

    // Getter for AnimalList
    public AnimalList getAnimalExamples(){
        return this.animalExamples;
    }

    // Setter for AnimalList
    public void setAnimalExamples(AnimalList animalExamples){
        this.animalExamples = animalExamples;
    }

}
