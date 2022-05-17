/*
Program Name: Planet Explorer

Program Author: Mitchell M. Gresham

Last Date Modified: 5/16/2022

Program Summary: The program will allow users to see some fun facts about some celestial bodies in our solar system
                 and then will have the ability to learn more about that planet from NASA's website.
 */

package application_backend.structure;

import javafx.application.Application; // import required imports for application in javafx
import javafx.stage.Stage;
import java.io.IOException;

public class Execution extends Application {
    /**
     * Public class which handles the execution of the JavaFX application by extending the Application
     * superclass and implementing its methods.
     * @param stage
     * @throws IOException
     */
    @Override
    // Override the start method which as you may think this method starts the application up using stages
    // provided by the classes that represent the different pages
    public void start(Stage stage) throws IOException {
        Stage applicationStage = new Stage();
        applicationStage.setTitle(Introduction.title);
        applicationStage.setScene(new Introduction().getIntroductionPreloaded());
        applicationStage.setMaximized(true);
        applicationStage.show();

    }

    // Main Method if the IDE isn't very supportive of JavaFX applications.
    public static void main(String[] args) {
        launch();
    }
}