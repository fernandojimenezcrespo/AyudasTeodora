/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import com.ejemplo.MainView;
import com.vaadin.flow.component.charts.model.Label;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import lombok.extern.log4j.Log4j2;

@Route(value="AyudasTeodora" , layout = MainView.class)
@Log4j2
public class AyudasTeodoraUI extends VerticalLayout{

    public AyudasTeodoraUI() {
        H1 lblTitulo=new H1("Ayudas Teodora");
        this.add(lblTitulo);
        
    }

     
    
    
    
    
}
