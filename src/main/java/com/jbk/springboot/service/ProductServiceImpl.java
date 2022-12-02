package com.jbk.springboot.service;


import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.jbk.springboot.dao.ProductDao;
import com.jbk.springboot.model.Product;
import com.jbk.springboot.sort.ProductIdComparator;
import com.jbk.springboot.sort.ProductNameComparator;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductDao dao;

	@Override
	public boolean saveProduct(Product product) {
		boolean isAdded = dao.saveProduct(product);
		return isAdded;
	}

	@Override
	public List<Product> getAllProduct() {
		List<Product> list =dao.getAllProduct();
		return list;
	}

	@Override
	public Product getProductById(int productId) {
		Product product = dao.getProductById(productId);
		return product;
	}

	@Override
	public boolean deleteProduct(int productId) {
	boolean isdeleted = dao.deleteProduct(productId);
		return isdeleted;
	}

	@Override
	public boolean updateProduct(Product product) {
		boolean isUpdated = dao.updateProduct(product);
		return isUpdated;
	}

	@Override
	public List<Product> sortProducts(String sortBy) {
		
		List<Product> list = getAllProduct();
		if(sortBy.equalsIgnoreCase("productName")) {
		Collections.sort(list, new ProductNameComparator());
		Collections.reverse(list);
		}
		else if(sortBy.equalsIgnoreCase("productId")) {
			Collections.sort(list, new ProductIdComparator());
			}
		return list;
	}
	
//	public Product getMaxPriceProducts() {
//	List<Product> allProduct = getAllProduct();
//	Product product = allProduct
//			.stream();
//		    .max(Comparator.comparingDouble(Product::getProductPrice));
//		    .get();
//		return product;
//				
//	}

}
