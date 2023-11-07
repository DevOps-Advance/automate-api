package co.istad.automate.automate.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/automate")
public class AutomateRestController {

    @GetMapping
    List<AutomateDto> findAllAutomate(){
        List<AutomateDto> automateDtos = new ArrayList<>(){{
            add(new AutomateDto(1,"Hello world"));
        }};
        return automateDtos;
    };
}
