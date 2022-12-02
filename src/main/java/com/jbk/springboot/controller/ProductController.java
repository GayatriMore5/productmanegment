package com.jbk.springboot.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.jbk.springboot.model.Product;
import com.jbk.springboot.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	ProductService service;
	
	
	@PostMapping(value ="/saveProduct")
	public boolean saveProduct(@RequestBody Product product) {
		System.out.println(product);
		boolean isAdded = service.saveProduct(product);
		return isAdded;
	}
	
    @GetMapping(value ="/getAllProduct")
	public List<Product> getAllProduct(){
		List<Product> list =service.getAllProduct();
		return list; 
	}

    @GetMapping(value ="/getProductById")
   	public Product getProductById(@RequestParam int productId){
   		Product product =service.getProductById(productId);
   		return product; 
   	}

    @DeleteMapping(value ="/deleteProduct")
   	public boolean deleteProduct(@RequestParam int productId){
   	boolean isDeleted = service.deleteProduct(productId);
   		return isDeleted; 
   	}
    
    @PutMapping(value ="/updateProduct")
    public boolean updateProduct(@RequestBody Product prodct) {
    boolean isUpdated = service.updateProduct(prodct);
		return isUpdated;
    	
    }
    
    @GetMapping(value ="/sortProducts")
	public List<Product> sortProducts(@RequestParam String sortBy){
		List<Product> list =service.sortProducts(sortBy);
		return list; 
	}
    
    @GetMapping(value ="/getMaxPriceProducts")
    public Product getMaxPriceProducts() {
    	
		return null;
    	
    }
    
    
    
    
    
    
    
    
    
         
}
