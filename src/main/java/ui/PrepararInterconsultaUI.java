/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import com.ejemplo.MainView;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.VaadinServletService;
import lombok.extern.log4j.Log4j2;

/**
 *
 * @author ferna
 */
 
    

@Route(value="PrepararInterconsultaUI" , layout = MainView.class)
@Log4j2
public class PrepararInterconsultaUI extends VerticalLayout{
 HorizontalLayout lytCartel = new HorizontalLayout();
   
    public PrepararInterconsultaUI() {
        H1 h1Menu= new H1("AYUDA PARA PREPARAR INTERCONSULTA DE JIMENA.");
      
        this.lytCartel.add(h1Menu);
          Button btnEnlace = new Button("Enlace", new Icon(VaadinIcon.DOCTOR));
        btnEnlace.setTooltipText("Enlace para hacer la Interconsulta");
        btnEnlace.addClickListener(e->{
                 getUI().ifPresent(ui -> ui.getPage().executeJs("window.open('" + "html/plantilla_ulceras.html" + "', '_blank');"));
    
        });
        
        add(lytCartel,btnEnlace);
        
    }
}