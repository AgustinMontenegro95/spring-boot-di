package com.springboot.app.springbootdi.models.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component("miServicioSimple")
//@Primary
public class MiServicio implements IServicio{

    @Override
    public String operacion() {
        return "ejecutando algun proceso importante simple...";
    }


    
}
