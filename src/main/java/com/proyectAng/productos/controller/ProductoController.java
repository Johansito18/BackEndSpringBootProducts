package com.proyectAng.productos.controller;

import com.proyectAng.productos.model.Producto;
import com.proyectAng.productos.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 *    class name: ProductoController
 *    class description: Controller of the "Producto" class with methods from the "ProductoService" service
 *    class date: 22-03-2023
 *    Developer: Johan
 *    Modification:
 *        date + nameDeveloper + change description
 * */
@RestController
@RequestMapping("/productos")

public class ProductoController {

    @Autowired
    ProductoService productoService;

    /**
     * Description:
     *      Method to create a product
     * Args:
     *      Producto: producto
     * Return:
     *      Return the created product
     * method date:
     *      22-03-2023
     * Developer:
     *      Johan Álvarez
     * Modification:
     *      date + nameDeveloper + change description
     * */
    @PostMapping("/crearProductos")
    public Producto crearProducto(@RequestBody Producto producto){
        return productoService.guardarProducto(producto);
    }

    /**
     * Description:
     *      Method to list all products
     * Args:
     *      Doesn't apply
     * Return:
     *      Return a products Iterable
     * method date:
     *      22-03-2023
     * Developer:
     *      Johan Álvarez
     * Modification:
     *      date + nameDeveloper + change description
     * */
    @GetMapping("/listarProductos")
    public Iterable<Producto> listarProductos(){
        return productoService.obtenerTodosProductos();
    }

    /**
     * Description:
     *      Method to edit a product
     * Args:
     *      Integer: id,
     *      Producto: productoAct
     * Return:
     *      Doesn't apply
     * method date:
     *      22-03-2023
     * Developer:
     *      Johan Álvarez
     * Modification:
     *      date + nameDeveloper + change description
     * */
    @PutMapping("/editarProducto/{id}")
    public void editarProducto(
            @PathVariable Integer id, @RequestBody Producto productoAct){
        Producto product = productoService.buscarPorId(id);

        if (product == null){
            System.out.println("No se encontró el producto");
        }else {
            product.setNombre(productoAct.getNombre());
            product.setDescripcion(productoAct.getDescripcion());
            product.setFecha(productoAct.getFecha());
            productoService.actualizarProducto(product);
        }
    }

    /**
     * Description:
     *      Method to delete a product
     * Args:
     *      Integer: id
     * Return:
     *      Doesn't apply
     * method date:
     *      22-03-2023
     * Developer:
     *      Johan Álvarez
     * Modification:
     *      date + nameDeveloper + change description
     * */
    @DeleteMapping("/eliminarProducto/{id}")
    public void eliminarProducto(@PathVariable Integer id){
        productoService.eliminarProductoPorId(id);
    }

}
