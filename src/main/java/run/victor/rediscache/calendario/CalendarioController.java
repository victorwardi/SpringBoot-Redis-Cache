package run.victor.rediscache.calendario;

import org.springframework.http.HttpStatus;
import org.springframework.util.StopWatch;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Victor Wardi - @victorwardi
 */
@RestController
public class CalendarioController {

    private final CalendarioService calendarioService;

    public CalendarioController(CalendarioService calendarioService) {
        this.calendarioService = calendarioService;
    }

    @GetMapping("/calendario/{uf}")
    @ResponseStatus(HttpStatus.OK)
    public CalendarioDTO getCalentario(@PathVariable String uf){
        CalendarioDTO calendarioDTO = calendarioService.getCalendario(uf);
        return calendarioDTO;
    }
}
