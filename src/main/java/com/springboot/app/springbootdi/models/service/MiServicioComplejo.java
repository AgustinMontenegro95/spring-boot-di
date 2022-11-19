package com.springboot.app.springbootdi.models.service;

import org.springframework.stereotype.Component;

//@Component("miServicioComplejo")
public class MiServicioComplejo implements IServicio{

    @Override
    public String operacion() {
        return "ejecutando algun proceso importante complicado...";
    }

    
    
}
