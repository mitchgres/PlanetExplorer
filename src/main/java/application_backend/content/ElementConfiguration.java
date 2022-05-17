package application_backend.content;

public class ElementConfiguration implements Nonedible {
    /**
     * Class which supplies the three most common elements on a celestial body. It implements the Nonedible
     * interface as if it were to change in a dramatic way then the planet should be a new object.
     */
    private String element1; // private member-level var.s that represent the three most common elements
    private String element2;
    private String element3;

    private ElementConfiguration(){
        /**
         * No-Args Constructor that is private because since the object is non-edible it can never be changed.
         */
        element1 = null;
        element2 = null;
        element3 = null;
    }

    ElementConfiguration(String element1, String element2, String element3){
        /**
         * Constructor which when supplied three elements in order sets it to its member-level equivalent in the
         * object.
         */
        setElement1(element1);
        setElement2(element2);
        setElement3(element3);
    }

    // Getter for Element1
    public String getElement1(){
        return this.element1;
    }

    // Setter for Element1
    private void setElement1(String element1){
        this.element1 = element1;
    }

    // Getter for Element2
    public String getElement2(){
        return this.element2;
    }

    // Setter for Element2
    private void setElement2(String element2){
        this.element2 = element2;
    }

    // Getter for Element3
    public String getElement3(){
        return this.element3;
    }

    // Setter for Element3
    private void setElement3(String element3){
        this.element3 = element3;
    }

}
