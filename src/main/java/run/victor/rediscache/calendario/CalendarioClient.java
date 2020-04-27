package run.victor.rediscache.calendario;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author Victor Wardi - @victorwardi
 */

@FeignClient(name = "calendario", url = "${api.client.corridaurbana.uri}")
public interface CalendarioClient {

    @Cacheable(value = "calendario", key = "#uf")
    @GetMapping(value="/calendario?estado={uf}",consumes= MediaType.APPLICATION_JSON_VALUE)
    CalendarioDTO calendario(@PathVariable String uf);

}
