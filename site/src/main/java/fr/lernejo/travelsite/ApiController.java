package fr.lernejo.travelsite;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

@RestController
public class ApiController {
    private final ArrayList<PotentialDestinations> travel = new ArrayList<>();

    @PostMapping(value = "/api/inscription")
    public Registration add(@RequestBody Registration registration) {
        return registration;
    }

    @GetMapping(value = "/api/{userName}")
    public Iterable<PotentialDestinations> Travel(@RequestParam String userName) {
        ArrayList<PotentialDestinations> travel = new ArrayList<>();
        travel.add(new PotentialDestinations("Carribean", 32.4));
        travel.add(new PotentialDestinations("Australia", 35.1));
        return travel;
    }
}
