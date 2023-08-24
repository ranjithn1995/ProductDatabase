package productdatabase.dao;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import productdatabase.dto.Product;
@Component

public class ProductDao {
@Autowired
EntityManager em;

public void saveProduct(Product p) {
	em.getTransaction().begin();
	em.persist(p);
	em.getTransaction().commit();
}
public Product findProduct(int id)
{
	Product exitproduct = em.find(Product.class,id);
	if(exitproduct !=null) {
		return exitproduct;
		
	}
	else {
		return null;
	}
	}
public Product updateProduct(Product upProduct,int id) {
	Product oldproduct = findProduct(id);
	if(oldproduct!=null) {
		upProduct.setId(id);
		em.getTransaction().begin();
		em.merge(upProduct);
		em.getTransaction().commit();
		return upProduct;
	}
		else {
			return null;
		}
	
}
public void  deleteProduct(int id) {
	Product removeproduct = findProduct(id);
	if(removeproduct!=null) {
		em.getTransaction().begin();
		em.remove(removeproduct);
		em.getTransaction().commit();
	}
	
	
}
public List<Product> displayAllProduct(){
Query p = em.createQuery("select p from Product p");
List<Product>allProducts = p.getResultList();
return allProducts;
	
}

}
