/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package currencyconverterbccucbau;

import com.xignite.services.Currencies;
import com.xignite.services.Currency;
import com.xignite.services.XigniteCurrencies;
import com.xignite.services.XigniteCurrenciesSoap;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author user
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private ComboBox<Currencies> box1;
    @FXML
    private ComboBox<Currencies> box2;
    @FXML
    private TextField num;
    @FXML 
    private Label label;
    
    private Double result;
 
    private Double value;
    
    
    XigniteCurrencies object=new XigniteCurrencies();
    XigniteCurrenciesSoap get_Currency=object.getXigniteCurrenciesSoap();
    
    @FXML
    public void actiondone(ActionEvent event){
        String value1=box1.getValue().toString().toUpperCase();
        String value2=box2.getValue().toString().toUpperCase();
        double number=Double.parseDouble(num.getText());
        //Double number=num.getValue().to
        result=get_Currency.convertRealTimeValue(value1,value2,number).getResult();        //reuslt=get_Currency.c
        //label.setText(String.valueOf(get_Currency.convertRealTimeValue(Currencies.valueOf(value1).toString(), Currencies.valueOf(value2).toString(), number)
        //));
       result=get_Currency.co
        label.setText(Double.toString(result));
    }
    
    
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        box1.setItems(FXCollections.observableArrayList(Currencies.values()));
        box2.setItems(FXCollections.observableArrayList(Currencies.values()));
        // TODO
    }    
    
}
