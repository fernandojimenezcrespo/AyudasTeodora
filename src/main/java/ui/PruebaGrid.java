/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;
import com.ejemplo.MainView;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import lombok.extern.log4j.Log4j2;
/**
 *
 * @author ferna
 */
@Log4j2
@Route(value = "PruebaGrid", layout = MainView.class)        



public class PruebaGrid extends HorizontalLayout{

    public PruebaGrid() {
        Grid<String> grid = new Grid<>();
        grid.addColumn(String::toUpperCase).setHeader("Nombre").setAutoWidth(true);
        grid.addColumn(String::length).setHeader("Longitud").setAutoWidth(true);
        grid.setItems("John", "Anna", "Alice", "Bob");

        // Crear un Layout Vertical
        VerticalLayout layout = new VerticalLayout();

        // Agregar el Grid al Layout Vertical
        layout.add(grid);

        // Agregar el Layout al contenido de la vista
        add(layout);
    }
    
}
