package application_backend.content;

import javafx.scene.image.Image;

public class Sun extends CelestialBody {
    /**
     * Extends and inherits all attributes from the Celestial Body but adds attributes specific to the Sun
     */
    private int planetsOrbiting; // private member-level variables for attributes of Sun
    private String energyGivenOff;

    public Sun(){
        /**
         * No-Args Constructor that sets all values to null to be edited later.
         */
        new Sun(
                null, null, null,
                null, 0, null,
                null, null,
                0, 0, null
        );
    }

    public Sun(
            String title, String size, String description,
            String place, long temperature, String orbits,
            Image imageReference, ElementConfiguration elements,
            long age, int planetsOrbiting, String energyGivenOff
    ) {
        /**
         * Constructor which takes all attributes from the Sun and sets them to their member-level counterparts.
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
        setPlanetsOrbiting(planetsOrbiting);
        setEnergyGivenOff(energyGivenOff);
    }

    // Getter for planetOrbiting
    public int getPlanetsOrbiting(){
        return this.planetsOrbiting;
    }

    // Setter for planetsOrbiting
    public void setPlanetsOrbiting(int planetsOrbiting){
        this.planetsOrbiting = planetsOrbiting;
    }

    // Getter for energyGivenOff
    public String getEnergyGivenOff(){
        return this.energyGivenOff;
    }

    // Setter for energyGivenOff
    public void setEnergyGivenOff(String energyGivenOff){
        this.energyGivenOff = energyGivenOff;
    }


}
