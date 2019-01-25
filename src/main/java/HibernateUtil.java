import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private static SessionFactory sessionFactory;
    private static final ThreadLocal localSession;

    static{
        try{
            Configuration conf= new Configuration();
            conf.configure("hibernate.cfg.xml");
            StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().
                    applySettings(conf.getProperties());
            sessionFactory = conf.buildSessionFactory(builder.build());
        }catch(Exception ex){
            ex.printStackTrace();
        }
        localSession = new ThreadLocal();

    }

    public static Session getLocalSession(){
        Session session = (Session)localSession.get();
        if(session == null){
            session = sessionFactory.openSession();
            localSession.set(session);
            System.out.println("Session iniciada");
        }
        return session;
    }

    public static void closeLocalSession(){
        Session session = (Session)localSession.get();
        if(session!=null) session.close();
        localSession.set(null);
        System.out.println("Session cerrada");
    }


}
