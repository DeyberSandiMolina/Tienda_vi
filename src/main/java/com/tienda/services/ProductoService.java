/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tienda.services;

import com.tienda.domain.Producto;
import java.util.List;

/**
 *
 * @author fabia
 */
public interface ProductoService {
    /*Se recusperan los registro de la table producto en un 
    arrayList de objetos producto. 
    Solo los activos*/
    public List<Producto> getProductos(boolean activos);
    
    
    public Producto getProducto(Producto producto);
    
    public void delete(Producto producto);
    
    public void save(Producto producto);
    
    public List<Producto> consulta1(double precioInf, double precioSup);

    public List<Producto> consulta2(double precioInf, double precioSup);

    public List<Producto> consulta3(double precioInf, double precioSup);

}
