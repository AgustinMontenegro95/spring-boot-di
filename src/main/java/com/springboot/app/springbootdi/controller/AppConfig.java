package com.springboot.app.springbootdi.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.springboot.app.springbootdi.models.domain.ItemFactura;
import com.springboot.app.springbootdi.models.domain.Producto;
import com.springboot.app.springbootdi.models.service.IServicio;
import com.springboot.app.springbootdi.models.service.MiServicio;
import com.springboot.app.springbootdi.models.service.MiServicioComplejo;

@Configuration
public class AppConfig {
    
    @Bean("miServicioSimple")
    @Primary
    public IServicio registrarMIServicio(){
        return new MiServicio();
    }

    @Bean("miServicioComplejo")
    public IServicio registrarMIServicioComplejo(){
        return new MiServicioComplejo();
    }

    @Bean("itemsFactura")
    @Primary
    public List<ItemFactura> registrarItems(){
        Producto producto1 = new Producto("Camara Sony", 100);
        Producto producto2 = new Producto("Bicicleta aro 26", 200);

        ItemFactura linea1 = new ItemFactura(producto1, 2);
        ItemFactura linea2 = new ItemFactura(producto2, 4);

        return Arrays.asList(linea1,linea2);
    }

    @Bean("itemsFacturaOficina")
    public List<ItemFactura> registrarItemsOficina(){
        Producto producto1 = new Producto("Monitor LG LCD 24", 250);
        Producto producto2 = new Producto("Notebook asus", 500);
        Producto producto3 = new Producto("Impresora HP", 80);
        Producto producto4 = new Producto("Escritorio Oficina", 300);

        ItemFactura linea1 = new ItemFactura(producto1, 2);
        ItemFactura linea2 = new ItemFactura(producto2, 1);
        ItemFactura linea3 = new ItemFactura(producto3, 1);
        ItemFactura linea4 = new ItemFactura(producto4, 1);

        return Arrays.asList(linea1, linea2, linea3, linea4);
    }
}
