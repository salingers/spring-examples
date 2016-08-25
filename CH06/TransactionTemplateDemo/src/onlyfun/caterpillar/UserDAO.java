package onlyfun.caterpillar;

import org.hibernate.SessionFactory;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.
          support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;
import org.springframework.orm.
            hibernate3.HibernateTransactionManager;

public class UserDAO implements IUserDAO {
    private TransactionTemplate transactionTemplate;
    private HibernateTemplate hibernateTemplate;

    public void setSessionFactory(
            SessionFactory sessionFactory) {
        this.transactionTemplate = 
            new TransactionTemplate(
                    new HibernateTransactionManager(
                            sessionFactory));  
        this.hibernateTemplate = 
            new HibernateTemplate(sessionFactory);
    } 
    
    public void insert(User user) {
        final User userData = user;
        // 設定傳播行為
        transactionTemplate.setPropagationBehavior(
                TransactionDefinition.PROPAGATION_REQUIRED);
        
        transactionTemplate.execute(
          new TransactionCallbackWithoutResult() {
                protected void doInTransactionWithoutResult(
                        TransactionStatus status) {
                    hibernateTemplate.save(userData);
                }
            }); 
    }

    public User find(Integer id) {
        User user = (User) hibernateTemplate.get(User.class, id);
        
        return user;
    }
}
