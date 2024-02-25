
package prueba.crud_spring.view;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import prueba.crud_spring.model.mTipoPersona;

@Repository
public interface vTipoPersona extends CrudRepository<mTipoPersona, Integer>{

    public void deleById(int id);
    
}
