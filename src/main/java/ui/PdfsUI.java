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
@Route(value="PDFs",layout = MainView.class) 
public class PdfsUI extends VerticalLayout{

    public PdfsUI() {
        H1 h1Texto=new H1("PDFs");
        add(h1Texto);
    }
    
    
}
