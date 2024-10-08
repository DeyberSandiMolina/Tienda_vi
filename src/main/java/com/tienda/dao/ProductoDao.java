/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tienda.dao;

import com.tienda.domain.Producto;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author fabia
 */
public interface ProductoDao extends 
        JpaRepository<Producto,Long>{
    
    public List<Producto> findByPrecioBetweenOrderByDescripcion(double precioInf, double precioSup);
    
    @Query(value="SELECT a FROM Producto a "
    + "WHERE a.precio BETWEEN :precioInf AND :precioSup "
    + "ORDER BY a.descripcion ASC")
    public List<Producto> consulta2(double precioInf, double precioSup);
    
    
    @Query(nativeQuery = true,
        value="SELECT * FROM Producto a "
        + "WHERE a.precio BETWEEN :precioInf AND :precioSup "
        + "ORDER BY a.descripcion ASC")
    public List<Producto> consulta3(double precioInf, double precioSup);
    
}
