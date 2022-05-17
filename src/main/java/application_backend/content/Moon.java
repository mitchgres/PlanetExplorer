package application_backend.content;

import javafx.scene.image.Image;

public class Moon extends CelestialBody {
    /**
     * Moon class is a subset of a Celestial body but adds some attributes to better repersent the unique attributes
     * of a moon.
     */
    private String closestPlanet; // private member-level var.s that are unique to moons
    private boolean hasBeenLandedOn;

    public Moon(){
        /**
         * No-Args Constructor sets all the values to null or zero, so they can be changed later.
         */
        new Moon(
                null, null,
                null, null, null,
                null, null, 0,
                null, false
        );
    }

    public Moon(
            String title, String size, String description,
            String place, String orbits,
            Image imageReference, ElementConfiguration elements, long age,
            String closestPlanet, boolean hasBeenLandedOn
                ){
        /**
         * Constructor that takes all the arguments for a Moon and sets them to their member-level versions.
         */
        setTitle(title);
        setSize(size);
        setDescription(description);
        setPlace(place);
        setOrbits(orbits);
        setImageReference(imageReference);
        setElements(elements);
        setAge(age);
        setClosestPlanet(closestPlanet);
        setHasBeenLandedOn(hasBeenLandedOn);
    }

    // Getter for ClosetPlanet
    public String getClosestPlanet(){
        return this.closestPlanet;
    }

    // Setter for the ClosestPlanet
    public void setClosestPlanet(String closestPlanet){
        this.closestPlanet = closestPlanet;
    }

    // Getter for if the moon has been landed on, as we know one was.
    public boolean getHasBeenLandedOn(){
        return this.hasBeenLandedOn;
    }

    // Setter for if the moon has been landed on as someone from the 1950s may need
    public void setHasBeenLandedOn(boolean hasBeenLandedOn){
        this.hasBeenLandedOn = hasBeenLandedOn;
    }

}
