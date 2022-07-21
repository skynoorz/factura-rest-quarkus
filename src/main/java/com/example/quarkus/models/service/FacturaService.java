package com.example.quarkus.models.service;

import com.example.quarkus.models.dao.FacturaRepository;
import com.example.quarkus.models.entity.Factura;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
@AllArgsConstructor
@Slf4j
public class FacturaService {
    @Inject
    FacturaRepository facturaRepository;

    public List<Factura> list(){
        log.info("Accediendo a las facturas...");
        return facturaRepository.findAll().list();
    }
}
