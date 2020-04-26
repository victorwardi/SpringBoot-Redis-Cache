package run.victor.rediscache.calendario;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.StopWatch;

import static java.lang.Thread.sleep;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Victor Wardi - @victorwardi
 */
@SpringBootTest
class CalendarioServiceTest {

    @Autowired
    CalendarioService calendarioService;

    @Test
    void getCalendario() throws InterruptedException {

        String uf = "MG";

        StopWatch stopWatch = new StopWatch("Teste Calendario REDIS");
        stopWatch.start("sem cache");
        calendarioService.getCalendario(uf);
        stopWatch.stop();

        stopWatch.start("sem cache 2");
        calendarioService.getCalendario(uf);
        stopWatch.stop();

        stopWatch.start("sem cache 3");
        calendarioService.getCalendario(uf);
        stopWatch.stop();

        stopWatch.start("com cache");
        calendarioService.getCalendario(uf);
        stopWatch.stop();

        stopWatch.start("com cache 2");
        calendarioService.getCalendario(uf);
        stopWatch.stop();
        stopWatch.start("com cache 3");
        calendarioService.getCalendario(uf);
        stopWatch.stop();
        stopWatch.start("com cache 4");
        calendarioService.getCalendario(uf);
        stopWatch.stop();

//      //  sleep(60000);
//        stopWatch.start("Espera o cache expirar e consulta");
//        calendarioService.getCalendario(uf);
//        stopWatch.stop();

        System.out.println("Total time in milliseconds for all tasks :\n"+stopWatch.getTotalTimeMillis());
        System.out.println("Table describing all tasks performed :\n"+stopWatch.prettyPrint());





    }
}