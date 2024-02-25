
package prueba.crud_spring.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import prueba.crud_spring.interfaceService.iSPersona;
import prueba.crud_spring.model.mPersona;
import prueba.crud_spring.view.vPersona;

@Service
public class servPersona implements iSPersona{
    
    @Autowired
    private vPersona vp;

    @Override
    public List<mPersona> listar() {
        return(List<mPersona>)vp.findAll();
    }

    @Override
    public Optional<mPersona> listarId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int save(mPersona mP) {
        int res=0;
        mPersona mPerson=vp.save(mP);
       if(!mPerson.equals(null)){ 
           res=1;
       }
       
    return res; 
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
