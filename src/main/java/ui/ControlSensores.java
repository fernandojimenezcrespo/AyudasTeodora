/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ui;

import com.ejemplo.MainView;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import java.util.ArrayList;
import lombok.extern.log4j.Log4j2;
import pdf.ControlSensoresPDF;

/**
 *
 * @author ferna
 */
@Route(value="ControlSensores",layout = MainView.class)
@Log4j2
public class ControlSensores extends VerticalLayout{

    
        HorizontalLayout horiUno=new HorizontalLayout();
        HorizontalLayout horiDos=new HorizontalLayout();
        HorizontalLayout horiTres=new HorizontalLayout();
        HorizontalLayout horiCuatro=new HorizontalLayout();
        HorizontalLayout horiCinco=new HorizontalLayout();
        
        TextField txtPaci1 = new TextField("Paciente 1:");

        TextField txtPaci2 = new TextField("Paciente 2:");
        TextField txtPaci3 = new TextField("Paciente 3:");
        TextField txtPaci4 = new TextField("Paciente 4:");
        TextField txtPaci5 = new TextField("Paciente 5:");
        
        TextField txtPaci6 = new TextField("Paciente 6:");
        TextField txtPaci7 = new TextField("Paciente 7:");
        TextField txtPaci8 = new TextField("Paciente 8:");
        TextField txtPaci9 = new TextField("Paciente 9:");
        TextField txtPaci10 = new TextField("Paciente 10:");
public ControlSensores() {
        txtPaci1.setWidth("500px");
        txtPaci2.setWidth("500px");
        txtPaci3.setWidth("500px");
        txtPaci4.setWidth("500px");
        txtPaci5.setWidth("500px");
        txtPaci6.setWidth("500px");
        txtPaci7.setWidth("500px");
        txtPaci8.setWidth("500px");
        txtPaci9.setWidth("500px");
        txtPaci10.setWidth("500px");

        
        horiUno.add(txtPaci1,txtPaci2);
        horiDos.add(txtPaci3,txtPaci4);
        horiTres.add(txtPaci5,txtPaci6);
        horiCuatro.add(txtPaci7,txtPaci8);
        horiCinco.add(txtPaci9,txtPaci10);
        Button btnGenerarPDF=new Button("Generar PDF");
        btnGenerarPDF.addClickListener(e->{
            ArrayList<String> arrPacientes=cargaNombresPacientes();
            ControlSensoresPDF controlSensorPDF = new ControlSensoresPDF();
            removeAll();
            add(controlSensorPDF);
        });
        add(horiUno,horiDos,horiTres,horiCuatro,horiCinco,btnGenerarPDF);
    }

    private ArrayList<String> cargaNombresPacientes() {
        ArrayList<String> arrPacientes= new ArrayList<String>();
        arrPacientes.add(txtPaci1.getValue());
        arrPacientes.add(txtPaci2.getValue());
        arrPacientes.add(txtPaci3.getValue());
        arrPacientes.add(txtPaci4.getValue());
        arrPacientes.add(txtPaci5.getValue());
        arrPacientes.add(txtPaci6.getValue());
        arrPacientes.add(txtPaci7.getValue());
        arrPacientes.add(txtPaci8.getValue());
        arrPacientes.add(txtPaci9.getValue());
        arrPacientes.add(txtPaci10.getValue());
        
        
        
        return arrPacientes;
    }
    
    
}
