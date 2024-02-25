 
package prueba.crud_spring.controller;
 
import prueba.crud_spring.interfaceService.iSPersona;
import prueba.crud_spring.model.mPersona;
        
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestMapping;





@Controller
@RequestMapping
public class controlador {
    
    @Autowired
    private iSPersona service;
    
    @GetMapping("/listar")
  public String listar (Model model){
      List<mPersona> mPersonas= service.listar();
      model.addAttribute("mPersonas", mPersonas); 
      return"indexP";
   
  }
   
  @GetMapping("/new")
  public String agregar(Model model){
    model.addAttribute("mPersona", new mPersona());
    return "insertar";
    
  }
  @PostMapping("/save")
  public String Guardar(mPersona mp, Model model){
  service.save(mp);
  return "redirect:/listar";
  
  }
  @PostMapping("/eliminar/(id)")
  public String delete(Model model, @PathVariable int id){
    service.delete(id);
    return "redirec:/listar";
}

  }
         

    