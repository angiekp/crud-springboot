
package prueba.crud_spring.interfaceService;

import java.util.List;
import java.util.Optional;
import prueba.crud_spring.model.mTipoPersona;


public interface iSTipoPersona {
  public List<mTipoPersona>listarTP();
  
    public Optional<mTipoPersona>listarIdTP(int id);
    //guardar,actualizar,eliminar
    
    public int saveTP(mTipoPersona mTP);
    
   
    public void deleteTP (int id );
}
