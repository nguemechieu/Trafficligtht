package sample;


import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.ButtonBar;
import javafx.scene.control.RadioButton;
import javafx.scene.input.InputMethodEvent;

import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;

import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        drawTrafficLight();
    }
    @FXML
    private Rectangle rectangle;
    public void isRectangle(MouseEvent event){
        if (event!=null){
        }

    }


    @FXML
    private AnchorPane anchorPane;
    public  void isAnchorPane (MouseEvent mouseEvent){
       anchorPane.setPrefWidth(400);
       anchorPane.setPrefHeight(600);
if (mouseEvent!=null){
    anchorPane.translateYProperty();

}
    }


// drawTrafficLight Method
    private void drawTrafficLight() {

        rectangle.setStroke(Color.BLUE);//rectangle stro
        rectangle.setHeight(330);
        rectangle.setWidth(140);
        rectangle.setFill(Color.TRANSPARENT);
        circle1.setRadius(50);
        circle2.setRadius(50);
        circle3.setRadius(50);


    }


    @FXML private Circle circle1;
    public void isCircle1(MouseEvent keyEvent) {

        if (keyEvent!=null){

        }
    }

    @FXML private Circle circle2;
    public void isCircle2(MouseEvent keyEvent) {

        if (keyEvent!=null){

        }
    }

    @FXML private Circle circle3;
    public void isCircle3(MouseEvent keyEvent) {
        if (keyEvent!=null){

        }
    }

    @FXML private RadioButton radioButton1;
    public void isRadiobutton1(MouseEvent mouseEvent) {
        if (mouseEvent != null) {

            if (radioButton1.isSelected()) {
                drawTrafficLight();//update traffic light
                circle1.setFill(Color.GREEN);
                radioButton1.setSelected(true);
                radioButton3.setSelected(false);
                radioButton2.setSelected(false);
                circle2.setFill(Color.TRANSPARENT);
                circle3.setFill(Color.TRANSPARENT);
            } else {
                drawTrafficLight();
                circle1.setFill(Color.TRANSPARENT);
                radioButton1.setSelected(false);
            }
        }
    }



    @FXML private RadioButton radioButton2;
    public void isRadioButton2(MouseEvent mouseEvent) {
        if (mouseEvent != null ) {

            if (radioButton2.isSelected()) {
                drawTrafficLight();//update traffic light
                circle2.setFill(Color.YELLOW);
                radioButton2.setSelected(true);
                radioButton1.setSelected(false);
                radioButton3.setSelected(false);

                circle1.setFill(Color.TRANSPARENT);
                circle3.setFill(Color.TRANSPARENT);
            } else {
                drawTrafficLight();
                circle2.setFill(Color.TRANSPARENT);
                radioButton2.setSelected(false);
            }
        }
    }


    @FXML private RadioButton radioButton3;
    public void isRadioButton3(MouseEvent mouseEvent) {

        if (mouseEvent !=null) {

           if (radioButton3.isSelected()) {
               drawTrafficLight();//update traffic light


               radioButton2.setSelected(false);
               radioButton1.setSelected(false);
               radioButton3.setSelected(true);
               circle3.setFill(Color.RED);
               circle1.setFill(Color.TRANSPARENT);
               circle2.setFill(Color.TRANSPARENT);
           }else {
               drawTrafficLight();
               circle3.setFill(Color.TRANSPARENT);
           }
    }
    }



    @FXML
    ButtonBar buttonBar;
    public void isButtonBar(InputMethodEvent inputMethodEvent) {

    if(inputMethodEvent!=null){
                    }
    }
}
