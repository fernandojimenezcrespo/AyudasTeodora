/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import com.ejemplo.MainView;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.charts.model.Label;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.grid.Grid.Column;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.notification.Notification;
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
@JsModule("./js/copytoclipboard.js") //Debes de copiar este fichero en fronted/js/copytoclipboard.js

public class CapturarTextosUI extends VerticalLayout {

    RadioButtonGroup<String> radioGroup = new RadioButtonGroup<>();
    Grid<String> gridTextos = new Grid<>();
    Button btnTextoCopiado = new Button("Pendiente de tener algo copiado");

    public CapturarTextosUI() {
        H2 h2Texto = new H2("TEXTOS.");
        cargaOpcionesMenu();

        gridTextos.addColumn(String::toString).setHeader("Ayudas").setAutoWidth(false);
        gridTextos.setItems("TEXTO FUTURO");
        gridTextos.addItemClickListener(item -> {
            Notification.show(String.format("File location: %s", item.getItem()));
            UI.getCurrent().getPage().executeJs("window.copyToClipboard($0)", item.getItem());
            btnTextoCopiado.setText(item.getItem());
        });

        add(gridTextos);

    }

    private void cargaOpcionesMenu() {

        //radioGroup.addThemeVariants(RadioGroupVariant.LUMO_VERTICAL);
        radioGroup.setLabel("Opciones de ");
        radioGroup.setItems("Cirugía Menor", "Procedimientos", "Curas");
        HorizontalLayout lytTextoCopiado = new HorizontalLayout();
        Icon iconoCopiar = VaadinIcon.COPY_O.create();
        
        btnTextoCopiado.setEnabled(false);
        lytTextoCopiado.add(btnTextoCopiado, iconoCopiar);

        HorizontalLayout lytOpciones = new HorizontalLayout();
        lytOpciones.add(radioGroup, iconoCopiar);
        radioGroup.addValueChangeListener(e -> {
            cargaTextosMenu(e.getValue());
        });
        this.add(lytTextoCopiado, lytOpciones);
    }

    private void cargaTextosMenu(String opcion) {
        DameTextosTXT dameTextosTXT = new DameTextosTXT();
        ArrayList<String> arrTextos = new ArrayList<>();
        gridTextos.setWidthFull();
        if (opcion.equals("Curas")) {

            arrTextos = dameTextosTXT.DameTextosTXT(opcion);
        }

        if (opcion.equals("Procedimientos")) {
            arrTextos = dameTextosTXT.DameTextosTXT(opcion);
        }
        gridTextos.setItems();
        gridTextos.setItems(arrTextos);

    }
}
