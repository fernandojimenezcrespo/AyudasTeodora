/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import com.ejemplo.MainView;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import lombok.extern.log4j.Log4j2;

/**
 *
 * @author ferna
 */
@Log4j2
@Route(value = "CribadoPDF", layout = MainView.class)
public class CribadoPDF extends VerticalLayout {

    public CribadoPDF() {
        H1 h1Texto = new H1("Cribado");
        add(h1Texto);
    }
}
