package Service;

import repository.productrepository.ProductRepository;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import model.Product;
import repository.productrepository;

public class ProductService 
	{
		@Autowired
		private ProductRepository productRepository;
		
		public List<Product> findAll() {
			return productRepository.findAll();
		}
		public List<String> findById(long id) {
			return productRepository.findDistinctBrands();
		}
		public List<String> findDistinctCategories() {
			return productRepository.findDistinctCategories();
		}
		public void save(Product product) {
			productRepository.save(product);
		}
		
		public void deletById(long id) {
			productRepository.deleteById(id);
		}
		public List<Product> findBybrandAndOrCategory(String brand, String category){
				if(category == null && brand == null)
					return productRepository.findAll();
				else if(category == null)
					return productRepository.findBybrand(brand);
				else if(brand == null)
					return productRepository.findByCategory(category);
				else return productRepository.findByBrandAndCategory(brand,category);
		}
	}
	