package pdf;

import com.ejemplo.MainView;
import com.itextpdf.kernel.colors.DeviceRgb;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.borders.Border;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.properties.TextAlignment;
import com.vaadin.componentfactory.pdfviewer.PdfViewer;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.StreamResource;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import lombok.extern.log4j.Log4j2;
import org.apache.commons.io.FileUtils;

@Log4j2
@Route(value = "ControlSensoresPDF", layout = MainView.class)
public class ControlSensoresPDF extends VerticalLayout {

    // private String TABLACARDIOpdf ="C:\\temp\\ficherosPDFvaadin\\TablaCribado.pdf";
    private String CONTROLESSENSORESpdf = "TablaCribado.pdf";

    public ControlSensoresPDF() {
        int bb = 0;
    }

    public ControlSensoresPDF(ArrayList<String> arrPacientes) {
        log.info("Inicio de generar la PDF Cribado");
        H1 titulo = new H1("Generando Fichero Cribado");
        this.add(titulo);
        try {
            File fileTablaCribado = new File(CONTROLESSENSORESpdf);
            PdfWriter pdfWriteTablaCribado = new PdfWriter(fileTablaCribado);
            PdfDocument pdfDocumento = new PdfDocument(pdfWriteTablaCribado);
            pdfDocumento.setDefaultPageSize(com.itextpdf.kernel.geom.PageSize.A4.rotate());

            Document documento = new Document(pdfDocumento);
            Paragraph tituloDocumento = getTituloDocumento();
            Table tablaTitulos = getTablaTitulos();
            Table tablaDocumento = getTabla(arrPacientes);
            documento.add(tituloDocumento);
            documento.add(tablaTitulos);
            documento.add(tablaDocumento);
            documento.close();
            muestraPDF();

        } catch (FileNotFoundException ex) {
            log.error("Error generando PDF Cribado");
            Logger.getLogger(TensionArterialPDF.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private Paragraph getTituloDocumento() {
        Paragraph parrafo = new Paragraph();
        parrafo.add("CONTROL SENSORES:");
        parrafo.setBold();
        return parrafo;
    }

    private Table getTabla(ArrayList<String> arrPacientes) {
        float[] pointColumnWidths = {60F, 110F, 300F, 100F, 100F, 200F};
        Table tablaDocumento = new Table(pointColumnWidths);
        for (int i = 0; i < 16; i++) {
            String nombrePaciente = "";
            if (i < 10) {
                nombrePaciente = arrPacientes.get(i);
            }
            //tablaDocumento.addCell("").setHeight(50);
            for (int j = 0; j < 6; j++) {
                if (j == 2) {
                    tablaDocumento.addCell(nombrePaciente).setHeight(580).setBackgroundColor(new DeviceRgb(255, 255, 255));
                } else {
                    tablaDocumento.addCell("").setHeight(580).setBackgroundColor(new DeviceRgb(255, 255, 255));
                }
            }

        }

        return tablaDocumento;
    }

    private void muestraPDF() {

        PdfViewer pdfViewer = new PdfViewer();

        /*  
    //StreamResource resource = new StreamResource("prueba2.pdf", () -> getClass().getResourceAsStream("c:\\temp\\prueba2.pdf"));
    //pdfViewer.setSrc(resource);
    pdfViewer.setSrc("/temp/prueba2.pdf");
         */
        //StreamResource resource = new StreamResource("C:\\temp\\ficherosPDFvaadin\\TablaCribado.pdf", () -> crearRecurso(TABLACARDIOpdf));
        StreamResource resource = new StreamResource("TablaCribado.pdf", () -> crearRecurso(CONTROLESSENSORESpdf));
        pdfViewer.setAddPrintButton(true);
        pdfViewer.setSrc(resource);
        this.add(pdfViewer);

    }

    private InputStream crearRecurso(String pathname) {
        try {
            File path = new File(pathname);
            return FileUtils.openInputStream(path);
        } catch (Exception ex) {
        }
        return null;
    }

    private Table getTablaTitulos() {
        float[] pointColumnWidths = {60F, 110F, 300F, 100F, 100F, 200F};
        Table tablaTitulos = new Table(pointColumnWidths);
        tablaTitulos.setBorder(Border.NO_BORDER);
        tablaTitulos.setFixedLayout();
        tablaTitulos.addCell("Ord.").setBold().setBackgroundColor(new DeviceRgb(135, 206, 250));
        tablaTitulos.addCell("HISTORIA").setBold().setBackgroundColor(new DeviceRgb(135, 206, 250));
        tablaTitulos.addCell("NOMBRE").setBold().setBackgroundColor(new DeviceRgb(135, 206, 250));
        tablaTitulos.addCell("SOLICITADO").setTextAlignment(TextAlignment.CENTER).setBold().setBackgroundColor(new DeviceRgb(135, 206, 250));;
        tablaTitulos.addCell("RESULTADOS").setTextAlignment(TextAlignment.CENTER).setBold().setBackgroundColor(new DeviceRgb(135, 206, 250));
        tablaTitulos.addCell("OBSERVACION").setTextAlignment(TextAlignment.CENTER).setBold().setBackgroundColor(new DeviceRgb(135, 206, 250));

        return tablaTitulos;
    }

}
