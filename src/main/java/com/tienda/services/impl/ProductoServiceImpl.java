/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.services.impl;

import com.tienda.dao.ProductoDao;
import com.tienda.domain.Producto;
import com.tienda.services.ProductoService;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author fabia
 */
@Service
public class ProductoServiceImpl 
        implements ProductoService{
    
    @Autowired
    private ProductoDao productoDao;
    
    @Override   
    public List<Producto> getProductos(boolean activos) {
        var lista = productoDao.findAll();
        
        if (activos){
            lista.removeIf(c -> !c.isActivo());
        }
        
        return lista;
    }

    @Override
    
    public Producto getProducto(Producto producto) {
        return productoDao.findById(producto.getIdProducto()).orElse(null);
    }

    @Override
    public void delete(Producto producto) {
        productoDao.delete(producto);
    }

    @Override
    @Transactional
    public void save(Producto producto) {
        productoDao.save(producto);
    }

    @Override
    public List<Producto> consulta1(double precioInf, double precioSup) {
      return productoDao.findByPrecioBetweenOrderByDescripcion(precioInf, precioSup);
    
    }
    
    @Override
    public List<Producto> consulta2(double precioInf, double precioSup) {
      return productoDao.consulta2(precioInf, precioSup);
    
    }
    
    @Override
    public List<Producto> consulta3(double precioInf, double precioSup) {
      return productoDao.consulta3(precioInf, precioSup);
    
    }
    
}
