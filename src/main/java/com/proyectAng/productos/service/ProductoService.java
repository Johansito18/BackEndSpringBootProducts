package com.proyectAng.productos.service;



import com.proyectAng.productos.model.Producto;
import com.proyectAng.productos.repository.IProducto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *    class name: ProductoService
 *    class description: Service of the "Producto" class with methods from the "IProducto" interface
 *    class date: 22-03-2023
 *    Developer: Johan
 *    Modification:
 *        date + nameDeveloper + change description
 * */
@Service
public class ProductoService {
    @Autowired
    IProducto iProducto;

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
    public Iterable<Producto> obtenerTodosProductos() {
        return iProducto.findAll();
    }

    /**
     * Description:
     *      Method to save a product
     * Args:
     *      Producto: producto
     * Return:
     *      Return the saved product
     * method date:
     *      22-03-2023
     * Developer:
     *      Johan Álvarez
     * Modification:
     *      date + nameDeveloper + change description
     * */
    public Producto guardarProducto(Producto producto) {
        return iProducto.save(producto);
    }

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
    public Producto buscarPorId(Integer id){
        return iProducto.findByIdProducto(id);
    }

    /**
     * Description:
     *      Method to update a product
     * Args:
     *      Producto: productoAct
     * Return:
     *      Return the updated product
     * method date:
     *      22-03-2023
     * Developer:
     *      Johan Álvarez
     * Modification:
     *      date + nameDeveloper + change description
     * */
    public Producto actualizarProducto(Producto productoAct){
        return iProducto.save(productoAct);
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
    public void eliminarProductoPorId(Integer id) {
        try {
            iProducto.deleteById(id);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
