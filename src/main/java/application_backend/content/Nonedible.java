package application_backend.content;

public interface Nonedible {
    /**
     * Interface that says an object is non edible once it has been created, the setter methods are private.
     *
     * @return
     */
    public static boolean isEdible(){
        /**
         * Method that simply returns false when asked if an object can be edited.
         */
        return false;
    }
}
