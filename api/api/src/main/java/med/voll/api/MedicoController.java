package med.voll.api;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @PostMapping
    public void cadastrar(@RequestBody String json){
        System.out.println(json);
    }
}
