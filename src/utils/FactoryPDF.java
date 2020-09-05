package utils;


import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.*;
import com.itextpdf.layout.property.TabAlignment;
import com.itextpdf.layout.property.TextAlignment;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.printing.PDFPageable;


import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;


public class FactoryPDF {

    //Destino Carpeta




    public FactoryPDF() {
    }

    public String GenerarRutaPdf(int ticketId)
    {
        String Destiny="C:\\Users\\Public\\Documents\\"+"TicketN-"+ticketId+".pdf";
        return Destiny;
    }


    public void GenerarPdf(String DES,int ticketId,String productName,float pesoBrutoCant,String clientName,float taraCant,String patentClient,float pesoNetoCant, String ticketDate) throws FileNotFoundException {

        int value = 132323;
        PdfWriter writer = new PdfWriter(DES);
        PdfDocument pdf= new PdfDocument(writer);
        Document document =new Document(pdf, PageSize.A4);
        Paragraph TicketValue = new Paragraph("Ticket:"+ticketId);

        Paragraph Leyend = new Paragraph("Comprobante de Pesada"+"\n"+"Para uso Interno");

        Paragraph Space=new Paragraph("\n");

        //Producto y Peso Bruto
        Paragraph Line1 = new Paragraph("Producto:"+ productName);
        Line1.add(new Tab());
        Line1.addTabStops(new TabStop(1000, TabAlignment.RIGHT));
        Line1.add("Peso Bruto:"+pesoBrutoCant);

        //Cliente y Tara
        Paragraph Line2 = new Paragraph("Cliente:"+clientName);
        Line2.add(new Tab());
        Line2.addTabStops(new TabStop(1000, TabAlignment.RIGHT));
        Line2.add("Tara:"+taraCant);

        //Patente y Peso Neto
        Paragraph Line3 = new Paragraph("Patente:"+patentClient);
        Line3.add(new Tab());
        Line3.addTabStops(new TabStop(1000, TabAlignment.RIGHT));
        Line3.add("Peso Neto:"+pesoNetoCant);

        //Fecha y Firma
        Paragraph Line4 = new Paragraph("Fecha:"+ticketDate);
        Line4.add(new Tab());
        Line4.addTabStops(new TabStop(1000, TabAlignment.RIGHT));
        Line4.add("Firma:.......................");


        //Settings Paragraphs
        TicketValue.setTextAlignment(TextAlignment.CENTER).setFontSize(24);
        Leyend.setTextAlignment(TextAlignment.RIGHT).setFontSize(8);


        //Add paragraphs to the document
        document.add(TicketValue);
        document.add(Leyend).add(Space);
        document.add(Line1);
        document.add(Line2);
        document.add(Line3).add(Space);
        document.add(Line4);





        document.add(TicketValue);
        document.add(Leyend).add(Space);
        document.add(Line1);
        document.add(Line2);
        document.add(Line3).add(Space);
        document.add(Line4);



        document.add(TicketValue);
        document.add(Leyend).add(Space);
        document.add(Line1);
        document.add(Line2);
        document.add(Line3).add(Space);
        document.add(Line4);

        document.close();

    }
    public void ImprimirPdf(String pathFile) throws IOException, PrinterException {
        PDDocument documento = null;

        documento = PDDocument.load(new File(pathFile));
        System.out.println(documento);


        PrinterJob job = PrinterJob.getPrinterJob();
        if (job.printDialog() == true)
        {

            job.setPageable(new PDFPageable(documento));
            job.print();
        }
    }
}
