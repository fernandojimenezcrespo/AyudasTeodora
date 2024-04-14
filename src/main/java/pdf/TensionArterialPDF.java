/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pdf;

 
import com.ejemplo.MainView;
import com.itextpdf.kernel.colors.DeviceRgb;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.properties.TextAlignment;
import com.vaadin.componentfactory.pdfviewer.PdfViewer;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.StreamResource;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import lombok.extern.log4j.Log4j2;
import org.apache.commons.io.FileUtils;

/**
 *
 * @author 06553669A
 */
@Log4j2
@Route(value = "TensionArterialPDF", layout = MainView.class)
public class TensionArterialPDF extends VerticalLayout{
   // private String TABLACARDIOpdf ="C:\\temp\\ficherosPDFvaadin\\TablaCardio.pdf";
    private String TABLACARDIOpdf ="TablaCardio.pdf";

    public TensionArterialPDF() {
        log.info("Acabo de entrar en el modulo PdfTabla");
        H1 titulo= new H1("Generando Fichero Tensión Arterial");
        add(titulo);
        try {
            File fileTablaCardio = new File(TABLACARDIOpdf);
            PdfWriter pdfWriteTablaCardio = new PdfWriter(fileTablaCardio);
            PdfDocument pdfDocumento = new PdfDocument(pdfWriteTablaCardio);
            pdfDocumento.setDefaultPageSize(com.itextpdf.kernel.geom.PageSize.A4.rotate());

            Document documento=new Document(pdfDocumento);
            Paragraph tituloDocumento=getTituloDocumento();
            Table tablaTitulos=getTablaTitulos(); 
            Table tablaDocumento=getTabla();
            documento.add(tituloDocumento );
            documento.add(tablaTitulos);
            documento.add(tablaDocumento);
            documento.close();
            muestraPDF();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TensionArterialPDF.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private Paragraph getTituloDocumento() {
        Paragraph parrafo= new Paragraph();
        parrafo.add("CONTROL DE LA TENSIÓN ARTERIAL Y LA FRECUENCIA CARDIACA DEL PACIENTE:");
        return parrafo;
    }

    private Table getTabla() {
        float[] pointColumnWidths={60F,200F,200F,200F,200F};
        Table tablaDocumento= new Table(pointColumnWidths);
      for (int i = 0; i < 11; i++) {
            //tablaDocumento.addCell("").setHeight(50);
            for (int j=0;j<5;j++)
            tablaDocumento.addCell("").setHeight(280).setBackgroundColor(new DeviceRgb(255,255,255));
            
        }
        
        return tablaDocumento;
    }

  private void muestraPDF()
  {
      
      PdfViewer pdfViewer = new PdfViewer();
      /*  
    //StreamResource resource = new StreamResource("prueba2.pdf", () -> getClass().getResourceAsStream("c:\\temp\\prueba2.pdf"));
    //pdfViewer.setSrc(resource);
    pdfViewer.setSrc("/temp/prueba2.pdf");
    */
    //StreamResource resource = new StreamResource("C:\\temp\\ficherosPDFvaadin\\TablaCardio.pdf", () -> crearRecurso(TABLACARDIOpdf));
        StreamResource resource = new StreamResource("TablaCardio.pdf", () -> crearRecurso(TABLACARDIOpdf));
        
    pdfViewer.setSrc(resource);
            add(pdfViewer);
    
        
        
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
        float[] pointColumnWidths={60F,200F,200F,200F,200F};
        Table tablaTitulos= new Table(pointColumnWidths);
        tablaTitulos.addCell("Ord.").setBold().setBackgroundColor(new DeviceRgb(135, 206, 250));
        tablaTitulos.addCell("FECHA").setBold().setBackgroundColor(new DeviceRgb(135, 206, 250));
        tablaTitulos.addCell("HORA").setBold().setBackgroundColor(new DeviceRgb(135, 206, 250));
        tablaTitulos.addCell("TENSIÓN ARTERIAL").setTextAlignment(TextAlignment.CENTER).setBold().setBackgroundColor(new DeviceRgb(135, 206, 250));;
        tablaTitulos.addCell("FRECUENCIA CARDIACA").setTextAlignment(TextAlignment.CENTER).setBold().setBackgroundColor(new DeviceRgb(135, 206, 250));
        return tablaTitulos;
    }
    
}

  
    
