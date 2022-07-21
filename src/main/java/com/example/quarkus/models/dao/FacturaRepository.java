package com.example.quarkus.models.dao;

import com.example.quarkus.models.entity.Factura;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class FacturaRepository implements PanacheRepositoryBase<Factura, Long> {

}
