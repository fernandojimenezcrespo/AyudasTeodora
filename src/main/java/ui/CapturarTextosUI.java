/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import beans.TextosBean;
import com.ejemplo.MainView;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.grid.Grid.Column;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.radiobutton.RadioButtonGroup;
import com.vaadin.flow.data.renderer.ComponentRenderer;
import com.vaadin.flow.router.Route;
import java.util.ArrayList;
import lombok.extern.log4j.Log4j2;
import txt.DameTextosTXT;

/**
 *
 * @author ferna
 */
@Log4j2
@Route(value = "CapturarTextosUI", layout = MainView.class)

public class CapturarTextosUI extends VerticalLayout {

    RadioButtonGroup<String> radioGroup = new RadioButtonGroup<>();
    Grid<String> gridTextos = new Grid<>();

    public CapturarTextosUI() {
        H2 h2Texto = new H2("TEXTOS.");
        cargaOpcionesMenu();

        gridTextos.addColumn(String::toString).setHeader("Textos").setAutoWidth(true);
        gridTextos.setItems("TEXTO FUTURO");
        add(gridTextos);

    }

    private void cargaOpcionesMenu() {

        //radioGroup.addThemeVariants(RadioGroupVariant.LUMO_VERTICAL);
        radioGroup.setLabel("Opciones de ");
        radioGroup.setItems("Cirugía Menor", "Procedimientos", "Curas");
        HorizontalLayout lytOpciones = new HorizontalLayout();
        lytOpciones.add(radioGroup);
        radioGroup.addValueChangeListener(e -> {
            cargaTextosMenu(e.getValue());
        });
        this.add(lytOpciones);
    }

    private void cargaTextosMenu(String opcion) {
        DameTextosTXT dameTextosTXT = new DameTextosTXT();
        HorizontalLayout lytOpciones = new HorizontalLayout();

        if (opcion.equals("Curas")) {
            ArrayList<String> arrTextos = new ArrayList<>();
            arrTextos = dameTextosTXT.DameTextosTXT(opcion);
            gridTextos.setItems();
            gridTextos.setItems(arrTextos);
            //Column<> nuevaColumna = gridTextos.addColumn(item -> new VaadinIcon().COPY.create());
            gridTextos.addColumn(new ComponentRenderer<>(item -> new Icon(VaadinIcon.COPY))).setHeader("Icono").setAutoWidth(true);
        // Configurar la nueva columna si es necesario
       // nuevaColumna.setHeader("Copiar");

        // Actualizar el Grid para que muestre la nueva columna
        gridTextos.getDataProvider().refreshAll();

        }
        if (opcion.equals("Procedimientos")) {
            ArrayList<String> arrTextos = new ArrayList<>();
            arrTextos = dameTextosTXT.DameTextosTXT(opcion);
            gridTextos.setItems();
            gridTextos.setItems(arrTextos);

        }

    }
}
