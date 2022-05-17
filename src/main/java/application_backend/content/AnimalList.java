package application_backend.content;

public class AnimalList implements Nonedible {
    /**
     * AnimalList is a public class that is a representation of the three most important creatures on a plant.
     * The class is Nonedible meaning that once an AnimalList is set it cannot be manipulated. These top three
     * animals have getter methods to retrieve them.
     */
    private String exampleAnimal1; // private variables that represent the animals
    private String exampleAnimal2;
    private String exampleAnimal3;

    public AnimalList(){
        /**
         * No-Args Constructor just sets all the values for the animals to null. Methods will be implemented
         * further into the program that will ensure that runtime errors don't result because of null values.
         */
        setExampleAnimal1(null);
        setExampleAnimal2(null);
        setExampleAnimal3(null);
    }

    public AnimalList(String exampleAnimal1, String exampleAnimal2, String exampleAnimal3){
        /**
         * Constructor that takes three arguments ordered from first to last as the most important on that
         * planet. These values are them set the class's member-level variables.
         */
        setExampleAnimal1(exampleAnimal1);
        setExampleAnimal2(exampleAnimal2);
        setExampleAnimal3(exampleAnimal3);
    }

    public String getExampleAnimal1(){
        /**
         * Getter method for exampleAnimal1
         */
        return this.exampleAnimal1;
    }

    public void setExampleAnimal1(String exampleAnimal1){
        /**
         * Setter method for exampleAnimal1
         */
        this.exampleAnimal1 = exampleAnimal1;
    }

    public String getExampleAnimal2(){
        /**
         * Getter method for exampleAnimal2
         */
        return this.exampleAnimal2;
    }

    public void setExampleAnimal2(String exampleAnimal2){
        /**
         * Setter method for exampleAnimal2
         */
        this.exampleAnimal2 = exampleAnimal2;
    }

    public String getExampleAnimal3(){
        /**
         * Getter method for exampleAnimal3
         */
        return this.exampleAnimal3;
    }

    public void setExampleAnimal3(String exampleAnimal3) {
        /**
         * Setter method for exampleAnimal3
         */
        this.exampleAnimal3 = exampleAnimal3;
    }
}
