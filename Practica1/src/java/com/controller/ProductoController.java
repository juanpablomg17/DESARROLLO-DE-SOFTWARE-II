/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.entity.Producto;
import com.services.ProductoServices;
import java.util.LinkedList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Juan Pablo PC
 */
@ManagedBean
@SessionScoped
public class ProductoController {

    // entidades de negocio
    private Producto producto = new Producto();
    
     // servicios
     ProductoServices proser = new ProductoServices();
    
    // colecciones
    private List<Producto> productos = new LinkedList();
    
   
    
    /**
     * Creates a new instance of ProductoController
     */
    public ProductoController() {
        
    }
    
    public void consultar(Producto p){
        setProducto(p);
        
    }
    
    public void deshabilitar(Producto p){
        p.setEstado("Inactivo");
        p = proser.modificar(p);
        obtenerProductos();
        
    }
    
    
    
    
    public void registrar(){
        
        getProducto().setEstado("Activo");
        proser.crear(getProducto());
        setProducto(new Producto());
        obtenerProductos();
        
        
    }
    
    public void obtenerProductos(){
        setProductos(proser.consultarTodo(Producto.class));
        
    }

    /**
     * @return the producto
     */
    public Producto getProducto() {
        return producto;
    }

    /**
     * @param producto the producto to set
     */
    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    /**
     * @return the productos
     */
    public List<Producto> getProductos() {
        return productos;
    }

    /**
     * @param productos the productos to set
     */
    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

 
    
    
}
