package prueba.crud_spring.controller;

import ch.qos.logback.core.model.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import prueba.crud_spring.model.mTipoPersona;

import java.util.List;

@Controller
@RequestMapping
public class controllerGalpon {
    @Autowired
    private sGalpon service;
    @GetMapping("/listarG")
    public String listarG (Model model){
        List<mGalpon> mGalpon= service.listarG();
        model.addAttribute("mGalpon", mGalpon);
        return"galpon";
    }
    @GetMapping("/newG")
    public String     agregarG (Model model){
        model.addAtribute("mGAlpon", new mGalpon());
        return "ingresarG";
    }

}
