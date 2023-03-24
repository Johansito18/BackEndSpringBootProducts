package com.proyectAng.productos.repository;

import com.proyectAng.productos.model.Producto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *    Interface name: IProducto
 *    Interface description: Repository of the "Product" class with CrudRepository
 *    Interface date: 22-03-2023
 *    Developer: Johan Alvarez
 *    Modification:
 *        date + nameDeveloper + change description
 * */
@Repository
public interface IProducto extends CrudRepository<Producto, Integer> {

    /**
     * Description:
     *      Method to find a product by id
     * Args:
     *      Integer: id
     * Return:
     *      Return the filtered product
     * method date:
     *      22-03-2023
     * Developer:
     *      Johan Álvarez
     * Modification:
     *      date + nameDeveloper + change description
     * */
    Producto findByIdProducto(Integer id);

}
