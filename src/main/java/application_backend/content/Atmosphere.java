package application_backend.content;

public class Atmosphere {
    /**
     * Public class which holds attributes for the composition and the color of the atmosphere.
     */
    private String element1; // private member-level variables to hold attributes
    private String element2;
    private String element3;
    private String skyColor;

    public Atmosphere(){
        /**
         * No-Args Constructor that sets all values of the atmosphere to null.
         */
        setElement1(null);
        setElement2(null);
        setElement3(null);
        setSkyColor(null);
    }

    public Atmosphere(String element1, String element2, String element3, String skyColor){
        /**
         * Constructor that lets the user pass in all the attributes for the atmosphere, the first three are most common
         * elements in the atmosphere and the last one is the color of the sky.
         */
        setElement1(element1);
        setElement2(element2);
        setElement3(element3);
        setSkyColor(skyColor);
    }

    public String getElement1(){
        /**
         * Getter method for element1
         */
        return this.element1;
    }

    private void setElement1(String element1){
        /**
         * Setter method for element1
         */
        this.element1 = element1;
    }

    public String getElement2() {
        /**
         * Getter method for element2
         */
        return this.element2;
    }

    private void setElement2(String element2){
        /**
         * Setter method for element2
         */
        this.element2 = element2;
    }

    public String getElement3(){
        /**
         * Getter method for element3
         */
        return this.element3;
    }

    private void setElement3(String element3){
        /**
         * Setter method for element3
         */
        this.element3 = element3;
    }

    public String getSkyColor(){
        /**
         * Getter method for the color of the sky
         */
        return this.skyColor;
    }

    private void setSkyColor(String skyColor){
        /**
         * Setter method for the color of the sky
         */
        this.skyColor = skyColor;
    }

}
