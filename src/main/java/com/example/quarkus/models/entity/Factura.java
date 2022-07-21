package com.example.quarkus.models.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity(name = "Factura")
@Data
@Table(name = "FACTURA")
public class Factura {

    @Id
    private Long id;
    @Column(name = "nro_cuenta")
    private String nroCuenta;
    @Column(name = "fecha_emision")
    private Date fechaEmision;
    private Integer contrato;
    private Boolean estado;
    private String nombre;
    private String ci;
    @Column(name = "nro_factura")
    private String nroFactura;
    private Integer monto;

    @Override
    public String toString() {
        return "{" +
                "'id':" + id +
                ", 'nroCuenta':'" + nroCuenta + '\'' +
                ", 'fechaEmision':" + fechaEmision +
                ", 'contrato':" + contrato +
                ", 'estado':" + estado +
                ", 'nombre':'" + nombre + '\'' +
                ", 'ci':'" + ci + '\'' +
                ", 'nroFactura':'" + nroFactura + '\'' +
                ", 'monto':" + monto +
                '}';
    }
}
