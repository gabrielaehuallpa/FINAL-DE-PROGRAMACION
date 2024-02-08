package app;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerHabitaciones {

    @GetMapping("/")
    public String index() {
        // Devuelve el nombre de la vista que quieres mostrar
        return "index";
    }
    @GetMapping("/VistaDeAlumnose")
    public String VistaDeAlumnos () {
        // Devuelve el nombre de la vista que quieres mostrar
        return "VistaDeAlumnos";
    }

    @GetMapping("/formularioAlumnos")
    public String formularioAlumno () {
        // Devuelve el nombre de la vista que quieres mostrar
        return "formularioAlumno.html";
    }
}