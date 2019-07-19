package co.com.sura.maestros.web;

import co.com.sura.maestros.maestros.MaestrosUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("maestros")
@CrossOrigin(value = "*")
public class MaestrosController {

    @Autowired
    private MaestrosUseCase maestrosUseCase;

}
