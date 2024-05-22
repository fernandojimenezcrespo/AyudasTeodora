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
import lombok.extern.log4j.Log4j2;

/**
 *
 * @author ferna
 */
@Route(value = "VacunasDocumentacion", layout = MainView.class)
@Log4j2
public class VacunasDocumentacion extends VerticalLayout{

    HorizontalLayout lytCartel = new HorizontalLayout();

    public VacunasDocumentacion() {
        H1 h1Menu = new H1("Consulta la Documentacion de las Vacunas");

        this.lytCartel.add(h1Menu);
        Button btnEnlace = new Button("Enlace", new Icon(VaadinIcon.DOCTOR));
        btnEnlace.setTooltipText("Enlace para hacer la Interconsulta");
        btnEnlace.addClickListener(e -> {
            //getUI().ifPresent(ui -> ui.getPage().executeJs("window.open('" + "plantilla_ulceras.html" + "', '_blank');"));
            //getUI().ifPresent(ui -> ui.getPage().setLocation("plantilla_ulceras.html"));
            /**
             * EL FICHERO HTML TIENE QUE ESTAR EN /src/main/webapp/
             */
            getUI().ifPresent(ui -> ui.getPage().open(" vacunas.html", "_blank"));
        });

        add(lytCartel, btnEnlace);

    }

}
