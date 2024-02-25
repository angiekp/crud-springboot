
package prueba.crud_spring.view;

import org.springframework.data.repository.CrudRepository;
import prueba.crud_spring.model.mPersona;


public interface vPersona extends CrudRepository<mPersona, Integer>{
    
}
