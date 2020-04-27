package run.victor.rediscache.calendario;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Victor Wardi - @victorwardi
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CorridaDTO implements Serializable {

    private String id;
    private String slug;
    private String titulo;

}
