/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

import login.Login;
import Admin.Admin;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import login.Login;


/**
 *
 * @author user
 */
public class Admin_OfficerList extends Application   {
        Stage S1;
        TableView table=new TableView();
    @Override
         public void start(Stage stage) {
        
        GridPane all = new GridPane();
        all.setHgap(10);
        
// side btn section
        
        VBox section1 = new VBox();       
        section1.setPrefSize(170, 500);

        
        Button Add_Officer = new Button("Add Officer");
        Button Officers_list = new Button("Officers list");
        Button Make_report = new Button("Make a report");
        Button Logout = new Button("Logout");
        
        
        Add_Officer.setMinSize(170, 175);
        Add_Officer.setFont(Font.font("tahoma", FontWeight.BOLD, 15));
        
        Officers_list.setMinSize(170, 175);
        Officers_list.setFont(Font.font("tahoma", FontWeight.BOLD, 15));
         Officers_list.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent even) {
                Admin_OfficerList c2=new Admin_OfficerList();
                S1.close();
                c2.start(new Stage());
            }
        });

        
        Make_report.setMinSize(170, 175);
        Make_report.setFont(Font.font("tahoma", FontWeight.BOLD, 15));

        
        Logout.setMinSize(170, 175);
        Logout.setBackground(new Background(new BackgroundFill(javafx.scene.paint.Color.web("#bf1f21"), CornerRadii.EMPTY, Insets.EMPTY)));
        Logout.setBorder(new Border(new BorderStroke((javafx.scene.paint.Color.web("#79b5d9")), BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
        Logout.setFont(Font.font("tahoma", FontWeight.BOLD, 15));
       Logout.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent even) {
                Login c2=new Login();
                S1.close();
                c2.start(new Stage());
            }
        });

        
        section1.getChildren().addAll(Add_Officer,Officers_list,Make_report,Logout);
        
//second section

        VBox section2 = new VBox(5);
        section2.setPrefSize(530, 500);
        Label H=new Label("Office List");
        H.setFont(Font.font("Arial", FontWeight.BOLD, FontPosture.ITALIC, 22));
        H.setPadding(new Insets(5, 0, 0, 200));
        table.setEditable(true);
        TableColumn FristName =new TableColumn("ID");
        TableColumn SecondName =new TableColumn("Name");
        SecondName.setPrefWidth(500);
        table.getColumns().addAll(FristName,SecondName);
        table.setMinHeight(200);
        /////Name field//////
        Label l1=new Label("Name");
        l1.setFont(Font.font("Arial", FontWeight.LIGHT, FontPosture.ITALIC, 17));
        TextField name =new TextField();
        name.setPromptText("Name");
        name.setStyle("-fx-background-radius: 30px ;");
        name.setMaxWidth(300);
        ///////Area////////////
        Label l2=new Label("Area");
        l2.setFont(Font.font("Arial", FontWeight.LIGHT, FontPosture.ITALIC, 17));
        ComboBox Area=new ComboBox();
        Area.setPrefWidth(100);
        //////email //////////
        Label email =new Label("Email");
        email.setFont(Font.font("Arial", FontWeight.LIGHT, FontPosture.ITALIC, 17));
        TextField user=new TextField();
        user.setStyle("-fx-background-radius: 30px ;");
        user.setPromptText("Email");
        user.setMaxWidth(300);
        ////////////username/////////////
        Label u =new Label("User Name");
        u.setFont(Font.font("Arial", FontWeight.LIGHT, FontPosture.ITALIC, 17));
        TextField user1=new TextField();
        user1.setStyle("-fx-background-radius: 30px ;");
        user1.setPromptText("UserName");
        user1.setMaxWidth(300);
        /////////// password /////////////
        Label pass =new Label("Password");
        pass.setFont(Font.font("Arial", FontWeight.LIGHT, FontPosture.ITALIC, 17));
        PasswordField P=new PasswordField();
        P.setMaxWidth(300);
        P.setStyle("-fx-background-radius: 30px ;");
        P.setPromptText("Password");
        ///////////sex /////////////
        HBox S=new HBox(20);
        ToggleGroup tg = new ToggleGroup();
        RadioButton Male=new RadioButton("Male");
        RadioButton Female=new RadioButton("Female");
        tg.getToggles().addAll(Male,Female);
        S.getChildren().addAll(Male,Female);
        ///////////////////phone/////////////
        Label ph=new Label("Phone");
        ph.setFont(Font.font("Arial", FontWeight.LIGHT, FontPosture.ITALIC, 17));
        TextField Phone=new TextField();
        Phone.setStyle("-fx-background-radius: 30px ;");
        Phone.setPromptText("Phone");
        Phone.setMaxWidth(300);
        //////////////////button///////
        HBox B=new HBox(100);
        B.setPadding(new Insets(10, 0, 0, 80));
        Button D=new Button("Delete Officer");
        Button U=new Button("Update Officer");
        D.setStyle("-fx-background-radius: 300px ;-fx-background-color:Red; ");
        U.setStyle("-fx-background-radius: 300px ;-fx-background-color:Orange;");
        D.setMinWidth(120);
        U.setMinWidth(120);
        D.setFont(Font.font("tahoma", FontWeight.BOLD, 14));
        D.setTextFill(javafx.scene.paint.Color.BLACK);
        U.setFont(Font.font("tahoma", FontWeight.BOLD, 14));
        U.setTextFill(javafx.scene.paint.Color.BLACK);
        B.getChildren().addAll(D,U);
        ////////////////////////
        section2.getChildren().addAll(H,table,l1,name,l2,Area,email,user,u,user1,pass,P,S,ph,Phone,B);
        all.add(section1, 0, 0);
        all.add(section2, 1, 0);
        all.setBackground(new Background(new BackgroundFill(javafx.scene.paint.Color.web("#a5cee5"), CornerRadii.EMPTY, Insets.EMPTY)));

        
        Scene scene = new Scene(all,700,700);           
        stage.setScene(scene);;
        stage.setTitle("Admin Screen");
        stage.setResizable(false);
        
        stage.show();
        S1=stage;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    
}