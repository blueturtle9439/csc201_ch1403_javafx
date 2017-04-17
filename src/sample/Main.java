package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Collections;

public class Main extends Application {
    String path = "D:\\programs\\workplace\\intellijworkspace\\csc201_ch1403_java\\card images\\";
    static String file1 = "";
    static String file2 = "";
    static String file3 = "";


    @Override
    public void start(Stage primaryStage) throws Exception {


        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(15, 15, 15, 15));

        Scene scene = new Scene(grid, 750, 400);
        primaryStage.setScene(scene);

        Integer[] arr = new Integer[52];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i+1;
        }
        Collections.shuffle(Arrays.asList(arr));
        file1 = arr[1].toString();
        file2 = arr[2].toString();
        file3 = arr[3].toString();

        FileInputStream input = new FileInputStream(path + file1 + ".jpg");
        Image image = new Image(input);
        ImageView imageView = new ImageView(image);
        HBox hbox = new HBox(imageView);
        grid.add(hbox, 0, 0);

        FileInputStream input2 = new FileInputStream(path + file2 + ".jpg");
        Image image2 = new Image(input2);
        ImageView imageView2 = new ImageView(image2);
        HBox hbox2 = new HBox(imageView2);
        grid.add(hbox2, 1, 0);

        FileInputStream input3 = new FileInputStream(path + file3 + ".jpg");
        Image image3 = new Image(input3);
        ImageView imageView3 = new ImageView(image3);
        HBox hbox3 = new HBox(imageView3);
        grid.add(hbox3, 2, 0);

        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
