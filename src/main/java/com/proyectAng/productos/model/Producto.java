package com.proyectAng.productos.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
/**
 *    class name: Producto
 *    class description: Table model "productos"
 *    class date: 22-03-2023
 *    Developer: Johan Álvarez
 *    Modification:
 *        date + nameDeveloper + change description
 * */
@AllArgsConstructor //Constructor with arguments
@NoArgsConstructor  //Constructor without arguments
@Getter             //Getters to retrieve the data value
@Setter             //Getters to change the data value
@Entity             //Decorator to indicate that the "Producto" class is a database entity
@Table(name = "productos")
public class Producto implements Serializable {
    private static final Long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto", nullable = false)
    private Integer idProducto;
    @Column(nullable = false, length = 20)
    private String nombre;
    private String descripcion;
    private String fecha;



}
