package fr.lernejo.travelsite;
import org.springframework.web.bind.annotation.*;

@RestController
public class ApiController{

@PostMapping(value = "/api/inscription")
public Registration add(@RequestBody Registration registration){
    return registration;
}

}
