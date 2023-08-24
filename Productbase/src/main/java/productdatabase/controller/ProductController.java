package productdatabase.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import productdatabase.dao.ProductDao;
import productdatabase.dto.Product;

@Controller
public class ProductController {
	@Autowired
ProductDao dao;
	@RequestMapping("/addproduct")
	public ModelAndView addProduct() {
		ModelAndView view = new ModelAndView();
		view.setViewName("addproduct.jsp");
		view.addObject("product",new Product());
		return view;
		
	}
	@RequestMapping("/saveproduct")
	public ModelAndView saveProduct(@ModelAttribute Product p) {
		dao.saveProduct(p);
		List<Product> products = dao.displayAllProduct();
		ModelAndView view = new ModelAndView();
		view.setViewName("display.jsp");
		view.addObject("products",products);
		return view;
	}
		@RequestMapping("/delete")
		public ModelAndView deleteProduct(@RequestParam int id) {
			dao.deleteProduct(id);
			List<Product> products = dao.displayAllProduct();
			ModelAndView view = new ModelAndView();
			view.setViewName("display.jsp");
			view.addObject("products",products);
			return view;	
}
		@RequestMapping("/edit")
		public ModelAndView edit(@RequestParam int id) {
			Product exipro = dao.findProduct(id);
			ModelAndView view = new ModelAndView();
			view.setViewName("edit.jsp");
			view.addObject("product",exipro);
			return view;
		}
		@RequestMapping("/update")
		public ModelAndView update(@ModelAttribute Product p) {
			dao.updateProduct(p, p.getId());
			List<Product> products = dao.displayAllProduct();
			ModelAndView view = new ModelAndView();
			view.setViewName("display.jsp");
			view.addObject("products",products);
			return view;	
			
		}
}
		
		
		
		
		
		
		
		
		
		
		
	
