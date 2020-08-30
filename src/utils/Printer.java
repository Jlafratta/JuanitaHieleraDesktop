package utils;

import java.awt.*;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;

public class Printer implements Printable {

   private FactoryPDF GeneradorPdf;

    public Printer(FactoryPDF generadorPdf) {
        GeneradorPdf = generadorPdf;
    }

    @Override
    public int print (Graphics g, PageFormat f, int pageIndex)
    {
        if (pageIndex == 0)
        {

            return PAGE_EXISTS;
        }
        else
            return NO_SUCH_PAGE;
    }


}
