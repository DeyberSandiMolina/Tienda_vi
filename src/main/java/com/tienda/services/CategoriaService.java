/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tienda.services;

import com.tienda.domain.Categoria;
import java.util.List;

/**
 *
 * @author fabia
 */
public interface CategoriaService {
    /*Se recusperan los registro de la table categoria en un 
    arrayList de objetos categoria. 
    Solo los activos*/
    public List<Categoria> getCategorias(boolean activos);
    
    
    public Categoria getCategoria(Categoria categoria);
    
    public void delete(Categoria categoria);
    
    public void save(Categoria categoria);
}
