
package prueba.crud_spring.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import prueba.crud_spring.interfaceService.iSTipoPersona;
import prueba.crud_spring.model.mTipoPersona;
import prueba.crud_spring.view.vTipoPersona;

@Service
public class sTipoPersona implements iSTipoPersona{
    // variable se llama para diferenciar las tablas
    @Autowired
    private vTipoPersona vtp;

    @Override
    public List<mTipoPersona> listarTP() {
        return(List<mTipoPersona>)vtp.findAll();
    }

    @Override
    public Optional<mTipoPersona> listarIdTP(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int saveTP(mTipoPersona mTP) {
        int res=0;
        mTipoPersona mTipoPerson=vtp.save(mTP);
       if(!mTipoPerson.equals(null)){ 
           res=1;
       }
       
    return res; 
    }

    @Override
    public void deleteTP(int id) {
        vtp.deleById(id);
    }
    
}
