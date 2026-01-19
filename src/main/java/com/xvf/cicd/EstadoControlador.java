package com.xvf.cicd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class EstadoControlador {

    @GetMapping("/api/estado")
    public Map<String, Object> estado() {
        return Map.of(
                "estado", "OK",
                "servicio", "xvf-act2-AN-app",
                "mensaje", "API operativa"
        );
    }
}