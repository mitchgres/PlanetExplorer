package application_backend.content;

import javafx.scene.image.Image;

public class Planet extends CelestialBody {
    /**
     * Class which inherits all attributes from the CelestialBody class thought adds a specific attribute that
     * is only found in planets.
     */
    private Atmosphere atmosphereComposition; // private member-level attribute of planet

    Planet(){
        /**
         * No-Args Constructor which sets all the values of planet to null and zero to be changed later.
         */
        new Planet(
                null, null, null,
                null, 0, null,
                null, null, 0, null
        );
    }

    Planet(
            String title, String size, String description,
            String place, long temperature, String orbits,
            Image imageReference, ElementConfiguration elements, long age,
            Atmosphere atmosphereComposition
    ){
        /**
         * Constructor which takes all the values in for the Planet and sets them to their member-level counterparts.
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
    }

    // Getter method for atmosphere composition
    public Atmosphere getAtmosphereComposition(){
        return this.atmosphereComposition;
    }

    // Setter method for atmosphere composition
    public void setAtmosphereComposition(Atmosphere atmosphereComposition){
        this.atmosphereComposition = atmosphereComposition;
    }

}
