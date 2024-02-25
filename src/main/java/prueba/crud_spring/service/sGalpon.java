package prueba.crud_spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import prueba.crud_spring.interfaceService.isGalpon;
import prueba.crud_spring.model.mGalpon;
import prueba.crud_spring.model.mPersona;

import java.util.List;
import java.util.Optional;

@Service
public class sGalpon implements isGalpon {
    @Autowired
    private vGalpon vg;

    @Override
    public List<mGalpon> listar() {
        return(List<mgalpon>)vg.findAll();
    }
    @Override
    public Optional<mgalpon> listarId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    @Override
    public int save(mGalpon mG) {
        int res = 0;
        mGalpon mGalpon=vg.save(mP);
        if(!mGalpon.equals(null)){
            res =1;
        }
        return res;
    }
    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }



}
