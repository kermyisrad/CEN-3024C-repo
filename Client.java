package chapter11;

import java.io.*;
import java.net.*;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Client extends Application {

DataOutputStream toServer = null;

DataInputStream fromServer = null;

public void start(Stage primaryStage) {

BorderPane paneForTextField = new BorderPane();

paneForTextField.setPadding(new Insets(5, 5, 5, 5));

paneForTextField.setStyle("-fx-border-color: red");

paneForTextField.setLeft(new Label("Enter a number: "));

TextField tf = new TextField();

tf.setAlignment(Pos.BOTTOM_RIGHT);

paneForTextField.setCenter(tf);

BorderPane mainPane = new BorderPane();

TextArea ta = new TextArea();

mainPane.setCenter(new ScrollPane(ta));

mainPane.setTop(paneForTextField);

Scene scene = new Scene(mainPane, 450, 200);

primaryStage.setTitle("Client"); 

primaryStage.setScene(scene); 

primaryStage.show(); 

tf.setOnAction(e -> {

try {

int number = Integer.parseInt(tf.getText().trim());

toServer.writeInt(number);

toServer.flush();

boolean servBool = fromServer.readBoolean();

ta.appendText("Number is " + number + "\n");

ta.appendText("Is number Prime: "

+ servBool + '\n');

}

catch (IOException ex) {

System.err.println(ex);

}

});

try (Socket socket = new Socket("localhost", 8080)) {


fromServer = new DataInputStream(socket.getInputStream());

toServer = new DataOutputStream(socket.getOutputStream());

}

catch (IOException ex) {

ta.appendText(ex.toString() + '\n');

}

}



public static void main(String[] args) {

launch(args);

}

}
