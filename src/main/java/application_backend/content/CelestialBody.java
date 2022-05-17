package application_backend.content;

import javafx.scene.image.Image;

public abstract class CelestialBody {
    /**
     * Abstract class with a protected constructor, it is representative of all bodies of matter in space that
     * can be identified. It has attributes that apply to all these things that have matter.
     */
    private String title; // private var.s that represent the attributes of all things with matter
    private String size;
    private String description;
    private String place;
    private long temperature;
    private String orbits;
    private Image imageReference;
    private ElementConfiguration elements;
    private long age;

    protected CelestialBody(){
        /**
         * No-Args Constructor that sets the body to null values and zeros.
         */
        setTitle(null);
        setSize(null);
        setDescription(null);
        setPlace(null);
        setTemperature(0);
        setOrbits(null);
        setImageReference(null);
        setElements(null);
        setAge(0);
    }

    protected CelestialBody(
            String title, String size, String description,
            String place, long temperature, String orbits,
            Image imageReference, ElementConfiguration elements, long age
            ){
        /**
         * Constructor that takes in all the attributes for the celestial body and then sets them to their
         * member-level equivalent.
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
    }

    // Getter for Title
    public String getTitle(){
        return this.title;
    }

    // Setter for Title
    public void setTitle(String title){
        this.title = title;
    }

    // Getter for Size
    public String getSize(){
        return size;
    }

    // Setter for Size
    public void setSize(String size){
        this.size = size;
    }

    // Getter for Description
    public String getDescription(){
        return this.description;
    }

    // Setter for Description
    public void setDescription(String description){
        this.description = description;
    }

    // Getter for Place
    public String getPlace(){
        return this.place;
    }

    // Setter for Place
    public void setPlace(String place){
        this.place = place;
    }

    // Getter for Temperature
    public long getTemperature(){
        return this.temperature;
    }

    // Setter for Temperature
    public void setTemperature(long temperature){
        this.temperature = temperature;
    }

    // Getter for Orbits
    public String getOrbits(){
        return this.orbits;
    }

    // Setter for Orbits
    public void setOrbits(String orbits){
        this.orbits = orbits;
    }

    // Getter for ImageReference
    public Image getImageReference(){
        return this.imageReference;
    }

    // Setter for ImageReference
    public void setImageReference(Image imageReference){
        this.imageReference = imageReference;
    }

    // Getter for ElementConfiguration
    public ElementConfiguration getElements(){
        return this.elements;
    }

    // Setter for ElementConfiguration
    public void setElements(ElementConfiguration elements){
        this.elements = elements;
    }

    // Getter for Age
    public long getAge(){
        return this.age;
    }

    // Setter for Age
    public void setAge(long age){
        this.age = age;
    }

    public String getClassName(){
        // returns the name of the class
        System.out.println(getClass().toString());
        return getClass().toString();
    }
}
