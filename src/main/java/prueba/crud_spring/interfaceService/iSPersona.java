
package prueba.crud_spring.interfaceService;

import java.util.List;
import java.util.Optional;
import prueba.crud_spring.model.mPersona;


public interface iSPersona {
  public List<mPersona>listar();
    public Optional<mPersona>listarId(int id);
    //guardar,actualizar,eliminar
    public int save(mPersona mP);
    public void delete (int id );
}
