package ee.mainor.classroom.web;

import ee.mainor.classroom.dto.ProductDto;
import ee.mainor.classroom.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping
    // TODO migrate to return dto
    public Long createProduct(@RequestBody ProductDto productCreateRequest) {
        return productService.createProduct(productCreateRequest);
    }

    @GetMapping("{productId}")
    public ProductDto getProduct(@PathVariable Long productId) {
        return productService.getProduct(productId);
    }

    @GetMapping
    public List<ProductDto> getAllProducts() {
        return productService.getAllProducts();
    }
}
