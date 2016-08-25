package onlyfun.caterpillar;

import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class PdfController implements Controller {
    public ModelAndView handleRequest(HttpServletRequest req, 
                        HttpServletResponse res) throws Exception {
        Map model = new HashMap();
        model.put("header", "Pdf View Test");
        model.put("content", "This is content for pdf view test.");
        model.put("copyright", "caterpillar.onlyfun.net");
        
        return new ModelAndView("customPdfView", model);
    }
}
