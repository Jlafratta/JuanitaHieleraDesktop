package utils;


import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.printing.PDFPageable;

import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.File;
import java.io.IOException;

public class Printer  {

   private FactoryPDF GeneradorPdf;

    public Printer() {
        GeneradorPdf =new FactoryPDF();
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
