/**
 * @author Alyssa Ma
 * 3/22/18
 * Period 2
 */
package application;
 
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
 
public class HelloWorld extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello World!");
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
 
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
        
        
        HighScoreManager hm = new HighScoreManager();
        hm.addScore("P1",240);
        hm.addScore("P2",300);
        hm.addScore("P3",220);
        hm.addScore("P4",100);
        hm.addScore("P5",270);

        System.out.print(hm.getHighscoreString());
    }
    
}