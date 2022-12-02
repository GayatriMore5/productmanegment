package com.jbk.springboot.dao;

import java.util.List;

import com.jbk.springboot.model.Product;

public interface ProductDao {
	
	public boolean saveProduct(Product product);
	public List<Product> getAllProduct();
	public Product getProductById(int productId);
	public boolean deleteProduct(int productId);
	public boolean updateProduct(Product product);
	
	
}
