package com.springboot.app.springbootdi.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.springboot.app.springbootdi.models.service.IServicio;
import com.springboot.app.springbootdi.models.service.MiServicio;
import com.springboot.app.springbootdi.models.service.MiServicioComplejo;

@Configuration
public class AppConfig {
    
    @Bean("miServicioSimple")
    public IServicio registrarMIServicio(){
        return new MiServicio();
    }

    @Bean("miServicioComplejo")
    @Primary
    public IServicio registrarMIServicioComplejo(){
        return new MiServicioComplejo();
    }
}
