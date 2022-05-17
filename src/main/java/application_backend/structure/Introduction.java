package application_backend.structure;

import javafx.fxml.FXML; // imports for fxml
import javafx.fxml.FXMLLoader;

import javafx.scene.Scene; // imports for building and editing science
import javafx.scene.control.Button;

import javafx.stage.Stage;

import org.jetbrains.annotations.NotNull; // annotations for if can't be null

import java.io.IOException;

public class Introduction {
    /**
     * Class which is responsible for the back-end of the Introduction-Screen.
     */

    @FXML
    private Button button; // private Button in FXML

    public final static String title = "Planet Explorer - Introduction Screen"; // title of page

    /**
     * BUG REPORT
     *
     * -- PROBLEM --
     * The MediaViewer around three to four times after launching will refuse to play the video.
     * The reason for this is unknown, and it seems like the preloader that was made below helped to reduce
     * the consistency though it still occurs.
     *
     * -- POSSIBLE SOLUTION --
     * The belief that I hold is that it is from the video not being loaded fast enough to be displayed by the
     * Scene though after doing some research I lack any real reason to assume other than a guess. This could
     * maybe be solved by using a BufferedFileInput though I don't know how to incorporate that.
     *
     */
    public @NotNull Scene getIntroductionPreloaded() throws IOException {
        // returns a scene built from the fxml
        String introScreenFilePath = "/fxml/introduction-screen.fxml";

        FXMLLoader fxmlLoader = new FXMLLoader(Execution.class.getResource(introScreenFilePath));
        return new Scene(fxmlLoader.load());
    }

    @FXML
    protected void handleStartButton() throws IOException {
        // if the start button is pressed then the stage is changed to the new scene and values are set
        // accordingly
        Stage currentStage = (Stage) button.getScene().getWindow();
        currentStage.setScene(new Selection().getSelectionPreloaded());
        currentStage.setTitle(Selection.title);
    }
}