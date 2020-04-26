package run.victor.rediscache.calendario;

import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Victor Wardi - @victorwardi
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CalendarioDTO implements Serializable {
    private int total;
    private List<Corrida> corridas;

}
