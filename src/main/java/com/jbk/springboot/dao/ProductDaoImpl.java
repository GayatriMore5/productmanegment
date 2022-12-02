package com.jbk.springboot.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.jbk.springboot.model.Product;

@Repository
public class ProductDaoImpl implements ProductDao {

	List<Product> list = new ArrayList<>();

	public ProductDaoImpl() {
		list.add(new Product(1, "Pen", 10, 5, "Stationary"));
		list.add(new Product(2, "Pencile", 15, 5, "Stationary"));
		list.add(new Product(3, "Book", 45, 26, "Stationary"));
		list.add(new Product(4, "Notebook", 20, 25, "Stationary"));
		list.add(new Product(5, "Mobile", 2, 50000, "Electronics"));
	}

	@Override
	public boolean saveProduct(Product product) {
		list.add(product);

		return true;
	}

	@Override
	public List<Product> getAllProduct() {
		return list;
	}

	@Override
	public Product getProductById(int productId) {
		Product product = null;
		for (Product prd : list) {
			if (prd.getProductId() == productId) {
				product = prd;
				break;
			}
		}
		return product;
	}

	@Override
	public boolean deleteProduct(int productId) {
		boolean isDeleted = false;
		for (Product product : list) {
			if (product.getProductId() == productId) {
				list.remove(product);
				isDeleted = true;
				break;
			}
		}
		return isDeleted;
	}

	@Override
	public boolean updateProduct(Product product) {
		boolean isUpdated = false;
		for (Product prd : list) {
			if (prd.getProductId() == product.getProductId()) {
				list.set(list.indexOf(prd), product);
				isUpdated = true;
				break;
			}
		}
		return isUpdated;
	}

}
