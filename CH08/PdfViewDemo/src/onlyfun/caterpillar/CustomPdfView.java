package onlyfun.caterpillar;

import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfWriter;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.
                  view.document.AbstractPdfView;

public class CustomPdfView extends AbstractPdfView {
    protected void buildPdfDocument(Map model, 
                        Document document,
                        PdfWriter writer, 
                        HttpServletRequest request,
                        HttpServletResponse response) 
                                      throws Exception {
        String header = (String) model.get("header");

        Paragraph headerParagraph = 
                     new Paragraph(header);
        headerParagraph.font().setSize(20);
        document.add(headerParagraph);

        String content = (String) model.get("content");
        Paragraph contentParagraph = 
                        new Paragraph(content);
        document.add(contentParagraph);
    
        String copyright = (String) model.get("copyright");
        Paragraph copyrightParagraph = 
                              new Paragraph(copyright);
        copyrightParagraph.setAlignment(
                               Paragraph.ALIGN_BOTTOM);
        document.add(copyrightParagraph);
    }
}