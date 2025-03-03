package di.byName;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller("prodController")
public class ProdController {
	
	@Autowired
	@Qualifier("B")
	 private ProductService productService;
	 
	    
	    public void setProductService(ProductService productService) {
	        this.productService = productService;
	    }
	 
	    
	    public List<Product> getProducts(){
	        return productService.listProducts();
	    }
}
