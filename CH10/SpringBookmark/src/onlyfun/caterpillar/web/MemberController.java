package onlyfun.caterpillar.web;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import onlyfun.caterpillar.model.IBookmarkDAO;
import onlyfun.caterpillar.model.IUserDAO;
import onlyfun.caterpillar.model.User;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.
                  multiaction.MultiActionController;
import org.springframework.web.servlet.view.RedirectView;

public class MemberController extends MultiActionController {
    private IBookmarkDAO bookmarkDAO;
    private IUserDAO userDAO;
    private String memberPage;
    private String addBmPage;
    private String passwdPage;
    private String redirectPage;
    
    // 顯示個人書籤
    public ModelAndView displayUrl(HttpServletRequest req, 
                                HttpServletResponse res) {
        String username = 
          (String) req.getSession().getAttribute("valid_user");
        
        if(username != null) {
            // 根據使用者名稱查找書籤
            List urls = 
               getBookmarkDAO().findUserUrl(username);
            return new ModelAndView(
                    this.getMemberPage(), "urls", urls);     
        }
        else {
            return new ModelAndView(
                    new RedirectView(getRedirectPage()));
        }
    }
    
    // 加入新的書籤
    public ModelAndView addUrl(HttpServletRequest req, 
                             HttpServletResponse res) {
        String username = 
            (String) req.getSession().getAttribute("valid_user");
        
        if(username != null) {
            if(req.getParameter("new_url") != null) {
                String url = (String) req.getParameter("new_url");
                // 加入新的書籤網址
                getBookmarkDAO().addUserUrl(username, url);
                return displayUrl(req, res);
            }
            else {
                return new ModelAndView(this.getAddBmPage());
            }   
        }
        else {
            return new ModelAndView(
                    new RedirectView(getRedirectPage()));
        }        
    }
    
    // 刪除所選擇的書籤
    public ModelAndView deleteUrl(HttpServletRequest req, 
                               HttpServletResponse res) {
        String username = 
          (String) req.getSession().getAttribute("valid_user");
        
        if(username != null) {
            if(req.getParameterValues("del_me") != null) {
                String[] deleted_urls =
                    (String[]) req.getParameterValues("del_me");
                // 刪除所指定的書籤
                getBookmarkDAO().deleteUserUrls(username, deleted_urls); 
                return displayUrl(req, res);
            }
            else {
                return new ModelAndView(this.getAddBmPage());
            }   
        }
        else {
            return new ModelAndView(
                    new RedirectView(getRedirectPage()));
        }
    }
    
    // 改變密碼
    public ModelAndView changePasswd(HttpServletRequest req, 
                                    HttpServletResponse res) {
        String username = 
                (String) req.getSession().getAttribute("valid_user");
        
        if(username != null) {
            if(req.getParameter("new_passwd") != null) {
                String passwd = req.getParameter("new_passwd");
                User user = getUserDAO().findByName(username);
                user.setPasswd(passwd);
                getUserDAO().update(user);
                return displayUrl(req, res);
            }
            else {
                return new ModelAndView(this.getPasswdPage());
            }
        }
        else {
            return new ModelAndView(
                    new RedirectView(getRedirectPage()));
        }
    }
    
    // 登出
    public ModelAndView logout(HttpServletRequest req, 
                             HttpServletResponse res) {
        req.getSession().invalidate();
        return new ModelAndView(
                new RedirectView(getRedirectPage()));
    }
    
    public void setBookmarkDAO(IBookmarkDAO bookmarkDAO) {
        this.bookmarkDAO = bookmarkDAO;
    }
    
    public IBookmarkDAO getBookmarkDAO() {
        return bookmarkDAO;
    }

    public void setUserDAO(IUserDAO userDAO) {
        this.userDAO = userDAO;
    }
    
    public IUserDAO getUserDAO() {
        return userDAO;
    }
    
    public String getMemberPage() {
        return memberPage;
    }
    
    public void setMemberPage(String memberPage) {
        this.memberPage = memberPage;
    }

    public String getAddBmPage() {
        return addBmPage;
    }
    
    public void setAddBmPage(String addBmPage) {
        this.addBmPage = addBmPage;
    }
    
    public String getPasswdPage() {
        return passwdPage;
    }
    
    public void setPasswdPage(String passwdPage) {
        this.passwdPage = passwdPage;
    }

    public String getRedirectPage() {
        return redirectPage;
    }

    public void setRedirectPage(String redirectPage) {
        this.redirectPage = redirectPage;
    }
}
