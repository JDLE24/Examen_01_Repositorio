package examen_01.examen_01.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping
    public String home() {
        return "index";
    }
    @GetMapping("/login/Registrate")
    public String registro() {
        return "/login/registro";
    }
    
    @GetMapping("/comentarios/agregar") 
    public String comentariosAgregar() {
        return "/comentarios/agregar";
    }
    @GetMapping("/comentarios/editar")
    public String comentariosditar() {
        return "/comentarios/editar";
    }
    @GetMapping("/comentarios/eliminar")
    public String comentariosEliminar() {
        return "/comentarios/eliminar";
    }
    @GetMapping("/comentarios")
    public String comentarios() {
        return "/comentarios/comentarios";
    }
}
