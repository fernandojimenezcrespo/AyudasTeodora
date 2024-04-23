package txt;

import beans.TextosBean;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.theme.lumo.LumoUtility;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import lombok.extern.log4j.Log4j2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ferna
 */
@Log4j2
public class DameTextosTXT {

    public DameTextosTXT() {

    }

    public ArrayList<String> DameTextosTXT(String opcion) {
        ArrayList<String> arrLineas = new ArrayList<>();
        String rutaArchivo = "C:\\tmp\\AyudasTeodora\\Ayudas" + opcion + ".txt";

        // Crear objeto File con la ruta del archivo
        File archivo = new File(rutaArchivo);

        try {
            // Crear FileReader para leer el archivo
            FileReader ficheroReader = new FileReader(archivo);
            // Crear BufferedReader para leer líneas de texto eficientemente
            BufferedReader bufferReader = new BufferedReader(ficheroReader);

            // Variable para almacenar la línea leída
            String linea;
            TextosBean textosBean = new TextosBean();
            
            // Leer cada línea del archivo hasta llegar al final
            while ((linea = bufferReader.readLine()) != null) {
                // Imprimir la línea leída
                 

                arrLineas.add(linea);
            }
          
            // Cerrar BufferedReader y FileReader
            bufferReader.close();
            ficheroReader.close();
        } catch (IOException e) {
            // Manejo de excepciones en caso de error de lectura
            e.printStackTrace();
            log.error("HA OCURRIDO UN ERROR EN EL MODULO DameTextosTXT.java y ha sigo: " + e);
        }
        return arrLineas;
    }

}
