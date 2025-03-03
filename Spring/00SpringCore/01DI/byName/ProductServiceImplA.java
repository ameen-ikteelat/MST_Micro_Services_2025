package di.byName;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;


@Service("A")
public class ProductServiceImplA implements ProductService {

	public List<Product> listProducts() {
		ArrayList<Product> products = new ArrayList<Product>(2);
        products.add(new Product("Product A1"));
        products.add(new Product("Product A2"));
		return products;
	}

}
