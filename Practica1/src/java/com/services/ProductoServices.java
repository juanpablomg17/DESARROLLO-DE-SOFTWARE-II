/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.services;

import com.dao.ImplDao;
import com.entity.Producto;
import com.implDao.IProducto;
import java.io.Serializable;

/**
 *
 * @author Juan Pablo PC
 */
public class ProductoServices extends ImplDao<Producto, Long> implements IProducto, Serializable{
    
    
}
