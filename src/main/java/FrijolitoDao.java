
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */




import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author rafaelm
 */
public class FrijolitoDao {
    private Session session;

    public FrijolitoDao(){
        session = HibernateUtil.getLocalSession();

    }


    public Frijolito getFrijolitoPorId(int idFrijol){
        return (Frijolito)session.load(Frijolito.class, idFrijol);
    }

    public boolean saveFrijolito(Frijolito frijolito){
       
        try{
            Transaction transaction = session.beginTransaction();
            session.save(frijolito);
            transaction.commit();
            return true;
        }catch(Exception ex){

        }
        return false;
    }

    public boolean updatebyId(int id, Frijolito frijolito){
        Frijolito frijolitoAModificar = getFrijolitoPorId(id);
        try{
            Transaction transaccion = session.beginTransaction();
            frijolitoAModificar.setColor(frijolito.getColor());
            frijolitoAModificar.setMarca(frijolito.getSabor());
            frijolitoAModificar.setSabor(frijolito.getMarca());
            session.update(frijolitoAModificar);

            transaccion.commit();
            HibernateUtil.closeLocalSession();
            return true;
        }catch(Exception ex){

        }
        return false;
    }

    
}
