/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;



/**
 *
 * @author rafaelm
 */
public class TestFrijolitoDao {
    
    public TestFrijolitoDao() {
    }
    
    @Test
    public void hello(){
        
        FrijolitoDao frijolitoDao = new FrijolitoDao();
        Frijolito frijolito = new Frijolito("uno","dos","tres");

        frijolitoDao.saveFrijolito(frijolito);

        System.out.println(frijolitoDao.getFrijolitoPorId(1).getColor());
        frijolito = new Frijolito("otro","color","ymarca");
        boolean si = frijolitoDao.updatebyId(1, frijolito);
        System.out.println(si);
    }
}
