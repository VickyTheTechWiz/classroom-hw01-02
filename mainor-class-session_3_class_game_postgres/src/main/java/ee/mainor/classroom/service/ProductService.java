package ee.mainor.classroom.service;

import ee.mainor.classroom.dto.ProductDto;
import ee.mainor.classroom.model.Product;
import ee.mainor.classroom.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    @Transactional
    public Long createProduct(ProductDto productCreateRequest) {
        Product product = new Product();
        product.setName(productCreateRequest.getName());
        product.setPrice(productCreateRequest.getPrice());

        return productRepository.save(product).getId();
    }

    public ProductDto getProduct(Long productId) {
        Product product = productRepository.findById(productId)
                .orElseThrow(() -> new RuntimeException("Product not found with ID: " + productId));

        ProductDto productResponse = new ProductDto();
        productResponse.setId(product.getId());
        productResponse.setName(product.getName());
        productResponse.setPrice(product.getPrice());

        return productResponse;
    }

    public List<ProductDto> getAllProducts() {
        return productRepository.findAll()
                .stream()
                .map(product -> new ProductDto().setId(product.getId())
                        .setName(product.getName())
                        .setPrice(product.getPrice()))
                .toList();
    }
}
