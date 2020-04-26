package run.victor.rediscache.calendario;

import org.springframework.stereotype.Service;

/**
 * @author Victor Wardi - @victorwardi
 */

@Service
public class CalendarioService {

    private final CalendarioClient calendarioClient;

    public CalendarioService(CalendarioClient calendarioClient) {
        this.calendarioClient = calendarioClient;
    }

    public void getCalendario(String uf){
        CalendarioDTO calendarioDTO = calendarioClient.calendario(uf);
    }
}
