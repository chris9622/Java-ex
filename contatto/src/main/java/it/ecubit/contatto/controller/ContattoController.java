package it.ecubit.contatto.controller;

import it.ecubit.contatto.model.Contatto;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.List;



@Controller
public class ContattoController {

    private List<Contatto> contatti= new ArrayList<>();


    @GetMapping("/contatti")
    public String home(Model model){
        model.addAttribute("contatto",new Contatto());
        return "Rubrica";
    }


    @PostMapping("/contatti/add")
    public String aggiungiContatto(@Valid @ModelAttribute Contatto contatto, BindingResult bindingResult){
        contatti.add(new Contatto(contatto.getId(), contatto.getUtente(),contatto.getTelefono()));
                if(bindingResult.hasErrors()){
                    return "rubrica";
                }
        return "result";
    }


    @GetMapping("/contatti/add")
    public String getAll(Model model){
        model.addAttribute("contatti",contatti);
        return "result";
    }

    @GetMapping("/contatti/{id}")
    public String getOne(@PathVariable long id, Model model){
        for(Contatto c: contatti){
            if(c.getId()==id){
                model.addAttribute("one",c.getUtente());
                return "result";
            }
        } throw new RuntimeException();
    }

    @GetMapping("/contatti/{id}/delete")
    public String deleteOne(@PathVariable long id){
        for(Contatto c:contatti){
            if(c.getId()==id){
                contatti.remove(c);
                return "delete";
            }
        }throw new RuntimeException();
    }

    @GetMapping("/contatti/update")
    public String getUpdate(){
        return "update";
    }

    @PostMapping("/contatti/{id}/update")
    public String update(@PathVariable long id, @Valid @ModelAttribute Contatto contatto, BindingResult bindingResult){

        for(Contatto c: contatti){
            if(c.getId()!=id){
               bindingResult.hasErrors();
               return "update";
            }else{
                c.setUtente(contatto.getUtente());
                c.setTelefono(contatto.getTelefono());
            }
        }
        return "result";

    }







}
