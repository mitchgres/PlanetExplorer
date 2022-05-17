package application_backend.structure;

import application_backend.content.*;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.util.ResourceBundle;


public class Selection implements Initializable {
    /**
     * Class that contains back-end for the Selection screen in the application, extends the Initializbale
     * class.
     */
    private int planetCounter = 0; // set the planet that were on to zero

    @FXML
    private ImageView planetImage; // image displayed

    @FXML
    private Label scrTitle; // title of the card

    @FXML
    private Label desc; // static description of the card

    @FXML
    private Label otherInfo; // additional information which is created in this class

    public final static String title = "Planet Explorer - Selection Screen"; // stage title

    public Selection() {
        // empty constructor for the class
    }

    @Contract(value = " -> new", pure = true)
    private static @NotNull CelestialBody @NotNull [] getBodyList(){
        // configures a list of the configured bodies and returns them
        return new CelestialBody[]{
                Configured_Bodies.localSolarSystem,
                Configured_Bodies.localSun,
                Configured_Bodies.mercury,
                Configured_Bodies.venus,
                Configured_Bodies.earth,
                Configured_Bodies.earthMoon,
                Configured_Bodies.mars,
                Configured_Bodies.jupiter,
                Configured_Bodies.saturn,
                Configured_Bodies.uranus,
                Configured_Bodies.neptune
        };
    }
    private void changeMainContentPlanet(@NotNull CelestialBody[] celestialBodies,
                                         int counter){
        // it sets the image, title, description, and configures and sets the additional information for the
        // card
        planetImage.setImage(celestialBodies[counter].getImageReference()); // sets image
        scrTitle.setText(celestialBodies[counter].getTitle()); // set title
        desc.setText(celestialBodies[counter].getDescription()); // sets description

        /* The following if-else statement check the class name of the class which is an extension of the Celestial_Bodies
        and then formats the additional information about that planet accordingly since some objects have attributes which other
        don't.
         */
        if (celestialBodies[counter].getClass().toString().equals("class application_backend.content.HabitablePlanet"))
        {
            otherInfo.setText(
                    String.format(
                            "%s is %s in size. It is %s away from %s, and the temperature is %d. The most common elements " +
                                    "on this planet are %s, %s, and %s. The atmosphere of this planet is made up of %s, %s, and " +
                                    "%s which makes the sky color %s. This planet is %d years old. " +
                                    "As for the human population there are %d people, and some common animals include" +
                                    " the %s, %s, and %s",
                            celestialBodies[counter].getTitle(),
                            celestialBodies[counter].getAge(),
                            celestialBodies[counter].getPlace(),
                            celestialBodies[counter].getOrbits(),
                            celestialBodies[counter].getTemperature(),
                            celestialBodies[counter].getElements().getElement1(),
                            celestialBodies[counter].getElements().getElement2(),
                            celestialBodies[counter].getElements().getElement3(),
                            ((Planet) celestialBodies[counter]).getAtmosphereComposition().getElement1(),
                            ((Planet) celestialBodies[counter]).getAtmosphereComposition().getElement2(),
                            ((Planet) celestialBodies[counter]).getAtmosphereComposition().getElement3(),
                            ((Planet) celestialBodies[counter]).getAtmosphereComposition().getSkyColor(),
                            celestialBodies[counter].getAge(),
                            ((HabitablePlanet) celestialBodies[counter]).getHumanPopulation(),
                            ((HabitablePlanet) celestialBodies[counter]).getAnimalExamples().getExampleAnimal1(),
                            ((HabitablePlanet) celestialBodies[counter]).getAnimalExamples().getExampleAnimal2(),
                            ((HabitablePlanet) celestialBodies[counter]).getAnimalExamples().getExampleAnimal3()
                            )
            );
        }
        else if (celestialBodies[counter].getClass().toString().equals("class application_backend.content.Planet"))
        {
            otherInfo.setText(
                    String.format(
                            "%s is %s in size. It is %s away from %s, and the temperature is %d. The most common elements " +
                                    "on this planet are %s, %s, and %s. The atmosphere of this planet is made up of %s, %s, and " +
                                    "%s which makes the sky color %s. This planet is %d years old.",
                            celestialBodies[counter].getTitle(),
                            celestialBodies[counter].getAge(),
                            celestialBodies[counter].getPlace(),
                            celestialBodies[counter].getOrbits(),
                            celestialBodies[counter].getTemperature(),
                            celestialBodies[counter].getElements().getElement1(),
                            celestialBodies[counter].getElements().getElement2(),
                            celestialBodies[counter].getElements().getElement3(),
                            ((Planet) celestialBodies[counter]).getAtmosphereComposition().getElement1(),
                            ((Planet) celestialBodies[counter]).getAtmosphereComposition().getElement2(),
                            ((Planet) celestialBodies[counter]).getAtmosphereComposition().getElement3(),
                            ((Planet) celestialBodies[counter]).getAtmosphereComposition().getSkyColor(),
                            celestialBodies[counter].getAge()
                            )
            );
        } else if (celestialBodies[counter].getClass().toString().equals("class application_backend.content.Moon"))
        {
            otherInfo.setText(
                    String.format(
                            "%s is %s in size. It is %s away from %s, and the temperature is %d. The most common elements " +
                                    "on this moon are %s, %s, and %s. This moon is %d years old. It is %s that this" +
                                    " moon has been landed on and its closest planet is %s",
                            celestialBodies[counter].getTitle(),
                            celestialBodies[counter].getAge(),
                            celestialBodies[counter].getPlace(),
                            celestialBodies[counter].getOrbits(),
                            celestialBodies[counter].getTemperature(),
                            ((Moon) celestialBodies[counter]).getElements().getElement1(),
                            celestialBodies[counter].getElements().getElement2(),
                            celestialBodies[counter].getElements().getElement3(),
                            celestialBodies[counter].getAge(),
                            ((Moon) celestialBodies[counter]).getHasBeenLandedOn(),
                            ((Moon) celestialBodies[counter]).getClosestPlanet()
                    )
            );
        }
        else if (celestialBodies[counter].getClass().toString().equals("class application_backend.content.SolarSystem"))
        {
            otherInfo.setText(
                    String.format(
                            "%s is %s in size. It is %s away from %s, and the temperature is %d. The most common elements " +
                                    "on this solar system are %s, %s, and %s. This solar system is %d years old. The main star of this" +
                                    " is %s and there are %d number of planets which orbit it.",
                            celestialBodies[counter].getTitle(),
                            celestialBodies[counter].getAge(),
                            celestialBodies[counter].getPlace(),
                            celestialBodies[counter].getOrbits(),
                            celestialBodies[counter].getTemperature(),
                            celestialBodies[counter].getElements().getElement1(),
                            celestialBodies[counter].getElements().getElement2(),
                            celestialBodies[counter].getElements().getElement3(),
                            celestialBodies[counter].getAge(),
                            ((SolarSystem) celestialBodies[counter]).getMainStar(),
                            ((SolarSystem) celestialBodies[counter]).getNumberOfPlanets()
                    )
            );
        }
        else if(celestialBodies[counter].getClass().toString().equals("class application_backend.content.Sun"))
        {
            otherInfo.setText(
                    String.format(
                            "%s is %s in size. It is %s away from %s, and the temperature is %d. The most common elements " +
                                    "on this sun are %s, %s, and %s. This sun is %d years old. It has %d planets orbiting it " +
                                    "and gives off about %s energy.",
                            celestialBodies[counter].getTitle(),
                            celestialBodies[counter].getAge(),
                            celestialBodies[counter].getPlace(),
                            celestialBodies[counter].getOrbits(),
                            celestialBodies[counter].getTemperature(),
                            celestialBodies[counter].getElements().getElement1(),
                            celestialBodies[counter].getElements().getElement2(),
                            celestialBodies[counter].getElements().getElement3(),
                            celestialBodies[counter].getAge(),
                            ((Sun) celestialBodies[counter]).getPlanetsOrbiting(),
                            ((Sun) celestialBodies[counter]).getEnergyGivenOff()
                    )
            );
        }
        else
        {
            // occurred if the class of the object doesn't match any that it should if this is the case application shouldn't
            // continue
            System.out.println(celestialBodies[counter].getClassName());
            System.out.println(celestialBodies[counter].getClass().toString());
            System.out.println("FATAL ERROR: CONFIGURATION OF GRAPHICS IN SELECTION LINE 176");
        }
    }

    public @NotNull Scene getSelectionPreloaded() throws IOException {
        // returns the fxml loaded scene of the page
        String selectionScreenFilePath = "/fxml/selection-screen.fxml";

        FXMLLoader fxmlLoader = new FXMLLoader(Execution.class.getResource(selectionScreenFilePath));
        return new Scene(fxmlLoader.load());
    }

    @FXML
    protected void handleSelectButton(){
        // handles the action event that occurs when the select button is pressed on the page. This will check
        // the planet number of the current planet and then depending on the number will link to the accompanying
        // NASA website to get more information about that planet
        URI uri = null;
        try {
            // these check
            if (planetCounter == 0){
                // these set
                uri = new URI("https://solarsystem.nasa.gov/solar-system/our-solar-system/overview/");
            }
            else if (planetCounter == 1) {
                uri = new URI("https://solarsystem.nasa.gov/solar-system/sun/overview/");
            }
            else if (planetCounter == 2) {
                uri = new URI("https://solarsystem.nasa.gov/planets/mercury/overview/");
            }
            else if (planetCounter == 3) {
                uri = new URI("https://solarsystem.nasa.gov/planets/venus/overview/");
            }
            else if (planetCounter == 4) {
                uri = new URI("https://solarsystem.nasa.gov/planets/earth/overview/");
            }
            else if (planetCounter == 5){
                uri = new URI("https://solarsystem.nasa.gov/moons/earths-moon/overview/");
            }
            else if (planetCounter == 6){
                uri = new URI("https://solarsystem.nasa.gov/planets/mars/overview/");
            }
            else if (planetCounter == 7){
                uri = new URI("https://solarsystem.nasa.gov/planets/jupiter/overview/");
            }
            else if (planetCounter == 8){
                uri = new URI("https://solarsystem.nasa.gov/planets/saturn/overview/");
            }
            else if (planetCounter == 9){
                uri = new URI("https://solarsystem.nasa.gov/planets/uranus/overview/");
            }
            else if (planetCounter == 10){
                uri = new URI("https://solarsystem.nasa.gov/planets/neptune/overview/");
            }
            java.awt.Desktop.getDesktop().browse(uri); // now it opens the user browser to that webpage
        }
        catch (Exception exception){
            // if there was an exception then catch and report
            System.out.println("ERROR IN OPENING DESKTOP FOR BROWSER: CHECK LINE 206");
        }
    }

    @FXML
    protected void handleLeftButton(){
        // handles the action event that occurred when the left button is pressed it decreases the planetCounter count
        // unless it is at zero and then it goes all the way up to ten
        System.out.println(planetCounter);
        if (planetCounter == 0){
            planetCounter = 10;
        }
        else {
            planetCounter -= 1;
        }
        changeMainContentPlanet(getBodyList(), planetCounter); // changes content base on new number
    }

    @FXML
    protected void handleRightButton(){
        // handles the action event that occurs whenever the right button is pressed it increases the planetCounter count
        // until it reaches ten and then it loops it around back to zero.
        System.out.println(planetCounter);
        if (planetCounter == 10){
            planetCounter = 0;
        }
        else {
            planetCounter++;
        }
        changeMainContentPlanet(getBodyList(), planetCounter); // changes counter based on new number
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // init. the fxml webpage and displays information for the first in order for display
        changeMainContentPlanet(getBodyList(), planetCounter);
    }
}
