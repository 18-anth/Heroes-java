package hers.App;
import hers.Data.Conexion;
import javafx.application.Application; 
import javafx.scene.Scene; 
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

/**
 *
 * @author ANTHONY ESTUARDO CÓRDOVA MORENO
 */
public class Heroes extends Application {


    @Override
    public void start(Stage escenario) throws Exception {
        Conexion.obtenerConexion();
        Parent root  = FXMLLoader.load(getClass().getResource("../Container/admin.fxml"));

        Scene escena = new Scene(root);
        escena.getStylesheets().clear();
        escena.getStylesheets().add(getClass().getResource("../CSS/styles.css").toExternalForm());
         
        escenario.initStyle(StageStyle.UNDECORATED);
        escenario.setScene(escena); 
        escenario.show();

       
    }  
    
    public static void main(String[] args) {
        launch(args);
    }

}