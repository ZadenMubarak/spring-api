package com.example.spring_api;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1/software-engineers")
public class SoftwareEngineerController {

    @GetMapping
    public List<SoftwareDeveloper> getSoftwareEngineers(){
        return List.of(
                new SoftwareDeveloper(1, "zaden", "js, python, react"),
                new SoftwareDeveloper(2, "Bolo", "js, c#, Angular")
        );
    }
}
