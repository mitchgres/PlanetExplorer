package application_backend.content;

import javafx.scene.image.Image;

public class SolarSystem extends CelestialBody {
    /**
     * Inherits all attributes from the Celestial Body though adds some specific to Solar Systems
     */
    private int numberOfPlanets; // private member-level var.s representing attributes of a solar system
    private String mainStar;

    SolarSystem(){
        new SolarSystem(
                /**
                 * No-Args Constructor of the Solar System which sets all values to null or zero to be changed
                 * later.
                 */
                null, null, null,
                null, null,
                null, null, 0, 0, null
        );
    }

    SolarSystem(
            String title, String size, String description,
            String place, String orbits,
            Image imageReference, ElementConfiguration elements, long age,
            int numberOfPlanets, String mainStar
    ){
        /**
         * Constructor which takes all the attributes for the Solar System and then sets them to their
         * member-level counterparts.
         */
        setTitle(title);
        setSize(size);
        setDescription(description);
        setPlace(place);
        setOrbits(orbits);
        setImageReference(imageReference);
        setElements(elements);
        setAge(age);
        setNumberOfPlanets(numberOfPlanets);
        setMainStar(mainStar);
    }

    // Getter for numberOfPlanets
    public int getNumberOfPlanets(){
        return this.numberOfPlanets;
    }

    // Setter for numberOfPlanets
    public void setNumberOfPlanets(int numberOfPlanets){
        this.numberOfPlanets = numberOfPlanets;
    }

    // Getter for Main Star
    public String getMainStar(){
        return this.mainStar;
    }

    // Setter for Main Star
    public void setMainStar(String mainStar){
        this.mainStar = mainStar;
    }

}
