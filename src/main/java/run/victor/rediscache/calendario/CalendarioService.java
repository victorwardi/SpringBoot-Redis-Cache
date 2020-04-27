package run.victor.rediscache.calendario;

import java.text.DecimalFormat;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.StopWatch;

/**
 * @author Victor Wardi - @victorwardi
 */

@Service
@Slf4j
public class CalendarioService {

    private final CalendarioClient calendarioClient;

    public CalendarioService(CalendarioClient calendarioClient) {
        this.calendarioClient = calendarioClient;
    }

    public CalendarioDTO getCalendario(String uf) {
        log.info("Buscando dados do Calendario do " + uf);
        StopWatch stopWatch = new StopWatch();
        stopWatch.start("getCalendario");
        CalendarioDTO calendarioDTO = calendarioClient.calendario(uf);
        stopWatch.stop();
        double tempoResposta = stopWatch.getTotalTimeSeconds();
        String tempoRespostaFormatado = new DecimalFormat("#0.00").format(tempoResposta) + "s";
        calendarioDTO.setTempoResposta(tempoRespostaFormatado);
        log.info("Tempo de reposta: " + tempoRespostaFormatado);
        return calendarioDTO;
    }
}
