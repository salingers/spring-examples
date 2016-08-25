package onlyfun.caterpillar.model;

import java.util.List;
import org.springframework.orm.hibernate3.HibernateTemplate;

public class BookmarkDAO implements IBookmarkDAO {
    private HibernateTemplate hibernateTemplate;

    public void setHibernateTemplate(
            HibernateTemplate hibernateTemplate) { 
        this.hibernateTemplate = hibernateTemplate;
    }
    
    public List findUserUrl(String username) {
        List list= hibernateTemplate.find(
          "select bm.url from Bookmark as bm where bm.username='"
                + username + "'");
        return list;
    }
    
    public void addUserUrl(String username, String url) {
        Bookmark bm = new Bookmark();
        bm.setUsername(username);
        bm.setUrl(url);
        hibernateTemplate.saveOrUpdate(bm);
    }
    
    public void deleteUserUrls(
            String username, String[] urls) {
        for(int i = 0; i < urls.length; i++) {
            List list = hibernateTemplate.find(
                    "from Bookmark bm where (bm.username='" 
                    + username + 
                    "') and (bm.url='" + urls[i]+ "')");
            hibernateTemplate.delete(list.get(0));
        }
    }
} 
